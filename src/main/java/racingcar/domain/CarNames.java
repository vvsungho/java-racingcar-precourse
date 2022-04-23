package racingcar.domain;

import racingcar.constant.CarConstant;
import racingcar.constant.Message;
import racingcar.utils.CommonUtils;

public class CarNames {
    private String names;

    public CarNames(String names) {
        validateNames(names);
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public boolean isValidNames(String names) {
        try {
            validateNames(names);
            return true;
        } catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    private void validateNames(String names) {
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
        CommonUtils.isNullOrEmptyString(names);
        return names.split(Message.COMMA);
    }
}
