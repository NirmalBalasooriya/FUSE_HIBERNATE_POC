package com.vcc.poc.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.DataField;

public class Student  extends Abstract implements Serializable{
	private static final long serialVersionUID = 1L;

    private long studentId;

    @DataField(pos = 1)
    private String studentRef;

    @DataField(pos = 3)
    private String givenName;

    @DataField(pos = 4)
    private String familyName;
    
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long incidentId) {
        this.studentId = incidentId;
    }

    public String getStudentRef() {
        return studentRef;
    }

    public void setStudentRef(String studentRef) {
        this.studentRef = studentRef;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
