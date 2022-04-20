package racingcar.domain;

import racingcar.constant.ErrorMessage;

public class CarName {
    public static final int MAX_NAME_LENGTH = 5;
    private String name;

    public CarName(String name) {
        validateName(name);
        this.name = name;
    }
    
    private void validateName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_NAME_LENGTH);
        }
    }
}
