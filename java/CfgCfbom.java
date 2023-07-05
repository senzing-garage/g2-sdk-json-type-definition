// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class CfgCfbom {
    @JsonProperty("CFCALL_ID")
    private Integer cfcallId;

    @JsonProperty("EXEC_ORDER")
    private Integer execOrder;

    @JsonProperty("FELEM_ID")
    private Integer felemId;

    @JsonProperty("FTYPE_ID")
    private Integer ftypeId;

    public CfgCfbom() {
    }

    /**
     * Getter for cfcallId.<p>
     * No description.
     */
    public Integer getCfcallId() {
        return cfcallId;
    }

    /**
     * Setter for cfcallId.<p>
     * No description.
     */
    public void setCfcallId(Integer cfcallId) {
        this.cfcallId = cfcallId;
    }

    /**
     * Getter for execOrder.<p>
     * No description.
     */
    public Integer getExecOrder() {
        return execOrder;
    }

    /**
     * Setter for execOrder.<p>
     * No description.
     */
    public void setExecOrder(Integer execOrder) {
        this.execOrder = execOrder;
    }

    /**
     * Getter for felemId.<p>
     * No description.
     */
    public Integer getFelemId() {
        return felemId;
    }

    /**
     * Setter for felemId.<p>
     * No description.
     */
    public void setFelemId(Integer felemId) {
        this.felemId = felemId;
    }

    /**
     * Getter for ftypeId.<p>
     * No description.
     */
    public Integer getFtypeId() {
        return ftypeId;
    }

    /**
     * Setter for ftypeId.<p>
     * No description.
     */
    public void setFtypeId(Integer ftypeId) {
        this.ftypeId = ftypeId;
    }
}