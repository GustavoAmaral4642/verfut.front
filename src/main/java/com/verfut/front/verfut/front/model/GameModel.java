package com.verfut.front.verfut.front.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameModel {

    private Long id;

    private String dateGame;

    private String numberRound;

    private List<ItemGameModel> itemGameModel = new ArrayList<>();
}
