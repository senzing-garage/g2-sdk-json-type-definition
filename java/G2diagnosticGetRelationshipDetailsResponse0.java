// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class G2diagnosticGetRelationshipDetailsResponse0 {
    @JsonProperty("ERRULE_CODE")
    private String erruleCode;

    @JsonProperty("FEAT_DESC")
    private String featDesc;

    @JsonProperty("FTYPE_CODE")
    private String ftypeCode;

    @JsonProperty("MATCH_KEY")
    private String matchKey;

    @JsonProperty("RES_ENT_ID")
    private Integer resEntId;

    public G2diagnosticGetRelationshipDetailsResponse0() {
    }

    /**
     * Getter for erruleCode.<p>
     */
    public String getErruleCode() {
        return erruleCode;
    }

    /**
     * Setter for erruleCode.<p>
     */
    public void setErruleCode(String erruleCode) {
        this.erruleCode = erruleCode;
    }

    /**
     * Getter for featDesc.<p>
     */
    public String getFeatDesc() {
        return featDesc;
    }

    /**
     * Setter for featDesc.<p>
     */
    public void setFeatDesc(String featDesc) {
        this.featDesc = featDesc;
    }

    /**
     * Getter for ftypeCode.<p>
     */
    public String getFtypeCode() {
        return ftypeCode;
    }

    /**
     * Setter for ftypeCode.<p>
     */
    public void setFtypeCode(String ftypeCode) {
        this.ftypeCode = ftypeCode;
    }

    /**
     * Getter for matchKey.<p>
     */
    public String getMatchKey() {
        return matchKey;
    }

    /**
     * Setter for matchKey.<p>
     */
    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }

    /**
     * Getter for resEntId.<p>
     */
    public Integer getResEntId() {
        return resEntId;
    }

    /**
     * Setter for resEntId.<p>
     */
    public void setResEntId(Integer resEntId) {
        this.resEntId = resEntId;
    }
}