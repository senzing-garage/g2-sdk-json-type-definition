// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

/**
 * No description.
 */
@JsonSerialize
public class InterestingEntity {
    @JsonProperty("DEGREES")
    private Integer degrees;

    @JsonProperty("ENTITY_ID")
    private Integer entityId;

    @JsonProperty("FLAGS")
    private List<String> flags;

    @JsonProperty("SAMPLE_RECORDS")
    private List<InterestingEntitySampleRecords> sampleRecords;

    public InterestingEntity() {
    }

    /**
     * Getter for degrees.<p>
     * No description.
     */
    public Integer getDegrees() {
        return degrees;
    }

    /**
     * Setter for degrees.<p>
     * No description.
     */
    public void setDegrees(Integer degrees) {
        this.degrees = degrees;
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
     * Getter for flags.<p>
     * No description.
     */
    public List<String> getFlags() {
        return flags;
    }

    /**
     * Setter for flags.<p>
     * No description.
     */
    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    /**
     * Getter for sampleRecords.<p>
     * No description.
     */
    public List<InterestingEntitySampleRecords> getSampleRecords() {
        return sampleRecords;
    }

    /**
     * Setter for sampleRecords.<p>
     * No description.
     */
    public void setSampleRecords(List<InterestingEntitySampleRecords> sampleRecords) {
        this.sampleRecords = sampleRecords;
    }
}
