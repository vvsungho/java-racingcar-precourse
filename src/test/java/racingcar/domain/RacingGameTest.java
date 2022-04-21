package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingGameTest {
    private RacingGame racingGame;

    @BeforeEach
    public void setUp() {
        racingGame = new RacingGame("yoon,lee,kim");
    }

    @Test
    void testMethod() {
        // given
        for (Car car : racingGame.getResult().getCars()) {
            car.move(2);
        }
        // when

        // then
    }
}
