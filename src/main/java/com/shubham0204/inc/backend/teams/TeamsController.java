package com.shubham0204.inc.backend.teams;

import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.shubham0204.inc.backend.teams.models.Team;

@RestController
public class TeamsController {

    private static final Gson gson = new Gson() ; 

    @Autowired
    private TeamsService teamsService ; 

    @RequestMapping(
        path = "/teams" , 
        method = RequestMethod.GET
    )
    public ResponseEntity<String> getAllTeams() {
        return ResponseEntity.ok( gson.toJson( teamsService.getAllTeams() ) ) ;
    }

    @RequestMapping(
        path = "/teams/{id}" ,
        method = RequestMethod.GET
    )
    public ResponseEntity<String> getTeamById(
        @PathVariable String id        
    ) {
        Optional<Team> result = teamsService.getTeamById( Long.parseLong(id) ) ; 
        if( result.isPresent() ) {
            return ResponseEntity.ok( gson.toJson(result.get()) ) ; 
        }
        else {
            return new ResponseEntity<String>("Team with given id not found", HttpStatus.NOT_FOUND) ;  
        }
    }

}
