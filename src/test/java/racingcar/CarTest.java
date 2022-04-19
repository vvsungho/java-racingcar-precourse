package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("A", 1);
    }

    @Test
    public void validateInputNumber() {
        boolean result = CarNumber.validateNumber(0);
        assertTrue(result);
    }

    @Test
    public void isMoveTest() {
        CarStatus carStatus = car.move(new Car("B", 5));
        assertEquals(carStatus, CarStatus.MOVE);
    }
}
