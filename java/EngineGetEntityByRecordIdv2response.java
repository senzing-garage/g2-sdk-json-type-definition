// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * No description.
 */
public class EngineGetEntityByRecordIdv2response {
    @JsonValue
    private Entity value;

    public EngineGetEntityByRecordIdv2response() {
    }

    @JsonCreator
    public EngineGetEntityByRecordIdv2response(Entity value) {
        this.value = value;
    }

    public Entity getValue() {
        return value;
    }

    public void setValue(Entity value) {
        this.value = value;
    }
}
