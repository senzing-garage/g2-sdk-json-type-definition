// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class SzDiagnosticCheckDatabasePerformanceResponse {
    @JsonValue
    private CheckDatabasePerformance value;

    public SzDiagnosticCheckDatabasePerformanceResponse() {
    }

    @JsonCreator
    public SzDiagnosticCheckDatabasePerformanceResponse(CheckDatabasePerformance value) {
        this.value = value;
    }

    public CheckDatabasePerformance getValue() {
        return value;
    }

    public void setValue(CheckDatabasePerformance value) {
        this.value = value;
    }
}
