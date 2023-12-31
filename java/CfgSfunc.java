// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class CfgSfunc {
    @JsonProperty("CONNECT_STR")
    private String connectStr;

    @JsonProperty("FUNC_LIB")
    private String funcLib;

    @JsonProperty("FUNC_VER")
    private String funcVer;

    @JsonProperty("JAVA_CLASS_NAME")
    private String javaClassName;

    @JsonProperty("LANGUAGE")
    private String language;

    @JsonProperty("SFUNC_CODE")
    private String sfuncCode;

    @JsonProperty("SFUNC_DESC")
    private String sfuncDesc;

    @JsonProperty("SFUNC_ID")
    private Integer sfuncId;

    public CfgSfunc() {
    }

    /**
     * Getter for connectStr.<p>
     * No description.
     */
    public String getConnectStr() {
        return connectStr;
    }

    /**
     * Setter for connectStr.<p>
     * No description.
     */
    public void setConnectStr(String connectStr) {
        this.connectStr = connectStr;
    }

    /**
     * Getter for funcLib.<p>
     * No description.
     */
    public String getFuncLib() {
        return funcLib;
    }

    /**
     * Setter for funcLib.<p>
     * No description.
     */
    public void setFuncLib(String funcLib) {
        this.funcLib = funcLib;
    }

    /**
     * Getter for funcVer.<p>
     * No description.
     */
    public String getFuncVer() {
        return funcVer;
    }

    /**
     * Setter for funcVer.<p>
     * No description.
     */
    public void setFuncVer(String funcVer) {
        this.funcVer = funcVer;
    }

    /**
     * Getter for javaClassName.<p>
     * No description.
     */
    public String getJavaClassName() {
        return javaClassName;
    }

    /**
     * Setter for javaClassName.<p>
     * No description.
     */
    public void setJavaClassName(String javaClassName) {
        this.javaClassName = javaClassName;
    }

    /**
     * Getter for language.<p>
     * No description.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Setter for language.<p>
     * No description.
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Getter for sfuncCode.<p>
     * No description.
     */
    public String getSfuncCode() {
        return sfuncCode;
    }

    /**
     * Setter for sfuncCode.<p>
     * No description.
     */
    public void setSfuncCode(String sfuncCode) {
        this.sfuncCode = sfuncCode;
    }

    /**
     * Getter for sfuncDesc.<p>
     * No description.
     */
    public String getSfuncDesc() {
        return sfuncDesc;
    }

    /**
     * Setter for sfuncDesc.<p>
     * No description.
     */
    public void setSfuncDesc(String sfuncDesc) {
        this.sfuncDesc = sfuncDesc;
    }

    /**
     * Getter for sfuncId.<p>
     * No description.
     */
    public Integer getSfuncId() {
        return sfuncId;
    }

    /**
     * Setter for sfuncId.<p>
     * No description.
     */
    public void setSfuncId(Integer sfuncId) {
        this.sfuncId = sfuncId;
    }
}
