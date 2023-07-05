// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class WhyResult {
    @JsonProperty("ENTITY_ID")
    private Integer entityId;

    @JsonProperty("ENTITY_ID_2")
    private Integer entityId0;

    @JsonProperty("FOCUS_RECORDS")
    private FocusRecords focusRecords;

    @JsonProperty("FOCUS_RECORDS_2")
    private FocusRecords focusRecords0;

    @JsonProperty("INTERNAL_ID")
    private Integer internalId;

    @JsonProperty("INTERNAL_ID_2")
    private Integer internalId0;

    @JsonProperty("MATCH_INFO")
    private MatchInfo matchInfo;

    public WhyResult() {
    }

    /**
     * Getter for entityId.<p>
     * No description.
     */
    public Integer getEntityId() {
        return entityId;
    }

    /**
     * Setter for entityId.<p>
     * No description.
     */
    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    /**
     * Getter for entityId0.<p>
     * No description.
     */
    public Integer getEntityId0() {
        return entityId0;
    }

    /**
     * Setter for entityId0.<p>
     * No description.
     */
    public void setEntityId0(Integer entityId0) {
        this.entityId0 = entityId0;
    }

    /**
     * Getter for focusRecords.<p>
     * No description.
     */
    public FocusRecords getFocusRecords() {
        return focusRecords;
    }

    /**
     * Setter for focusRecords.<p>
     * No description.
     */
    public void setFocusRecords(FocusRecords focusRecords) {
        this.focusRecords = focusRecords;
    }

    /**
     * Getter for focusRecords0.<p>
     * No description.
     */
    public FocusRecords getFocusRecords0() {
        return focusRecords0;
    }

    /**
     * Setter for focusRecords0.<p>
     * No description.
     */
    public void setFocusRecords0(FocusRecords focusRecords0) {
        this.focusRecords0 = focusRecords0;
    }

    /**
     * Getter for internalId.<p>
     * No description.
     */
    public Integer getInternalId() {
        return internalId;
    }

    /**
     * Setter for internalId.<p>
     * No description.
     */
    public void setInternalId(Integer internalId) {
        this.internalId = internalId;
    }

    /**
     * Getter for internalId0.<p>
     * No description.
     */
    public Integer getInternalId0() {
        return internalId0;
    }

    /**
     * Setter for internalId0.<p>
     * No description.
     */
    public void setInternalId0(Integer internalId0) {
        this.internalId0 = internalId0;
    }

    /**
     * Getter for matchInfo.<p>
     * No description.
     */
    public MatchInfo getMatchInfo() {
        return matchInfo;
    }

    /**
     * Setter for matchInfo.<p>
     * No description.
     */
    public void setMatchInfo(MatchInfo matchInfo) {
        this.matchInfo = matchInfo;
    }
}