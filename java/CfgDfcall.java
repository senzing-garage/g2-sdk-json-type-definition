// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class CfgDfcall {
    @JsonProperty("DFCALL_ID")
    private Integer dfcallId;

    @JsonProperty("DFUNC_ID")
    private Integer dfuncId;

    @JsonProperty("EXEC_ORDER")
    private Integer execOrder;

    @JsonProperty("FTYPE_ID")
    private Integer ftypeId;

    public CfgDfcall() {
    }

    /**
     * Getter for dfcallId.<p>
     */
    public Integer getDfcallId() {
        return dfcallId;
    }

    /**
     * Setter for dfcallId.<p>
     */
    public void setDfcallId(Integer dfcallId) {
        this.dfcallId = dfcallId;
    }

    /**
     * Getter for dfuncId.<p>
     */
    public Integer getDfuncId() {
        return dfuncId;
    }

    /**
     * Setter for dfuncId.<p>
     */
    public void setDfuncId(Integer dfuncId) {
        this.dfuncId = dfuncId;
    }

    /**
     * Getter for execOrder.<p>
     */
    public Integer getExecOrder() {
        return execOrder;
    }

    /**
     * Setter for execOrder.<p>
     */
    public void setExecOrder(Integer execOrder) {
        this.execOrder = execOrder;
    }

    /**
     * Getter for ftypeId.<p>
     */
    public Integer getFtypeId() {
        return ftypeId;
    }

    /**
     * Setter for ftypeId.<p>
     */
    public void setFtypeId(Integer ftypeId) {
        this.ftypeId = ftypeId;
    }
}
