// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class G2configmgrGetConfigResponse {
    @JsonValue
    private GetConfig value;

    public G2configmgrGetConfigResponse() {
    }

    @JsonCreator
    public G2configmgrGetConfigResponse(GetConfig value) {
        this.value = value;
    }

    public GetConfig getValue() {
        return value;
    }

    public void setValue(GetConfig value) {
        this.value = value;
    }
}
