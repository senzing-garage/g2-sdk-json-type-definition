// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class CfgGenericThreshold {
    @JsonProperty("BEHAVIOR")
    private String behavior;

    @JsonProperty("CANDIDATE_CAP")
    private Integer candidateCap;

    @JsonProperty("FTYPE_ID")
    private Integer ftypeId;

    @JsonProperty("GPLAN_ID")
    private Integer gplanId;

    @JsonProperty("SCORING_CAP")
    private Integer scoringCap;

    @JsonProperty("SEND_TO_REDO")
    private String sendToRedo;

    public CfgGenericThreshold() {
    }

    /**
     * Getter for behavior.<p>
     * No description.
     */
    public String getBehavior() {
        return behavior;
    }

    /**
     * Setter for behavior.<p>
     * No description.
     */
    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    /**
     * Getter for candidateCap.<p>
     * No description.
     */
    public Integer getCandidateCap() {
        return candidateCap;
    }

    /**
     * Setter for candidateCap.<p>
     * No description.
     */
    public void setCandidateCap(Integer candidateCap) {
        this.candidateCap = candidateCap;
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

    /**
     * Getter for gplanId.<p>
     * No description.
     */
    public Integer getGplanId() {
        return gplanId;
    }

    /**
     * Setter for gplanId.<p>
     * No description.
     */
    public void setGplanId(Integer gplanId) {
        this.gplanId = gplanId;
    }

    /**
     * Getter for scoringCap.<p>
     * No description.
     */
    public Integer getScoringCap() {
        return scoringCap;
    }

    /**
     * Setter for scoringCap.<p>
     * No description.
     */
    public void setScoringCap(Integer scoringCap) {
        this.scoringCap = scoringCap;
    }

    /**
     * Getter for sendToRedo.<p>
     * No description.
     */
    public String getSendToRedo() {
        return sendToRedo;
    }

    /**
     * Setter for sendToRedo.<p>
     * No description.
     */
    public void setSendToRedo(String sendToRedo) {
        this.sendToRedo = sendToRedo;
    }
}
