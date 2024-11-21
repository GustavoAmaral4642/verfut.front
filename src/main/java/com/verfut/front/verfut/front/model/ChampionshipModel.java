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
public class ChampionshipModel {

    private Long id;

    private String name;

    private String categoryName;

    private Long initalAgeCategory;

    private Long finalAgeCategory;

    private String initialDate;

    private String finalDate;

    private List<TeamModel> teams = new ArrayList<>();

}
