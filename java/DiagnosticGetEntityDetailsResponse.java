// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

/**
 * No description.
 */
public class DiagnosticGetEntityDetailsResponse {
    @JsonValue
    private List<DiagnosticGetEntityDetailsResponse0> value;

    public DiagnosticGetEntityDetailsResponse() {
    }

    @JsonCreator
    public DiagnosticGetEntityDetailsResponse(List<DiagnosticGetEntityDetailsResponse0> value) {
        this.value = value;
    }

    public List<DiagnosticGetEntityDetailsResponse0> getValue() {
        return value;
    }

    public void setValue(List<DiagnosticGetEntityDetailsResponse0> value) {
        this.value = value;
    }
}
