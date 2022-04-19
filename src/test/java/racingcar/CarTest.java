package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("A", 1);
    }

    @Test
    public void 입력값_검증() {
        boolean result = CarNumber.validateNumber(0);
        assertEquals(result, true);
    }
}
