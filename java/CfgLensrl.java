// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

/**
 * No description.
 */
public class CfgLensrl {
    @JsonValue
    private List<Object> value;

    public CfgLensrl() {
    }

    @JsonCreator
    public CfgLensrl(List<Object> value) {
        this.value = value;
    }

    public List<Object> getValue() {
        return value;
    }

    public void setValue(List<Object> value) {
        this.value = value;
    }
}
