package com.task.rpsbe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ScoreTests {
    private ScoreService scoreService;

    @BeforeEach
    private void setup() {
        scoreService = new ScoreService();
    }

    @Test
    public void shouldReturnEmptyScore() {
        Score emptyScore = new Score(0, 0, 0 ,0);
        Score result = scoreService.getScore();

        assertThat(result).isEqualTo(emptyScore);
    }

    @Test
    public void shouldReturnScoreWithOneGamePlayedAndOneDraw() {
        scoreService.updateScore(0);

        Score result = scoreService.getScore();

        assertThat(result).matches(r -> r.getTotalRoundsPlayed() == 1 && r.getTotalDraws() == 1);
    }

    @Test
    public void shouldReturnScoreWithOneGamePlayedAndPlayerOneWin() {
        scoreService.updateScore(1);

        Score result = scoreService.getScore();

        assertThat(result).matches(r -> r.getTotalRoundsPlayed() == 1 && r.getTotalWinsPlayerOne() == 1);
    }

    @Test
    public void shouldReturnScoreWithOneGamePlayedAndPlayerTwoWin() {
        scoreService.updateScore(2);

        Score result = scoreService.getScore();

        assertThat(result).matches(r -> r.getTotalRoundsPlayed() == 1 && r.getTotalWinsPlayerTwo() == 1);
    }

    @Test
    public void shouldReturnFilledScoreAfterMultipleUpdate() {
        scoreService.updateScore(0);
        scoreService.updateScore(1);
        scoreService.updateScore(2);
        scoreService.updateScore(0);
        scoreService.updateScore(1);
        scoreService.updateScore(2);
        scoreService.updateScore(0);
        scoreService.updateScore(1);
        scoreService.updateScore(2);

        Score result = scoreService.getScore();

        assertThat(result).matches(r -> r.getTotalRoundsPlayed() == 9
                && r.getTotalDraws() == 3
                && r.getTotalWinsPlayerOne() == 3
                && r.getTotalWinsPlayerTwo() == 3
        );
    }
}
