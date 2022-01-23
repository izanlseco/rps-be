package com.task.rpsbe.controller;

import com.task.rpsbe.model.Hand;
import com.task.rpsbe.service.IPickService;
import com.task.rpsbe.service.IPlayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PlayController {

    private final IPickService iPickService;
    private final IPlayService iPlayService;

    private PlayController(final IPickService iPickService, final IPlayService iPlayService) {
        this.iPickService = iPickService;
        this.iPlayService = iPlayService;
    }

    @RequestMapping(value = "/play", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int playAHand() {
        log.debug("Picking a hand with PickService");
        Hand playerTwoHand = iPickService.pickAHand();
        return iPlayService.playAHand(playerTwoHand);
    }
}
