// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class G2diagnosticGetEntityResumeResponse0 {
    @JsonProperty("DSRC_CODE")
    private String dsrcCode;

    @JsonProperty("ENT_SRC_DESC")
    private String entSrcDesc;

    @JsonProperty("ERRULE_CODE")
    private String erruleCode;

    @JsonProperty("ETYPE_CODE")
    private String etypeCode;

    @JsonProperty("JSON_DATA")
    private String jsonData;

    @JsonProperty("MATCH_KEY")
    private String matchKey;

    @JsonProperty("RECORD_ID")
    private String recordId;

    @JsonProperty("REL_ENT_ID")
    private Integer relEntId;

    @JsonProperty("RES_ENT_ID")
    private Integer resEntId;

    public G2diagnosticGetEntityResumeResponse0() {
    }

    /**
     * Getter for dsrcCode.<p>
     */
    public String getDsrcCode() {
        return dsrcCode;
    }

    /**
     * Setter for dsrcCode.<p>
     */
    public void setDsrcCode(String dsrcCode) {
        this.dsrcCode = dsrcCode;
    }

    /**
     * Getter for entSrcDesc.<p>
     */
    public String getEntSrcDesc() {
        return entSrcDesc;
    }

    /**
     * Setter for entSrcDesc.<p>
     */
    public void setEntSrcDesc(String entSrcDesc) {
        this.entSrcDesc = entSrcDesc;
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
     * Getter for etypeCode.<p>
     */
    public String getEtypeCode() {
        return etypeCode;
    }

    /**
     * Setter for etypeCode.<p>
     */
    public void setEtypeCode(String etypeCode) {
        this.etypeCode = etypeCode;
    }

    /**
     * Getter for jsonData.<p>
     */
    public String getJsonData() {
        return jsonData;
    }

    /**
     * Setter for jsonData.<p>
     */
    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
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
     * Getter for recordId.<p>
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * Setter for recordId.<p>
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * Getter for relEntId.<p>
     */
    public Integer getRelEntId() {
        return relEntId;
    }

    /**
     * Setter for relEntId.<p>
     */
    public void setRelEntId(Integer relEntId) {
        this.relEntId = relEntId;
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