// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class AffectedEntity {
    @JsonProperty("ENTITY_ID")
    private Integer entityId;

    public AffectedEntity() {
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
}
