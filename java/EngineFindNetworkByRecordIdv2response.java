// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * No description.
 */
public class EngineFindNetworkByRecordIdv2response {
    @JsonValue
    private Network value;

    public EngineFindNetworkByRecordIdv2response() {
    }

    @JsonCreator
    public EngineFindNetworkByRecordIdv2response(Network value) {
        this.value = value;
    }

    public Network getValue() {
        return value;
    }

    public void setValue(Network value) {
        this.value = value;
    }
}
