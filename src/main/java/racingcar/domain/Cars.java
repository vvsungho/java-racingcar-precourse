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

    public Cars getWinnerCars() {
        List<Car> winnerCar = new ArrayList<>();
        int maxDistance = getMaxDistance();
        for (Car car : cars) {
            addWinnerCar(winnerCar, car, maxDistance);
        }
        return new Cars(winnerCar);
    }

    private int getMaxDistance() {
        int max = 0;
        for (Car car : cars) {
            max = CommonUtils.isGreaterThanNumber(car.getDistance(), max) ? car.getDistance() : max;
        }
        return max;
    }

    private void addWinnerCar(List<Car> winnerCars, Car car, int maxDistance) {
        if (isMaxDistanceCar(car, maxDistance)) {
            winnerCars.add(car);
        }
    }

    private boolean isMaxDistanceCar(Car car, int maxDistance) {
        return car.getDistance() == maxDistance;
    }

    public static String getWinnerNames(Cars winnerCars) {
        List<String> winnerNames = new ArrayList<>();
        for (Car car : winnerCars.getCars()) {
            winnerNames.add(car.getName());
        }
        return String.join(",", winnerNames);
    }
}
