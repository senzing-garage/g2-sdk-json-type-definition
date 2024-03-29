// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class CfgFtype {
    @JsonProperty("ANONYMIZE")
    private String anonymize;

    @JsonProperty("DERIVATION")
    private String derivation;

    @JsonProperty("DERIVED")
    private String derived;

    @JsonProperty("FCLASS_ID")
    private Integer fclassId;

    @JsonProperty("FTYPE_CODE")
    private String ftypeCode;

    @JsonProperty("FTYPE_DESC")
    private String ftypeDesc;

    @JsonProperty("FTYPE_EXCL")
    private String ftypeExcl;

    @JsonProperty("FTYPE_FREQ")
    private String ftypeFreq;

    @JsonProperty("FTYPE_ID")
    private Integer ftypeId;

    @JsonProperty("FTYPE_STAB")
    private String ftypeStab;

    @JsonProperty("PERSIST_HISTORY")
    private String persistHistory;

    @JsonProperty("RTYPE_ID")
    private Integer rtypeId;

    @JsonProperty("SHOW_IN_MATCH_KEY")
    private String showInMatchKey;

    @JsonProperty("USED_FOR_CAND")
    private String usedForCand;

    @JsonProperty("VERSION")
    private Integer version;

    public CfgFtype() {
    }

    /**
     * Getter for anonymize.<p>
     */
    public String getAnonymize() {
        return anonymize;
    }

    /**
     * Setter for anonymize.<p>
     */
    public void setAnonymize(String anonymize) {
        this.anonymize = anonymize;
    }

    /**
     * Getter for derivation.<p>
     */
    public String getDerivation() {
        return derivation;
    }

    /**
     * Setter for derivation.<p>
     */
    public void setDerivation(String derivation) {
        this.derivation = derivation;
    }

    /**
     * Getter for derived.<p>
     */
    public String getDerived() {
        return derived;
    }

    /**
     * Setter for derived.<p>
     */
    public void setDerived(String derived) {
        this.derived = derived;
    }

    /**
     * Getter for fclassId.<p>
     */
    public Integer getFclassId() {
        return fclassId;
    }

    /**
     * Setter for fclassId.<p>
     */
    public void setFclassId(Integer fclassId) {
        this.fclassId = fclassId;
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
     * Getter for ftypeDesc.<p>
     */
    public String getFtypeDesc() {
        return ftypeDesc;
    }

    /**
     * Setter for ftypeDesc.<p>
     */
    public void setFtypeDesc(String ftypeDesc) {
        this.ftypeDesc = ftypeDesc;
    }

    /**
     * Getter for ftypeExcl.<p>
     */
    public String getFtypeExcl() {
        return ftypeExcl;
    }

    /**
     * Setter for ftypeExcl.<p>
     */
    public void setFtypeExcl(String ftypeExcl) {
        this.ftypeExcl = ftypeExcl;
    }

    /**
     * Getter for ftypeFreq.<p>
     */
    public String getFtypeFreq() {
        return ftypeFreq;
    }

    /**
     * Setter for ftypeFreq.<p>
     */
    public void setFtypeFreq(String ftypeFreq) {
        this.ftypeFreq = ftypeFreq;
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

    /**
     * Getter for ftypeStab.<p>
     */
    public String getFtypeStab() {
        return ftypeStab;
    }

    /**
     * Setter for ftypeStab.<p>
     */
    public void setFtypeStab(String ftypeStab) {
        this.ftypeStab = ftypeStab;
    }

    /**
     * Getter for persistHistory.<p>
     */
    public String getPersistHistory() {
        return persistHistory;
    }

    /**
     * Setter for persistHistory.<p>
     */
    public void setPersistHistory(String persistHistory) {
        this.persistHistory = persistHistory;
    }

    /**
     * Getter for rtypeId.<p>
     */
    public Integer getRtypeId() {
        return rtypeId;
    }

    /**
     * Setter for rtypeId.<p>
     */
    public void setRtypeId(Integer rtypeId) {
        this.rtypeId = rtypeId;
    }

    /**
     * Getter for showInMatchKey.<p>
     */
    public String getShowInMatchKey() {
        return showInMatchKey;
    }

    /**
     * Setter for showInMatchKey.<p>
     */
    public void setShowInMatchKey(String showInMatchKey) {
        this.showInMatchKey = showInMatchKey;
    }

    /**
     * Getter for usedForCand.<p>
     */
    public String getUsedForCand() {
        return usedForCand;
    }

    /**
     * Setter for usedForCand.<p>
     */
    public void setUsedForCand(String usedForCand) {
        this.usedForCand = usedForCand;
    }

    /**
     * Getter for version.<p>
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Setter for version.<p>
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}
