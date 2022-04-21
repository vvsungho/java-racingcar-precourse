package racingcar.domain;

import racingcar.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static final String COMMA = ",";

    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public static Cars createCars(String names) {
        String[] splitNames = getSplitNames(names);
        return new Cars(mapCar(splitNames));
    }

    private static List<Car> mapCar(String[] splitNames) {
        List<Car> cars = new ArrayList<>();
        for (String name : splitNames) {
            cars.add(Car.createCar(name));
        }
        return cars;
    }

    private static String[] getSplitNames(String names) {
        CommonUtils.isNullOrEmptyString(names);
        return names.split(COMMA);
    }
}
