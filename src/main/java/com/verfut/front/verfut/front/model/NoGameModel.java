package com.verfut.front.verfut.front.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoGameModel {

    private Long id;

    private String team;

    private GameModel games;
}
