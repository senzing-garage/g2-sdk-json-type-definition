// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class G2engineGetVirtualEntityByRecordIdv2response {
    @JsonValue
    private VirtualEntity value;

    public G2engineGetVirtualEntityByRecordIdv2response() {
    }

    @JsonCreator
    public G2engineGetVirtualEntityByRecordIdv2response(VirtualEntity value) {
        this.value = value;
    }

    public VirtualEntity getValue() {
        return value;
    }

    public void setValue(VirtualEntity value) {
        this.value = value;
    }
}