// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class G2configAddDataSourceResponse {
    @JsonValue
    private AddDataSource value;

    public G2configAddDataSourceResponse() {
    }

    @JsonCreator
    public G2configAddDataSourceResponse(AddDataSource value) {
        this.value = value;
    }

    public AddDataSource getValue() {
        return value;
    }

    public void setValue(AddDataSource value) {
        this.value = value;
    }
}
