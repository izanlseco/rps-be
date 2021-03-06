package com.task.rpsbe.service;

import com.task.rpsbe.model.Hand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PlayService implements IPlayService {
    public int playAHand(Hand playedHand) {
        log.debug("Player one has ROCK and player two has {}", playedHand);
        return switch (playedHand.name()) {
            case "ROCK" -> 0;
            case "PAPER" -> 2;
            case "SCISSORS" -> 1;
            default -> throw new IllegalStateException("Unexpected hand");
        };
    }
}
