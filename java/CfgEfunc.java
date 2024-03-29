// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class CfgEfunc {
    @JsonProperty("CONNECT_STR")
    private String connectStr;

    @JsonProperty("EFUNC_CODE")
    private String efuncCode;

    @JsonProperty("EFUNC_DESC")
    private String efuncDesc;

    @JsonProperty("EFUNC_ID")
    private Integer efuncId;

    @JsonProperty("FUNC_LIB")
    private String funcLib;

    @JsonProperty("FUNC_VER")
    private String funcVer;

    @JsonProperty("JAVA_CLASS_NAME")
    private String javaClassName;

    @JsonProperty("LANGUAGE")
    private String language;

    public CfgEfunc() {
    }

    /**
     * Getter for connectStr.<p>
     */
    public String getConnectStr() {
        return connectStr;
    }

    /**
     * Setter for connectStr.<p>
     */
    public void setConnectStr(String connectStr) {
        this.connectStr = connectStr;
    }

    /**
     * Getter for efuncCode.<p>
     */
    public String getEfuncCode() {
        return efuncCode;
    }

    /**
     * Setter for efuncCode.<p>
     */
    public void setEfuncCode(String efuncCode) {
        this.efuncCode = efuncCode;
    }

    /**
     * Getter for efuncDesc.<p>
     */
    public String getEfuncDesc() {
        return efuncDesc;
    }

    /**
     * Setter for efuncDesc.<p>
     */
    public void setEfuncDesc(String efuncDesc) {
        this.efuncDesc = efuncDesc;
    }

    /**
     * Getter for efuncId.<p>
     */
    public Integer getEfuncId() {
        return efuncId;
    }

    /**
     * Setter for efuncId.<p>
     */
    public void setEfuncId(Integer efuncId) {
        this.efuncId = efuncId;
    }

    /**
     * Getter for funcLib.<p>
     */
    public String getFuncLib() {
        return funcLib;
    }

    /**
     * Setter for funcLib.<p>
     */
    public void setFuncLib(String funcLib) {
        this.funcLib = funcLib;
    }

    /**
     * Getter for funcVer.<p>
     */
    public String getFuncVer() {
        return funcVer;
    }

    /**
     * Setter for funcVer.<p>
     */
    public void setFuncVer(String funcVer) {
        this.funcVer = funcVer;
    }

    /**
     * Getter for javaClassName.<p>
     */
    public String getJavaClassName() {
        return javaClassName;
    }

    /**
     * Setter for javaClassName.<p>
     */
    public void setJavaClassName(String javaClassName) {
        this.javaClassName = javaClassName;
    }

    /**
     * Getter for language.<p>
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Setter for language.<p>
     */
    public void setLanguage(String language) {
        this.language = language;
    }
}
