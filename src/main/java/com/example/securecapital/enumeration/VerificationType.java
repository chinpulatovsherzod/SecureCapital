package com.example.securecapital.enumeration;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public enum VerificationType {
    ACCOUNT("ACCOUNT"),
    PASSWORD("PASSWORD");

    private final String type;

    VerificationType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type.toLowerCase();
    }
}
