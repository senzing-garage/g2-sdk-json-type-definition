// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class HowResults {
    @JsonProperty("FINAL_STATE")
    private FinalState finalState;

    @JsonProperty("RESOLUTION_STEPS")
    private ResolutionSteps resolutionSteps;

    public HowResults() {
    }

    /**
     * Getter for finalState.<p>
     */
    public FinalState getFinalState() {
        return finalState;
    }

    /**
     * Setter for finalState.<p>
     */
    public void setFinalState(FinalState finalState) {
        this.finalState = finalState;
    }

    /**
     * Getter for resolutionSteps.<p>
     */
    public ResolutionSteps getResolutionSteps() {
        return resolutionSteps;
    }

    /**
     * Setter for resolutionSteps.<p>
     */
    public void setResolutionSteps(ResolutionSteps resolutionSteps) {
        this.resolutionSteps = resolutionSteps;
    }
}
