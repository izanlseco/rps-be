package com.task.rpsbe;

import com.task.rpsbe.model.Hand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@SpringBootTest
public class PlayTests {
    private PlayService playService;

    @BeforeEach
    public void setup() {
        playService = mock(PlayService.class);
    }

    @Test
    public void shouldDrawWhenRockIsChosen() {
        int result = playService.playAHand(Hand.ROCK);

        verify(playService, times(1)).playAHand();

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldWinPlayerTwoWhenPaperIsChosen() {
        int result = playService.playAHand(Hand.PAPER);

        verify(playService, times(1)).playAHand();

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldWinPlayerOneWhenScissorsIsChosen() {
        int result = playService.playAHand(Hand.SCISSORS);

        verify(playService, times(1)).playAHand();

        assertThat(result).isEqualTo(1);
    }
}
