// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class SzConfigGetDataSourcesResponse {
    @JsonValue
    private GetDataSources value;

    public SzConfigGetDataSourcesResponse() {
    }

    @JsonCreator
    public SzConfigGetDataSourcesResponse(GetDataSources value) {
        this.value = value;
    }

    public GetDataSources getValue() {
        return value;
    }

    public void setValue(GetDataSources value) {
        this.value = value;
    }
}