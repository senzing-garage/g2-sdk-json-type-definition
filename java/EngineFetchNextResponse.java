// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * No description.
 */
public class EngineFetchNextResponse {
    @JsonValue
    private Object value;

    public EngineFetchNextResponse() {
    }

    @JsonCreator
    public EngineFetchNextResponse(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
