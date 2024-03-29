// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

public class WhyResults {
    @JsonValue
    private List<WhyResult> value;

    public WhyResults() {
    }

    @JsonCreator
    public WhyResults(List<WhyResult> value) {
        this.value = value;
    }

    public List<WhyResult> getValue() {
        return value;
    }

    public void setValue(List<WhyResult> value) {
        this.value = value;
    }
}
