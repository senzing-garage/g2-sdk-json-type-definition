// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class DiagnosticGetResolutionStatisticsResponseRawMatchKeys {
    @JsonProperty("MATCH_KEY")
    private String matchKey;

    public DiagnosticGetResolutionStatisticsResponseRawMatchKeys() {
    }

    /**
     * Getter for matchKey.<p>
     * No description.
     */
    public String getMatchKey() {
        return matchKey;
    }

    /**
     * Setter for matchKey.<p>
     * No description.
     */
    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }
}