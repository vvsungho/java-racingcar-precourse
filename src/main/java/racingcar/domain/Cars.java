package racingcar.domain;

import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> answers) {
        cars = answers;
    }

    public static CarResult play(List<Car> cars) {
        // TODO: production code 작성
        return new CarResult(cars.get(0).getName());
    }
}
