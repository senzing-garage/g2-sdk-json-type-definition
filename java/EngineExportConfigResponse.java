// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class EngineExportConfigResponse {
    @JsonProperty("G2_CONFIG")
    private G2config g2Config;

    public EngineExportConfigResponse() {
    }

    /**
     * Getter for g2Config.<p>
     * No description.
     */
    public G2config getG2Config() {
        return g2Config;
    }

    /**
     * Setter for g2Config.<p>
     * No description.
     */
    public void setG2Config(G2config g2Config) {
        this.g2Config = g2Config;
    }
}
