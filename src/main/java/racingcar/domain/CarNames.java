package racingcar.domain;

import racingcar.constant.ErrorMessage;
import racingcar.utils.CommonUtils;

public class CarNames {
    public static final String COMMA = ",";
    public static final int MAX_NAME_LENGTH = 5;
    private String names;

    public CarNames(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void validateNames(String names) {
        if (CommonUtils.isNullOrEmptyString(names)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_NULL_OR_EMPTY);
        }

        String [] splitNames = getSplitNames(names);
        for (int i = 0; i < splitNames.length; i++) {
            validateName(splitNames[i]);
        }
    }

    private void validateName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_NAME_LENGTH);
        }
    }

    private String[] getSplitNames(String names) {
        return names.split(COMMA);
    }
}
