// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class SzEngineFetchNextResponse {
    @JsonValue
    private FixmeUnknown value;

    public SzEngineFetchNextResponse() {
    }

    @JsonCreator
    public SzEngineFetchNextResponse(FixmeUnknown value) {
        this.value = value;
    }

    public FixmeUnknown getValue() {
        return value;
    }

    public void setValue(FixmeUnknown value) {
        this.value = value;
    }
}
