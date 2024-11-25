package com.verfut.front.verfut.front.service.impl;

import com.verfut.front.verfut.front.model.GameModel;
import com.verfut.front.verfut.front.service.GameService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private final WebClient webClient;

    public GameServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public List<GameModel> getAll() {
        return this.webClient.get()
                .uri("/games")
                .retrieve()
                .bodyToMono(List.class).block();
    }

    @Override
    public GameModel get(Long id, String noSuchElementException) {
        return null;
    }

    @Override
    public void save(GameModel item) {

    }

    @Override
    public void update(GameModel item) {

    }

    @Override
    public void delete(Long id) {

    }
}
