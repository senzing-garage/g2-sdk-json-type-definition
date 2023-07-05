// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class ConfigBaseVersion {
    @JsonProperty("BUILD_DATE")
    private String buildDate;

    @JsonProperty("BUILD_NUMBER")
    private String buildNumber;

    @JsonProperty("BUILD_VERSION")
    private String buildVersion;

    @JsonProperty("COMPATIBILITY_VERSION")
    private CompatibilityVersion compatibilityVersion;

    @JsonProperty("PRODUCT_NAME")
    private String productName;

    @JsonProperty("VERSION")
    private String version;

    public ConfigBaseVersion() {
    }

    /**
     * Getter for buildDate.<p>
     * No description.
     */
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * Setter for buildDate.<p>
     * No description.
     */
    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    /**
     * Getter for buildNumber.<p>
     * No description.
     */
    public String getBuildNumber() {
        return buildNumber;
    }

    /**
     * Setter for buildNumber.<p>
     * No description.
     */
    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    /**
     * Getter for buildVersion.<p>
     * No description.
     */
    public String getBuildVersion() {
        return buildVersion;
    }

    /**
     * Setter for buildVersion.<p>
     * No description.
     */
    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    /**
     * Getter for compatibilityVersion.<p>
     * No description.
     */
    public CompatibilityVersion getCompatibilityVersion() {
        return compatibilityVersion;
    }

    /**
     * Setter for compatibilityVersion.<p>
     * No description.
     */
    public void setCompatibilityVersion(CompatibilityVersion compatibilityVersion) {
        this.compatibilityVersion = compatibilityVersion;
    }

    /**
     * Getter for productName.<p>
     * No description.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Setter for productName.<p>
     * No description.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for version.<p>
     * No description.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter for version.<p>
     * No description.
     */
    public void setVersion(String version) {
        this.version = version;
    }
}