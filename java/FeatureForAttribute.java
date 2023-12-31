// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class FeatureForAttribute {
    @JsonProperty("FEAT_DESC")
    private String featDesc;

    @JsonProperty("FEAT_DESC_VALUES")
    private FeatureDescriptionValues featDescValues;

    @JsonProperty("LIB_FEAT_ID")
    private Integer libFeatId;

    @JsonProperty("USAGE_TYPE")
    private String usageType;

    public FeatureForAttribute() {
    }

    /**
     * Getter for featDesc.<p>
     * No description.
     */
    public String getFeatDesc() {
        return featDesc;
    }

    /**
     * Setter for featDesc.<p>
     * No description.
     */
    public void setFeatDesc(String featDesc) {
        this.featDesc = featDesc;
    }

    /**
     * Getter for featDescValues.<p>
     * No description.
     */
    public FeatureDescriptionValues getFeatDescValues() {
        return featDescValues;
    }

    /**
     * Setter for featDescValues.<p>
     * No description.
     */
    public void setFeatDescValues(FeatureDescriptionValues featDescValues) {
        this.featDescValues = featDescValues;
    }

    /**
     * Getter for libFeatId.<p>
     * No description.
     */
    public Integer getLibFeatId() {
        return libFeatId;
    }

    /**
     * Setter for libFeatId.<p>
     * No description.
     */
    public void setLibFeatId(Integer libFeatId) {
        this.libFeatId = libFeatId;
    }

    /**
     * Getter for usageType.<p>
     * No description.
     */
    public String getUsageType() {
        return usageType;
    }

    /**
     * Setter for usageType.<p>
     * No description.
     */
    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }
}
