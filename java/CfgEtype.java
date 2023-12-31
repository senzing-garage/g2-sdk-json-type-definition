// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class CfgEtype {
    @JsonProperty("ECLASS_ID")
    private Integer eclassId;

    @JsonProperty("ETYPE_CODE")
    private String etypeCode;

    @JsonProperty("ETYPE_DESC")
    private String etypeDesc;

    @JsonProperty("ETYPE_ID")
    private Integer etypeId;

    public CfgEtype() {
    }

    /**
     * Getter for eclassId.<p>
     * No description.
     */
    public Integer getEclassId() {
        return eclassId;
    }

    /**
     * Setter for eclassId.<p>
     * No description.
     */
    public void setEclassId(Integer eclassId) {
        this.eclassId = eclassId;
    }

    /**
     * Getter for etypeCode.<p>
     * No description.
     */
    public String getEtypeCode() {
        return etypeCode;
    }

    /**
     * Setter for etypeCode.<p>
     * No description.
     */
    public void setEtypeCode(String etypeCode) {
        this.etypeCode = etypeCode;
    }

    /**
     * Getter for etypeDesc.<p>
     * No description.
     */
    public String getEtypeDesc() {
        return etypeDesc;
    }

    /**
     * Setter for etypeDesc.<p>
     * No description.
     */
    public void setEtypeDesc(String etypeDesc) {
        this.etypeDesc = etypeDesc;
    }

    /**
     * Getter for etypeId.<p>
     * No description.
     */
    public Integer getEtypeId() {
        return etypeId;
    }

    /**
     * Setter for etypeId.<p>
     * No description.
     */
    public void setEtypeId(Integer etypeId) {
        this.etypeId = etypeId;
    }
}
