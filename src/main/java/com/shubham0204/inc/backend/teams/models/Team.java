package com.shubham0204.inc.backend.teams.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table( name = "teams" )
public class Team {

    @Id() 
    @Column( name = "id" )
    private int id ; 

    @Column( name = "name" )        
    private String name ; 
    
    @Column( name = "abstract" )    
    private String projectAbstract ;
    
    @Column( name = "domain" ) 
    private String domain ; 

    @Column( name = "project_type" , nullable = false )
    private String projectType ;

    @Column( name = "room_number" , nullable = false )
    private String roomNumber ; 

    @Column( name = "institute" , nullable = false )
    private String instituteName ; 

    public Team() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProjectAbstract() {
        return projectAbstract;
    }

    public String getDomain() {
        return domain;
    }

    public String getProjectType() {
        return projectType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getInstituteName() {
        return instituteName;
    } 

}
