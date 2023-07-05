# Makefile for g2-sdk-json-type-definition.

# "Simple expanded" variables (':=')

# PROGRAM_NAME is the name of the GIT repository.
PROGRAM_NAME := $(shell basename `git rev-parse --show-toplevel`)
MAKEFILE_PATH := $(abspath $(lastword $(MAKEFILE_LIST)))
MAKEFILE_DIRECTORY := $(dir $(MAKEFILE_PATH))
TARGET_DIRECTORY := $(MAKEFILE_DIRECTORY)/target
BUILD_VERSION := $(shell git describe --always --tags --abbrev=0 --dirty  | sed 's/v//')
BUILD_TAG := $(shell git describe --always --tags --abbrev=0  | sed 's/v//')
BUILD_ITERATION := $(shell git log $(BUILD_TAG)..HEAD --oneline | wc -l | sed 's/^ *//')
GIT_REMOTE_URL := $(shell git config --get remote.origin.url)
GO_PACKAGE_NAME := $(shell echo $(GIT_REMOTE_URL) | sed -e 's|^git@github.com:|github.com/|' -e 's|\.git$$||' -e 's|Senzing|senzing|')

# Recursive assignment ('=')

# Conditional assignment. ('?=')
# Can be overridden with "export"
# Example: "export LD_LIBRARY_PATH=/path/to/my/senzing/g2/lib"

# Export environment variables.

.EXPORT_ALL_VARIABLES:

# The first "make" target runs as default.

.PHONY: default
default: help

# -----------------------------------------------------------------------------
# Build
# -----------------------------------------------------------------------------

.PHONY: dependencies
dependencies:
	@go get -u ./...
	@go get -t -u ./...
	@go mod tidy


.PHONY: build
build: clean build-csharp build-go build-java build-python build-ruby build-rust build-typescript


.PHONY: build-csharp
build-csharp:
	jtd-codegen \
		--csharp-system-text-namespace Senzing \
		--csharp-system-text-out ./csharp \
		--root-name senzingapi \
		senzingapi-RFC8927.json


.PHONY: build-go
build-go:
	jtd-codegen \
		--go-out ./go/typedef \
		--go-package typedef \
		--root-name senzingapi \
		senzingapi-RFC8927.json


.PHONY: build-java
build-java:
	jtd-codegen \
		--java-jackson-out ./java \
		--java-jackson-package com.senzing.schema \
		--root-name senzingapi \
		senzingapi-RFC8927.json


.PHONY: build-python
build-python:
	jtd-codegen \
		--python-out ./python/typedef \
		--root-name senzingapi \
		senzingapi-RFC8927.json


.PHONY: build-ruby
build-ruby:
	jtd-codegen \
		--root-name senzingapi \
		--ruby-module SenzingTypeDef \
		--ruby-out ./ruby \
		--ruby-sig-module SenzingSig \
		senzingapi-RFC8927.json


.PHONY: build-rust
build-rust:
	jtd-codegen \
		--root-name senzingapi \
		--rust-out ./rust \
		senzingapi-RFC8927.json


.PHONY: build-typescript
build-typescript:
	jtd-codegen \
		--root-name senzingapi \
		--typescript-out ./typescript \
		senzingapi-RFC8927.json

# -----------------------------------------------------------------------------
# Analyze
# -----------------------------------------------------------------------------

.PHONY: analyze
analyze:
	@./bin/analyze_rfc8927.py

.PHONY: pretty-print
pretty-print:
	@./bin/pretty-print.py

# -----------------------------------------------------------------------------
# Generate
# -----------------------------------------------------------------------------

.PHONY: generate-go-typedef_test
generate-go-typedef_test:
	@rm ./go/typedef/typedef_test.go
	@./bin/generate-go-typedef_test.py

# -----------------------------------------------------------------------------
# Test
# -----------------------------------------------------------------------------

.PHONY: build-and-test
build-and-test: build-python build-go generate-go-typedef_test
	@./test.py
	@go test -v -p 1 ./...


.PHONY: test
test:
	@./test.py
	@go test -v -p 1 ./...

# -----------------------------------------------------------------------------
# Clean
# -----------------------------------------------------------------------------

.PHONY: clean-csharp
clean-csharp:
	@rm $(MAKEFILE_DIRECTORY)csharp/* || true


.PHONY: clean-go
clean-go:
	@go clean -cache
	@go clean -testcache
	@rm -f $(GOPATH)/bin/$(PROGRAM_NAME) || true
	@rm $(MAKEFILE_DIRECTORY)go/typedef/typedef.go || true


.PHONY: clean-java
clean-java:
	@rm $(MAKEFILE_DIRECTORY)java/* || true


.PHONY: clean-python
clean-python:
	@rm $(MAKEFILE_DIRECTORY)python/typedef/* || true


.PHONY: clean-ruby
clean-ruby:
	@rm $(MAKEFILE_DIRECTORY)ruby/* || true


.PHONY: clean-rust
clean-rust:
	@rm $(MAKEFILE_DIRECTORY)rust/* || true


.PHONY: clean-typescript
clean-typescript:
	@rm $(MAKEFILE_DIRECTORY)typescript/* || true


.PHONY: clean
clean: clean-csharp clean-go clean-java clean-python clean-ruby clean-rust clean-typescript
	@rm -rf $(TARGET_DIRECTORY) || true


# -----------------------------------------------------------------------------
# Utility targets
# -----------------------------------------------------------------------------

.PHONY: update-pkg-cache
update-pkg-cache:
	@GOPROXY=https://proxy.golang.org GO111MODULE=on \
		go get $(GO_PACKAGE_NAME)@$(BUILD_TAG)


.PHONY: print-make-variables
print-make-variables:
	@$(foreach V,$(sort $(.VARIABLES)), \
		$(if $(filter-out environment% default automatic, \
		$(origin $V)),$(warning $V=$($V) ($(value $V)))))


.PHONY: help
help:
	@echo "Build $(PROGRAM_NAME) version $(BUILD_VERSION)-$(BUILD_ITERATION)".
	@echo "All targets:"
	@$(MAKE) -pRrq -f $(lastword $(MAKEFILE_LIST)) : 2>/dev/null | awk -v RS= -F: '/^# File/,/^# Finished Make data base/ {if ($$1 !~ "^[#.]") {print $$1}}' | sort | egrep -v -e '^[^[:alnum:]]' -e '^$@$$' | xargs