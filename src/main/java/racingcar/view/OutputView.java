package racingcar.view;

import racingcar.constant.Message;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
import racingcar.domain.RacingGameHistory;

public class OutputView {
    public static void printRacingResult(RacingGame racingGame) {
        System.out.println(Message.RACING_RESULT);
        printRacingHistory(racingGame.getHistory());
        printRacingWinner(racingGame.getResult().getWinnerCars());
    }

    public static void printRacingHistory(RacingGameHistory history) {
        for (Cars cars : history.getCarsList()) {
            printCarsInfo(cars);
            System.out.println();
        }
    }

    public static void printCarsInfo(Cars cars) {
        for (Car car : cars.getCarItems()) {
            System.out.print(car.getName());
            System.out.print(Message.SPACING);
            System.out.print(Message.COLON);
            System.out.print(Message.SPACING);
            printCarMove(car.getDistance());
            System.out.println();
        }
    }

    public static void printCarMove(int distance) {
        while (distance-- > 0) {
            System.out.print(Message.DASH);
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    private static void printRacingWinner(Cars winnerCars) {
        System.out.print(
                Message.WINNER.replace("#{winnerName}", Cars.getWinnerNames(winnerCars.getWinnerCars()))
        );
    }
}
