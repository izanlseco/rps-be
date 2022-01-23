package com.task.rpsbe.service;

import com.task.rpsbe.model.Hand;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Random;

@Slf4j
public class PickService implements IPickService {

    private final Random random = new Random();
    private final List<Hand> listOfHand = List.of(Hand.values());

    public Hand pickAHand() {
        log.info("Choosing a random hand");
        return randomHandPicker();
    }

    private Hand randomHandPicker() {
        return listOfHand.get(random.nextInt(listOfHand.size()));
    }
}
