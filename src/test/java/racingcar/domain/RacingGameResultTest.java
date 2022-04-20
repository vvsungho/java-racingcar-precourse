package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingGameResultTest {
    @Test
    public void validateCarResultTest() {
        String givenNames = "A,B";
        RacingGame racingGame = new RacingGame("A,B,C");
        RacingGameResult racingGameResult = racingGame.play();
        assertEquals(racingGameResult, givenNames);
    }
}
