package com.task.rpsbe.controller;

import com.task.rpsbe.model.Hand;
import com.task.rpsbe.service.IPickService;
import com.task.rpsbe.service.IPlayService;
import com.task.rpsbe.service.IScoreService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlayController {

    private final IPickService iPickService;
    private final IPlayService iPlayService;
    private final IScoreService iScoreService;

    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(value = "/play", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public int playAHand() {
        Hand playerTwoHand = iPickService.pickAHand();
        int resultOfGame = iPlayService.playAHand(playerTwoHand);
        iScoreService.updateScore(resultOfGame);
        return resultOfGame;
    }
}
