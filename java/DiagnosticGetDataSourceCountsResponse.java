// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

/**
 * No description.
 */
public class DiagnosticGetDataSourceCountsResponse {
    @JsonValue
    private List<DiagnosticGetDataSourceCountsResponse0> value;

    public DiagnosticGetDataSourceCountsResponse() {
    }

    @JsonCreator
    public DiagnosticGetDataSourceCountsResponse(List<DiagnosticGetDataSourceCountsResponse0> value) {
        this.value = value;
    }

    public List<DiagnosticGetDataSourceCountsResponse0> getValue() {
        return value;
    }

    public void setValue(List<DiagnosticGetDataSourceCountsResponse0> value) {
        this.value = value;
    }
}
