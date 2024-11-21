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
public class TeamModel {

    private Long id;

    private String name;

    private ChampionshipModel championship;

    private List<PlayerModel> players = new ArrayList<>();
}
