package com.task.rpsbe;

import com.task.rpsbe.model.Hand;
import com.task.rpsbe.service.PlayService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PlayTests {
    private PlayService playService;

    @BeforeEach
    public void setup() {
        playService = new PlayService();
    }

    @Test
    public void shouldDrawWhenRockIsChosen() {
        int result = playService.playAHand(Hand.ROCK);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldWinPlayerTwoWhenPaperIsChosen() {
        int result = playService.playAHand(Hand.PAPER);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldWinPlayerOneWhenScissorsIsChosen() {
        int result = playService.playAHand(Hand.SCISSORS);

        assertThat(result).isEqualTo(1);
    }
}
