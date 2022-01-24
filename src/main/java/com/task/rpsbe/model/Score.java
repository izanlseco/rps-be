package com.task.rpsbe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Score {
    private int totalRoundsPlayed;
    private int totalWinsPlayerOne;
    private int totalWinsPlayerTwo;
    private int totalDraws;
}
