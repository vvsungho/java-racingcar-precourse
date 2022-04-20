package racingcar.controller;

import racingcar.domain.CarName;
import racingcar.utils.CommonUtils;
import racingcar.view.InputView;

public class GameController {
    public void play() {
        InputView.inputRacingCarNames();
        CarName carName = new CarName(CommonUtils.inputText());

        InputView.inputTryCount();
    }
}
