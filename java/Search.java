// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

/**
 * No description.
 */
@JsonSerialize
public class Search {
    @JsonProperty("RESOLVED_ENTITIES")
    private List<SearchResolvedEntities> resolvedEntities;

    @JsonProperty("SEARCH_STATISTICS")
    private List<SearchSearchStatistics> searchStatistics;

    public Search() {
    }

    /**
     * Getter for resolvedEntities.<p>
     * No description.
     */
    public List<SearchResolvedEntities> getResolvedEntities() {
        return resolvedEntities;
    }

    /**
     * Setter for resolvedEntities.<p>
     * No description.
     */
    public void setResolvedEntities(List<SearchResolvedEntities> resolvedEntities) {
        this.resolvedEntities = resolvedEntities;
    }

    /**
     * Getter for searchStatistics.<p>
     * No description.
     */
    public List<SearchSearchStatistics> getSearchStatistics() {
        return searchStatistics;
    }

    /**
     * Setter for searchStatistics.<p>
     * No description.
     */
    public void setSearchStatistics(List<SearchSearchStatistics> searchStatistics) {
        this.searchStatistics = searchStatistics;
    }
}