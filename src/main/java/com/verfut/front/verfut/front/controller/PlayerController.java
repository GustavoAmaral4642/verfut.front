package com.verfut.front.verfut.front.controller;

import com.verfut.front.verfut.front.model.PlayerModel;
import com.verfut.front.verfut.front.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@Component
@ManagedBean
@ViewScoped
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    public List<PlayerModel> getPlayers() {
        return playerService.getAll();
    }

}
