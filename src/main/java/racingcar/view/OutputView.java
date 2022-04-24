package racingcar.view;

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
        }
    }

    public static void printCarsInfo(Cars cars) {
        for (Car car : cars.getCarItems()) {
            System.out.printf(Message.RACING_CAR_INFO, car.getName(), getCarMoveDash(car.getDistance()));
        }
        System.out.println();
    }

    public static String getCarMoveDash(int distance) {
        StringBuilder stringBuilder = new StringBuilder();
        while (distance-- > 0) {
            stringBuilder.append(Message.DASH);
        }

        return stringBuilder.toString();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    private static void printRacingWinner(Cars winnerCars) {
        System.out.printf(Message.WINNER, Cars.getWinnerNames(winnerCars.getWinnerCars()));
    }
}
