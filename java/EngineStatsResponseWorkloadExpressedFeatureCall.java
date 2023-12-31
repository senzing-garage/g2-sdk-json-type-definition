// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class EngineStatsResponseWorkloadExpressedFeatureCall {
    @JsonProperty("EFCALL_ID")
    private Integer efcallId;

    @JsonProperty("EFUNC_CODE")
    private String efuncCode;

    @JsonProperty("numCalls")
    private Integer numCalls;

    public EngineStatsResponseWorkloadExpressedFeatureCall() {
    }

    /**
     * Getter for efcallId.<p>
     * No description.
     */
    public Integer getEfcallId() {
        return efcallId;
    }

    /**
     * Setter for efcallId.<p>
     * No description.
     */
    public void setEfcallId(Integer efcallId) {
        this.efcallId = efcallId;
    }

    /**
     * Getter for efuncCode.<p>
     * No description.
     */
    public String getEfuncCode() {
        return efuncCode;
    }

    /**
     * Setter for efuncCode.<p>
     * No description.
     */
    public void setEfuncCode(String efuncCode) {
        this.efuncCode = efuncCode;
    }

    /**
     * Getter for numCalls.<p>
     * No description.
     */
    public Integer getNumCalls() {
        return numCalls;
    }

    /**
     * Setter for numCalls.<p>
     * No description.
     */
    public void setNumCalls(Integer numCalls) {
        this.numCalls = numCalls;
    }
}
