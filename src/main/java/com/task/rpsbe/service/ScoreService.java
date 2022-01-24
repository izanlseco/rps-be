package com.task.rpsbe.service;

import com.task.rpsbe.model.Score;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ScoreService implements IScoreService {
    private final Score score = new Score(0, 0, 0 ,0);

    public void updateScore(int resultOfGame) {
        log.info("Updating the score with {}", resultOfGame);
        score.setTotalRoundsPlayed(score.getTotalRoundsPlayed() + 1);

        switch (resultOfGame) {
            case 0 -> score.setTotalDraws(score.getTotalDraws() + 1);
            case 1 -> score.setTotalWinsPlayerOne(score.getTotalWinsPlayerOne() + 1);
            case 2 -> score.setTotalWinsPlayerTwo(score.getTotalWinsPlayerTwo() + 1);
        }
    }

    public Score getScore() {
        log.debug("Returning {}", score);
        return score;
    }
}
