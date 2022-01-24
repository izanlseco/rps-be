package com.task.rpsbe.karate;

import com.intuit.karate.junit5.Karate;

public class KarateTests {
    @Karate.Test
    Karate testPlayController() {
        return Karate.run("play").relativeTo(getClass());
    }
    @Karate.Test
    Karate testScoreController() {
        return Karate.run("score").relativeTo(getClass());
    }
}
