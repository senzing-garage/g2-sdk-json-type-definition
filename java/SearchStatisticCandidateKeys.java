// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonSerialize
public class SearchStatisticCandidateKeys {
    @JsonProperty("FEATURE_TYPES")
    private List<SearchStatisticCandidateKeysFeatureTypes> featureTypes;

    @JsonProperty("SUMMARY")
    private SearchStatisticCandidateKeysSummary summary;

    public SearchStatisticCandidateKeys() {
    }

    /**
     * Getter for featureTypes.<p>
     */
    public List<SearchStatisticCandidateKeysFeatureTypes> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * Setter for featureTypes.<p>
     */
    public void setFeatureTypes(List<SearchStatisticCandidateKeysFeatureTypes> featureTypes) {
        this.featureTypes = featureTypes;
    }

    /**
     * Getter for summary.<p>
     */
    public SearchStatisticCandidateKeysSummary getSummary() {
        return summary;
    }

    /**
     * Setter for summary.<p>
     */
    public void setSummary(SearchStatisticCandidateKeysSummary summary) {
        this.summary = summary;
    }
}
