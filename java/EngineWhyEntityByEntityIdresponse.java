// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * No description.
 */
public class EngineWhyEntityByEntityIdresponse {
    @JsonValue
    private WhyEntity value;

    public EngineWhyEntityByEntityIdresponse() {
    }

    @JsonCreator
    public EngineWhyEntityByEntityIdresponse(WhyEntity value) {
        this.value = value;
    }

    public WhyEntity getValue() {
        return value;
    }

    public void setValue(WhyEntity value) {
        this.value = value;
    }
}
