package racingcar.domain;

import racingcar.constant.CarConstant;
import racingcar.utils.CommonUtils;
import racingcar.view.Message;

public class CarNumber {
    private final int number;

    public CarNumber(String number) {
        validateTryCountNumber(number);
        int parsingNumber = parsingStringToInt(number);
        this.number = parsingNumber;
    }

    public int getNumber() {
        return number;
    }

    public void validateTryCountNumber(String number) {
        validateCheckingIsEmptyNumber(number);

        int parsingNumber;
        try {
            parsingNumber = parsingStringToInt(number);
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(Message.ERROR_INPUT_TRY_NUMBER);
        }

        validateNumberRange(parsingNumber);
    }

    private void validateCheckingIsEmptyNumber(String number) {
        if (CommonUtils.isNullOrEmptyString(number)) {
            throw new IllegalArgumentException(Message.ERROR_INPUT_NULL_OR_EMPTY);
        }
    }

    private int parsingStringToInt(String number) {
        return Integer.parseInt(number);
    }

    private void validateNumberRange(int number) {
        if (number < CarConstant.MIN_VALUE || number > CarConstant.MAX_VALUE) {
            throw new IllegalArgumentException(Message.ERROR_NUMBER_RANGE);
        }
    }
}
