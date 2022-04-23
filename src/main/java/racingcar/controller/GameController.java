package racingcar.controller;

import racingcar.domain.CarNames;
import racingcar.domain.CarNumber;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {
    CarNames carNames;
    CarNumber carNumber;

    public void play() {
        boolean isValidInputNames = false;

        while (!isValidInputNames) {
            try {
                inputAndCreateCarNames();
                isValidInputNames = true;
            } catch (IllegalArgumentException illegalArgumentException) {
                OutputView.printMessage(illegalArgumentException.getMessage());
            }
        }

        boolean isValidInputNumber = false;
        while (!isValidInputNumber) {
            try {
                inputAndCreateCarNumber();
                isValidInputNumber = true;
            } catch (IllegalArgumentException illegalArgumentException) {
                OutputView.printMessage(illegalArgumentException.getMessage());
            }
        }

        RacingGame racingGame = new RacingGame(carNames.getNames());
        racingGame.play(carNumber.getNumber());

        OutputView.printRacingResult(racingGame);
    }

    private void inputAndCreateCarNames() {
        carNames = new CarNames(InputView.printInputRacingCarNames());
    }

    private void inputAndCreateCarNumber() {
        carNumber = new CarNumber(InputView.printInputTryCount());
    }
}
