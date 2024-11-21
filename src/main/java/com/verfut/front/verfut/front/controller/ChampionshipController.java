package com.verfut.front.verfut.front.controller;

import com.verfut.front.verfut.front.model.ChampionshipModel;
import com.verfut.front.verfut.front.model.TeamModel;
import com.verfut.front.verfut.front.service.ChampionshipService;
import com.verfut.front.verfut.front.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@Component
@ManagedBean
@ViewScoped
public class ChampionshipController {

    @Autowired
    private ChampionshipService championshipService;

    public List<ChampionshipModel> getChampionships() {
        return championshipService.getAll();
    }

}
