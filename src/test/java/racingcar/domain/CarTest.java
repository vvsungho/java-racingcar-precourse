package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void validateInputNumberThrowTest() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new CarNumber("10")
        );
    }

    @Test
    public void validateInputNameThrowTest() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Cars.createCars("AAAAA,BBBBBBB")
        );
    }

    @Test
    public void isMoveTest() {
        Car car = Car.createCar("A");
        boolean result = car.matchMove(5);
        assertTrue(result);
    }

    @Test
    public void isStopTest() {
        Car car = Car.createCar("A");
        boolean result = car.matchMove(3);
        assertFalse(result);
    }

    @Test
    public void validateInputTryNumberTest() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new CarNumber("10")
        );
    }

    @Test
    void testMethod() {
        // given

        // when

        // then
    }
}
