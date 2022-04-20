package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarResultTest {
    @Test
    public void validateCarResultTest() {
        CarResult carResult = Cars.play(Arrays.asList(new Car("A", 1), new Car("B", 5), new Car("C", 9)));
        assertEquals(carResult.getUserName(), "A");
    }
}
