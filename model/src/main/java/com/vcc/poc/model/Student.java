package com.vcc.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student{

    @Id
    @GeneratedValue
    @Column(name="STUDENT_ID", nullable = false)
    private int studentId;

    @Column(name="STUDENT_REF", nullable = true, length = 55)
    private String studentRef;

    @Column(name="GIVEN_NAME", nullable = true, length = 35)
    private String givenName;

    @Column(name="FAMILY_NAME", nullable = true, length = 35)
    private String familyName;
    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int incidentId) {
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
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentId;
        //result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Student))
            return false;
        Student other = (Student) obj;
        if (studentId != other.studentId)
            return false;
        return true;
    }
    
    @Override
    public String toString(){
    	return givenName+" "+familyName+" ";
    }
}
