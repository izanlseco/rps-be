package com.task.rpsbe.karate;

import com.intuit.karate.junit5.Karate;

public class KarateTests {
    @Karate.Test
    Karate testPickController() {
        return Karate.run("play_hand").relativeTo(getClass());
    }
}