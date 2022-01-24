package com.task.rpsbe.controller;

import com.task.rpsbe.model.Score;
import com.task.rpsbe.service.IScoreService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {
    private final IScoreService iScoreService;

    public ScoreController(final IScoreService iScoreService) {
        this.iScoreService = iScoreService;
    }

    @RequestMapping(value = "/score", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Score getScore() {
        return iScoreService.getScore();
    }
}
