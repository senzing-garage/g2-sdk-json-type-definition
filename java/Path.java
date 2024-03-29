// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonSerialize
public class Path {
    @JsonProperty("ENTITIES")
    private List<Entity> entities;

    @JsonProperty("ENTITY_PATHS")
    private List<EntityPath> entityPaths;

    public Path() {
    }

    /**
     * Getter for entities.<p>
     */
    public List<Entity> getEntities() {
        return entities;
    }

    /**
     * Setter for entities.<p>
     */
    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    /**
     * Getter for entityPaths.<p>
     */
    public List<EntityPath> getEntityPaths() {
        return entityPaths;
    }

    /**
     * Setter for entityPaths.<p>
     */
    public void setEntityPaths(List<EntityPath> entityPaths) {
        this.entityPaths = entityPaths;
    }
}
