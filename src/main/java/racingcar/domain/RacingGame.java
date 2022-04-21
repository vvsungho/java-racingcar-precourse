package racingcar.domain;

import racingcar.utils.CommonUtils;

import static racingcar.constant.CarConstant.MAX_VALUE;
import static racingcar.constant.CarConstant.MIN_VALUE;

public class RacingGame {
    private final Cars cars;

    public RacingGame(String names) {
        this.cars = Cars.createCars(names);
    }

    public Cars getResult() {
        return cars;
    }

    public void play(int number) {
        for (Car car : cars.getCars()) {
            moveIterator(car, number);
        }
    }

    private void moveIterator(Car car, int number) {
        for (int i = 0; i < number; i++) {
            move(car);
        }
    }

    private void move(Car car) {
        car.move(CommonUtils.getRandomNumber(MIN_VALUE, MAX_VALUE));
    }
}
