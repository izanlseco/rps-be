package com.task.rpsbe.controller;

import com.task.rpsbe.model.Score;
import com.task.rpsbe.service.IScoreService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ScoreController {
    private final IScoreService iScoreService;

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(value = "/score", produces = MediaType.APPLICATION_JSON_VALUE)
    public Score getScore() {
        return iScoreService.getScore();
    }
}
