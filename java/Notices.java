// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

/**
 * No description.
 */
public class Notices {
    @JsonValue
    private List<Notice> value;

    public Notices() {
    }

    @JsonCreator
    public Notices(List<Notice> value) {
        this.value = value;
    }

    public List<Notice> getValue() {
        return value;
    }

    public void setValue(List<Notice> value) {
        this.value = value;
    }
}