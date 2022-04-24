package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.view.Message;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarsTest {
    @ParameterizedTest
    @DisplayName("Car 객체 생성 테스트")
    @CsvSource(value = {"yoon,lee,kim:3", "yoon,lee:2", "yoon:1"}, delimiter = ':')
    void validateCreateCarsTest(String input, String expected) {
        // given
        // when
        Cars cars = Cars.createCars(input.split(Message.COLON)[0]);
        // then
        assertEquals(cars.getCarItems().size(), Integer.parseInt(expected));
    }

    @ParameterizedTest
    @DisplayName("distance 결과 검증")
    @CsvSource(value = {"9,1,2:yoon", "5,5,1:yoon, lee", "5,5,5:yoon, lee, kim"}, delimiter = ':')
    void validateExpectedDistanceTest() {
        // given
        // when


        // then
    }
}
