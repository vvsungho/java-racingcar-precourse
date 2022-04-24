package racingcar.view;

import racingcar.utils.CommonUtils;

public class InputView {
    public static String printInputRacingCarNames() {
        System.out.println(Message.INPUT_RACING_CAR_NAMES);
        return CommonUtils.inputText();
    }

    public static String printInputTryCount() {
        System.out.println(Message.INPUT_TRY_COUNT);
        return CommonUtils.inputText();
    }
}
