package com.verfut.front.verfut.front.service.impl;

import com.verfut.front.verfut.front.model.ChampionshipModel;
import com.verfut.front.verfut.front.model.TeamModel;
import com.verfut.front.verfut.front.service.ChampionshipService;
import com.verfut.front.verfut.front.service.TeamService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class ChampionshipServiceImpl implements ChampionshipService {

    private final WebClient webClient;

    public ChampionshipServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public List<ChampionshipModel> getAll() {
        return this.webClient.get()
                .uri("/championships")
                .retrieve()
                .bodyToMono(List.class).block();
    }

    @Override
    public ChampionshipModel get(Long id, String noSuchElementException) {
        return null;
    }

    @Override
    public void save(ChampionshipModel item) {

    }

    @Override
    public void update(ChampionshipModel item) {

    }

    @Override
    public void delete(Long id) {

    }
}
