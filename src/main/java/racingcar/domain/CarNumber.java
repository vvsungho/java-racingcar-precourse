package racingcar.domain;

import racingcar.constant.CarConstant;
import racingcar.constant.ErrorMessage;

public class CarNumber {

    private int number;

    public CarNumber(int number) {
        validateNumber(number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void validateNumber(int number) {
        if (number < CarConstant.MIN_VALUE || number > CarConstant.MAX_VALUE) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_NUMBER_RANGE);
        }
    }
}
