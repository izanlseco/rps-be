package com.task.rpsbe.service;

import com.task.rpsbe.model.Score;

public interface IScoreService {
    void updateScore(int resultOfGame);
    Score getScore();
}
