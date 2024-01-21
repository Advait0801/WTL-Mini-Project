package com.shubham0204.inc.backend.teams;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shubham0204.inc.backend.teams.models.Team;

@Repository
public interface TeamsRepository extends CrudRepository<Team,Long> {



}
