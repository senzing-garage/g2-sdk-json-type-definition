// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * No description.
 */
public class EngineGetRecordV2response {
    @JsonValue
    private Record value;

    public EngineGetRecordV2response() {
    }

    @JsonCreator
    public EngineGetRecordV2response(Record value) {
        this.value = value;
    }

    public Record getValue() {
        return value;
    }

    public void setValue(Record value) {
        this.value = value;
    }
}
