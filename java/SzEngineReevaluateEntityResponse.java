// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class SzEngineReevaluateEntityResponse {
    @JsonValue
    private WithInfo value;

    public SzEngineReevaluateEntityResponse() {
    }

    @JsonCreator
    public SzEngineReevaluateEntityResponse(WithInfo value) {
        this.value = value;
    }

    public WithInfo getValue() {
        return value;
    }

    public void setValue(WithInfo value) {
        this.value = value;
    }
}
