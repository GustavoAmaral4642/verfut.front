package com.verfut.front.verfut.front.controller;

import com.verfut.front.verfut.front.model.GameModel;
import com.verfut.front.verfut.front.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@Component
@ManagedBean
@ViewScoped
public class GameController {

    @Autowired
    private GameService gameService;

    public List<GameModel> getGames() {
        return gameService.getAll();
    }

}
