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
public class ItemGameModel {

    private Long id;

    private String hourGame;

    private String teamA;

    private String totalGoalsTeamA;

    private String pointsReceivedTeamA;

    private String teamB;

    private String totalGoalsTeamB;

    private String pointsReceivedTeamB;

    private GameModel games;

}
