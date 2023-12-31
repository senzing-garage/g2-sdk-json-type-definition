// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

/**
 * No description.
 */
@JsonSerialize
public class Record {
    @JsonProperty("ADDRESS_DATA")
    private List<String> addressData;

    @JsonProperty("ATTRIBUTE_DATA")
    private List<String> attributeData;

    @JsonProperty("DATA_SOURCE")
    private String dataSource;

    @JsonProperty("ENTITY_DATA")
    private List<String> entityData;

    @JsonProperty("ENTITY_DESC")
    private String entityDesc;

    @JsonProperty("ENTITY_KEY")
    private String entityKey;

    @JsonProperty("ENTITY_TYPE")
    private String entityType;

    @JsonProperty("ERRULE_CODE")
    private String erruleCode;

    @JsonProperty("FEATURES")
    private List<RecordFeatures> features;

    @JsonProperty("IDENTIFIER_DATA")
    private List<String> identifierData;

    @JsonProperty("INTERNAL_ID")
    private Integer internalId;

    @JsonProperty("JSON_DATA")
    private JsonData jsonData;

    @JsonProperty("LAST_SEEN_DT")
    private String lastSeenDt;

    @JsonProperty("MATCH_KEY")
    private String matchKey;

    @JsonProperty("MATCH_LEVEL")
    private Integer matchLevel;

    @JsonProperty("MATCH_LEVEL_CODE")
    private String matchLevelCode;

    @JsonProperty("NAME_DATA")
    private List<String> nameData;

    @JsonProperty("OTHER_DATA")
    private List<String> otherData;

    @JsonProperty("PHONE_DATA")
    private List<String> phoneData;

    @JsonProperty("RECORD_ID")
    private String recordId;

    @JsonProperty("RELATIONSHIP_DATA")
    private List<String> relationshipData;

    public Record() {
    }

    /**
     * Getter for addressData.<p>
     * No description.
     */
    public List<String> getAddressData() {
        return addressData;
    }

    /**
     * Setter for addressData.<p>
     * No description.
     */
    public void setAddressData(List<String> addressData) {
        this.addressData = addressData;
    }

    /**
     * Getter for attributeData.<p>
     * No description.
     */
    public List<String> getAttributeData() {
        return attributeData;
    }

    /**
     * Setter for attributeData.<p>
     * No description.
     */
    public void setAttributeData(List<String> attributeData) {
        this.attributeData = attributeData;
    }

    /**
     * Getter for dataSource.<p>
     * No description.
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Setter for dataSource.<p>
     * No description.
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Getter for entityData.<p>
     * No description.
     */
    public List<String> getEntityData() {
        return entityData;
    }

    /**
     * Setter for entityData.<p>
     * No description.
     */
    public void setEntityData(List<String> entityData) {
        this.entityData = entityData;
    }

    /**
     * Getter for entityDesc.<p>
     * No description.
     */
    public String getEntityDesc() {
        return entityDesc;
    }

    /**
     * Setter for entityDesc.<p>
     * No description.
     */
    public void setEntityDesc(String entityDesc) {
        this.entityDesc = entityDesc;
    }

    /**
     * Getter for entityKey.<p>
     * No description.
     */
    public String getEntityKey() {
        return entityKey;
    }

    /**
     * Setter for entityKey.<p>
     * No description.
     */
    public void setEntityKey(String entityKey) {
        this.entityKey = entityKey;
    }

    /**
     * Getter for entityType.<p>
     * No description.
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Setter for entityType.<p>
     * No description.
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * Getter for erruleCode.<p>
     * No description.
     */
    public String getErruleCode() {
        return erruleCode;
    }

    /**
     * Setter for erruleCode.<p>
     * No description.
     */
    public void setErruleCode(String erruleCode) {
        this.erruleCode = erruleCode;
    }

    /**
     * Getter for features.<p>
     * No description.
     */
    public List<RecordFeatures> getFeatures() {
        return features;
    }

    /**
     * Setter for features.<p>
     * No description.
     */
    public void setFeatures(List<RecordFeatures> features) {
        this.features = features;
    }

    /**
     * Getter for identifierData.<p>
     * No description.
     */
    public List<String> getIdentifierData() {
        return identifierData;
    }

    /**
     * Setter for identifierData.<p>
     * No description.
     */
    public void setIdentifierData(List<String> identifierData) {
        this.identifierData = identifierData;
    }

    /**
     * Getter for internalId.<p>
     * No description.
     */
    public Integer getInternalId() {
        return internalId;
    }

    /**
     * Setter for internalId.<p>
     * No description.
     */
    public void setInternalId(Integer internalId) {
        this.internalId = internalId;
    }

    /**
     * Getter for jsonData.<p>
     * No description.
     */
    public JsonData getJsonData() {
        return jsonData;
    }

    /**
     * Setter for jsonData.<p>
     * No description.
     */
    public void setJsonData(JsonData jsonData) {
        this.jsonData = jsonData;
    }

    /**
     * Getter for lastSeenDt.<p>
     * No description.
     */
    public String getLastSeenDt() {
        return lastSeenDt;
    }

    /**
     * Setter for lastSeenDt.<p>
     * No description.
     */
    public void setLastSeenDt(String lastSeenDt) {
        this.lastSeenDt = lastSeenDt;
    }

    /**
     * Getter for matchKey.<p>
     * No description.
     */
    public String getMatchKey() {
        return matchKey;
    }

    /**
     * Setter for matchKey.<p>
     * No description.
     */
    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }

    /**
     * Getter for matchLevel.<p>
     * No description.
     */
    public Integer getMatchLevel() {
        return matchLevel;
    }

    /**
     * Setter for matchLevel.<p>
     * No description.
     */
    public void setMatchLevel(Integer matchLevel) {
        this.matchLevel = matchLevel;
    }

    /**
     * Getter for matchLevelCode.<p>
     * No description.
     */
    public String getMatchLevelCode() {
        return matchLevelCode;
    }

    /**
     * Setter for matchLevelCode.<p>
     * No description.
     */
    public void setMatchLevelCode(String matchLevelCode) {
        this.matchLevelCode = matchLevelCode;
    }

    /**
     * Getter for nameData.<p>
     * No description.
     */
    public List<String> getNameData() {
        return nameData;
    }

    /**
     * Setter for nameData.<p>
     * No description.
     */
    public void setNameData(List<String> nameData) {
        this.nameData = nameData;
    }

    /**
     * Getter for otherData.<p>
     * No description.
     */
    public List<String> getOtherData() {
        return otherData;
    }

    /**
     * Setter for otherData.<p>
     * No description.
     */
    public void setOtherData(List<String> otherData) {
        this.otherData = otherData;
    }

    /**
     * Getter for phoneData.<p>
     * No description.
     */
    public List<String> getPhoneData() {
        return phoneData;
    }

    /**
     * Setter for phoneData.<p>
     * No description.
     */
    public void setPhoneData(List<String> phoneData) {
        this.phoneData = phoneData;
    }

    /**
     * Getter for recordId.<p>
     * No description.
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * Setter for recordId.<p>
     * No description.
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * Getter for relationshipData.<p>
     * No description.
     */
    public List<String> getRelationshipData() {
        return relationshipData;
    }

    /**
     * Setter for relationshipData.<p>
     * No description.
     */
    public void setRelationshipData(List<String> relationshipData) {
        this.relationshipData = relationshipData;
    }
}
