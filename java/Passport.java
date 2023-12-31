// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * No description.
 */
@JsonSerialize
public class Passport {
    @JsonProperty("PASSPORT_COUNTRY")
    private String passportCountry;

    @JsonProperty("PASSPORT_NUMBER")
    private String passportNumber;

    public Passport() {
    }

    /**
     * Getter for passportCountry.<p>
     * No description.
     */
    public String getPassportCountry() {
        return passportCountry;
    }

    /**
     * Setter for passportCountry.<p>
     * No description.
     */
    public void setPassportCountry(String passportCountry) {
        this.passportCountry = passportCountry;
    }

    /**
     * Getter for passportNumber.<p>
     * No description.
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Setter for passportNumber.<p>
     * No description.
     */
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
