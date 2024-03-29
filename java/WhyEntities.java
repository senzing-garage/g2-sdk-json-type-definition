// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonSerialize
public class WhyEntities {
    @JsonProperty("ENTITIES")
    private List<Entity> entities;

    @JsonProperty("WHY_RESULTS")
    private WhyResults whyResults;

    public WhyEntities() {
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
     * Getter for whyResults.<p>
     */
    public WhyResults getWhyResults() {
        return whyResults;
    }

    /**
     * Setter for whyResults.<p>
     */
    public void setWhyResults(WhyResults whyResults) {
        this.whyResults = whyResults;
    }
}
