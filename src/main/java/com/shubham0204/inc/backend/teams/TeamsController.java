package com.shubham0204.inc.backend.teams;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

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

}
