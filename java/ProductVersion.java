// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class ProductVersion {
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

    @JsonProperty("SCHEMA_VERSION")
    private SchemaVersion schemaVersion;

    @JsonProperty("VERSION")
    private String version;

    public ProductVersion() {
    }

    /**
     * Getter for buildDate.<p>
     */
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * Setter for buildDate.<p>
     */
    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    /**
     * Getter for buildNumber.<p>
     */
    public String getBuildNumber() {
        return buildNumber;
    }

    /**
     * Setter for buildNumber.<p>
     */
    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    /**
     * Getter for buildVersion.<p>
     */
    public String getBuildVersion() {
        return buildVersion;
    }

    /**
     * Setter for buildVersion.<p>
     */
    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    /**
     * Getter for compatibilityVersion.<p>
     */
    public CompatibilityVersion getCompatibilityVersion() {
        return compatibilityVersion;
    }

    /**
     * Setter for compatibilityVersion.<p>
     */
    public void setCompatibilityVersion(CompatibilityVersion compatibilityVersion) {
        this.compatibilityVersion = compatibilityVersion;
    }

    /**
     * Getter for productName.<p>
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Setter for productName.<p>
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for schemaVersion.<p>
     */
    public SchemaVersion getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Setter for schemaVersion.<p>
     */
    public void setSchemaVersion(SchemaVersion schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * Getter for version.<p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter for version.<p>
     */
    public void setVersion(String version) {
        this.version = version;
    }
}
