package com.shubham0204.inc.backend.teams;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.shubham0204.inc.backend.teams.models.Team;

@Service
public class TeamsService {

    @Autowired
    private TeamsRepository repository;

    public List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<Team>() ; 
        repository.findAll().forEach( teams::add ) ; 
        return teams ; 
    }

}
