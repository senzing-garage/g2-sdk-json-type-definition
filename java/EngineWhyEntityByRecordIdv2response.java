// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * No description.
 */
public class EngineWhyEntityByRecordIdv2response {
    @JsonValue
    private WhyEntity value;

    public EngineWhyEntityByRecordIdv2response() {
    }

    @JsonCreator
    public EngineWhyEntityByRecordIdv2response(WhyEntity value) {
        this.value = value;
    }

    public WhyEntity getValue() {
        return value;
    }

    public void setValue(WhyEntity value) {
        this.value = value;
    }
}
