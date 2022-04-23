package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.constant.Message;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
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

    @ParameterizedTest
    @DisplayName("distance 결과 검증")
    @CsvSource(value = {"1,1,1:0", "5,1,2:1", "9,8,1:2", "5,6,7:3"}, delimiter = ':')
    void validateExpectedDistanceTest(String input, String expected) {
        // given
        Car car = Car.createCar("yoon");
        // when
        String[] moveNumberArray = input.split(Message.COLON)[0].split(Message.COMMA);
        for (String number : moveNumberArray) {
            car.move(Integer.parseInt(number));
        }
        // then
        assertEquals(car.getDistance(), Integer.parseInt(expected));
    }
}
