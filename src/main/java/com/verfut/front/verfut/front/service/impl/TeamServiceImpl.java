package com.verfut.front.verfut.front.service.impl;

import com.verfut.front.verfut.front.model.TeamModel;
import com.verfut.front.verfut.front.service.TeamService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private final WebClient webClient;

    public TeamServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public List<TeamModel> getAll() {

        List<TeamModel> t = this.webClient.get()
                .uri("/teams")
                .retrieve()
                .bodyToMono(List.class).block();

        return t;
    }

    @Override
    public TeamModel get(Long id, String noSuchElementException) {
        return null;
    }

    @Override
    public void save(TeamModel item) {

    }

    @Override
    public void update(TeamModel item) {

    }

    @Override
    public void delete(Long id) {

    }
}
