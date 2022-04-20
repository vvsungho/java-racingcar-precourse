package racingcar.domain;

import racingcar.constant.ErrorMessage;
import racingcar.utils.CommonUtils;

public class CarNumber {
    private int number;

    public CarNumber(String number) {
        validateTryCountNumber(number);
        int parsingNumber = Integer.parseInt(number);
        this.number = parsingNumber;
    }

    public void validateTryCountNumber(String number) {
        if (CommonUtils.isNullOrEmptyString(number)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_NULL_OR_EMPTY);
        }
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_TRY_NUMBER);
        }
    }
}
