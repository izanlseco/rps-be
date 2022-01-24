# Code Challenge
### Info
I've used Java OpenJDK 17, TDD with AssertJ, and some very basic testing of the controllers with Karate.
### Endpoints and payload examples

**Play endpoint:**

``
GET localhost:8080/play
``
#### Response example
#### Draw
    {
        0
    }
#### Player one wins
    {
        1
    }
#### Player two wins
    {
        2
    }
---
**Score endpoint:**

``
GET localhost:8080/score
``
#### Response example

    {
        "totalRoundsPlayed": 4,
        "totalWinsPlayerOne": 0,
        "totalWinsPlayerTwo": 3,
        "totalDraws": 1
    }
---
## Tests deployment
Karate does NOT start up the application under test. So first start the application with your IDE.

From IntelliJ IDEA, right-click on ``/test/java`` and click over "Run 'all tests'".
You can also right-click on the Java test-classes or the ``*.feature`` files to run a subset of the tests.