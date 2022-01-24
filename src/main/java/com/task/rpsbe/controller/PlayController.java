package com.task.rpsbe.controller;

import com.task.rpsbe.model.Hand;
import com.task.rpsbe.service.IPickService;
import com.task.rpsbe.service.IPlayService;
import com.task.rpsbe.service.IScoreService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayController {

    private final IPickService iPickService;
    private final IPlayService iPlayService;
    private final IScoreService iScoreService;

    private PlayController(final IPickService iPickService,
                           final IPlayService iPlayService,
                           final IScoreService iScoreService) {
        this.iPickService = iPickService;
        this.iPlayService = iPlayService;
        this.iScoreService = iScoreService;
    }

    @RequestMapping(value = "/play", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int playAHand() {
        Hand playerTwoHand = iPickService.pickAHand();
        int resultOfGame = iPlayService.playAHand(playerTwoHand);
        iScoreService.updateScore(resultOfGame);
        return resultOfGame;
    }
}
