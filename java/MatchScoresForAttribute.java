// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

/**
 * No description.
 */
public class MatchScoresForAttribute {
    @JsonValue
    private List<MatchScoreForAttribute> value;

    public MatchScoresForAttribute() {
    }

    @JsonCreator
    public MatchScoresForAttribute(List<MatchScoreForAttribute> value) {
        this.value = value;
    }

    public List<MatchScoreForAttribute> getValue() {
        return value;
    }

    public void setValue(List<MatchScoreForAttribute> value) {
        this.value = value;
    }
}
