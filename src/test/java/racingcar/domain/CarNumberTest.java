package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNumberTest {
    @Test
    @DisplayName("move 실행 횟수 숫자 입력값 예외 테스트")
    public void validateCarNumberInputThrowTest() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new CarNumber("10")
        );
    }
}
