package racingcar.domain;

import racingcar.constant.CarConstant;
import racingcar.utils.CommonUtils;
import racingcar.view.Message;

public class CarNames {
    private final String names;

    public CarNames(String names) {
        validateNames(names);
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    private void validateNames(String names) {
        if (CommonUtils.isNullOrEmptyString(names)) {
            throw new IllegalArgumentException();
        }
        String[] splitNames = getSplitNames(names);
        for (String name : splitNames) {
            validateName(name);
        }
    }

    private void validateName(String name) {
        if (name.length() > CarConstant.MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(Message.ERROR_NAME_LENGTH);
        }
    }

    public static String[] getSplitNames(String names) {
        return names.split(CarConstant.COMMA);
    }
}
