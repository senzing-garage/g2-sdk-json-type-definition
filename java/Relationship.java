// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Relationship {
    @JsonProperty("RELATIONSHIP_KEY")
    private String relationshipKey;

    @JsonProperty("RELATIONSHIP_TYPE")
    private String relationshipType;

    @JsonProperty("REL_ANCHOR_DOMAIN")
    private String relAnchorDomain;

    @JsonProperty("REL_ANCHOR_KEY")
    private String relAnchorKey;

    @JsonProperty("REL_POINTER_DOMAIN")
    private String relPointerDomain;

    @JsonProperty("REL_POINTER_KEY")
    private String relPointerKey;

    @JsonProperty("REL_POINTER_ROLE")
    private String relPointerRole;

    public Relationship() {
    }

    /**
     * Getter for relationshipKey.<p>
     */
    public String getRelationshipKey() {
        return relationshipKey;
    }

    /**
     * Setter for relationshipKey.<p>
     */
    public void setRelationshipKey(String relationshipKey) {
        this.relationshipKey = relationshipKey;
    }

    /**
     * Getter for relationshipType.<p>
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Setter for relationshipType.<p>
     */
    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * Getter for relAnchorDomain.<p>
     */
    public String getRelAnchorDomain() {
        return relAnchorDomain;
    }

    /**
     * Setter for relAnchorDomain.<p>
     */
    public void setRelAnchorDomain(String relAnchorDomain) {
        this.relAnchorDomain = relAnchorDomain;
    }

    /**
     * Getter for relAnchorKey.<p>
     */
    public String getRelAnchorKey() {
        return relAnchorKey;
    }

    /**
     * Setter for relAnchorKey.<p>
     */
    public void setRelAnchorKey(String relAnchorKey) {
        this.relAnchorKey = relAnchorKey;
    }

    /**
     * Getter for relPointerDomain.<p>
     */
    public String getRelPointerDomain() {
        return relPointerDomain;
    }

    /**
     * Setter for relPointerDomain.<p>
     */
    public void setRelPointerDomain(String relPointerDomain) {
        this.relPointerDomain = relPointerDomain;
    }

    /**
     * Getter for relPointerKey.<p>
     */
    public String getRelPointerKey() {
        return relPointerKey;
    }

    /**
     * Setter for relPointerKey.<p>
     */
    public void setRelPointerKey(String relPointerKey) {
        this.relPointerKey = relPointerKey;
    }

    /**
     * Getter for relPointerRole.<p>
     */
    public String getRelPointerRole() {
        return relPointerRole;
    }

    /**
     * Setter for relPointerRole.<p>
     */
    public void setRelPointerRole(String relPointerRole) {
        this.relPointerRole = relPointerRole;
    }
}