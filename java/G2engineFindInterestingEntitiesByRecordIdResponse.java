// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class G2engineFindInterestingEntitiesByRecordIdResponse {
    @JsonValue
    private Interesting value;

    public G2engineFindInterestingEntitiesByRecordIdResponse() {
    }

    @JsonCreator
    public G2engineFindInterestingEntitiesByRecordIdResponse(Interesting value) {
        this.value = value;
    }

    public Interesting getValue() {
        return value;
    }

    public void setValue(Interesting value) {
        this.value = value;
    }
}