// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonSerialize
public class FinalState {
    @JsonProperty("NEED_REEVALUATION")
    private Integer needReevaluation;

    @JsonProperty("VIRTUAL_ENTITIES")
    private List<VirtualEntitySynopsis> virtualEntities;

    public FinalState() {
    }

    /**
     * Getter for needReevaluation.<p>
     */
    public Integer getNeedReevaluation() {
        return needReevaluation;
    }

    /**
     * Setter for needReevaluation.<p>
     */
    public void setNeedReevaluation(Integer needReevaluation) {
        this.needReevaluation = needReevaluation;
    }

    /**
     * Getter for virtualEntities.<p>
     */
    public List<VirtualEntitySynopsis> getVirtualEntities() {
        return virtualEntities;
    }

    /**
     * Setter for virtualEntities.<p>
     */
    public void setVirtualEntities(List<VirtualEntitySynopsis> virtualEntities) {
        this.virtualEntities = virtualEntities;
    }
}
