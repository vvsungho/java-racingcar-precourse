package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarNames;
import racingcar.domain.CarNumber;
import racingcar.domain.CarStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {
    private Car car;
    private CarNumber carNumber;
    private CarNames carNames;

    @BeforeEach
    public void setUp() {
        car = new Car("A", 1);
        carNumber = new CarNumber(5);
        carNames = new CarNames("yoond,eundo,minbo");
    }

    @Test
    public void validateInputNumberThrowTest() {
        assertThrows(
                IllegalArgumentException.class,
                () -> carNumber.validateNumber(10)
        );
    }

    @Test
    public void validateInputNameThrowTest() {
        assertThrows(
                IllegalArgumentException.class,
                () -> carNames.validateNames(carNames.getNames())
        );
    }

    @Test
    public void isMoveTest() {
        CarStatus carStatus = car.move(new Car("B", 5));
        assertEquals(carStatus, CarStatus.MOVE);
    }

    @Test
    public void isStopTest() {
        CarStatus carStatus = car.move(new Car("C", 0));
        assertEquals(carStatus, CarStatus.MOVE);
    }
}
