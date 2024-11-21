package com.verfut.front.verfut.front.controller;

import com.verfut.front.verfut.front.model.TeamModel;
import com.verfut.front.verfut.front.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@Component
@ManagedBean
@ViewScoped
public class TeamController {

    @Autowired
    private TeamService teamService;

    private TeamModel team;

    public List<TeamModel> getTeams() {

        System.out.println("Chegando aqui no conntroller");
        return teamService.getAll();
    }

    public TeamModel getTeam() {
        return team;
    }

    public void setTeam(TeamModel team) {
        this.team = team;
    }
}
