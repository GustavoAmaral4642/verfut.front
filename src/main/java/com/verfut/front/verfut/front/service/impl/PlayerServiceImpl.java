package com.verfut.front.verfut.front.service.impl;

import com.verfut.front.verfut.front.model.PlayerModel;
import com.verfut.front.verfut.front.service.PlayerService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final WebClient webClient;

    public PlayerServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public List<PlayerModel> getAll() {
        return this.webClient.get()
                .uri("/players")
                .retrieve()
                .bodyToMono(List.class).block();
    }

    @Override
    public PlayerModel get(Long id, String noSuchElementException) {
        return null;
    }

    @Override
    public void save(PlayerModel item) {

    }

    @Override
    public void update(PlayerModel item) {

    }

    @Override
    public void delete(Long id) {

    }
}
