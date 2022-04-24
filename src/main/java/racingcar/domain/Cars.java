package racingcar.domain;

import racingcar.constant.CarConstant;
import racingcar.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carItems;

    public Cars(List<Car> carItems) {
        this.carItems = carItems;
    }

    public List<Car> getCarItems() {
        return carItems;
    }

    public static Cars createCars(String names) {
        String[] splitNames = getSplitNames(names);
        return new Cars(mapCar(splitNames));
    }

    private static List<Car> mapCar(String[] splitNames) {
        List<Car> carItems = new ArrayList<>();
        for (String name : splitNames) {
            carItems.add(Car.createCar(name));
        }
        return carItems;
    }

    private static String[] getSplitNames(String names) {
        return names.split(CarConstant.COMMA);
    }

    public Cars getWinnerCars() {
        List<Car> winnerCar = new ArrayList<>();
        int maxDistance = getMaxDistance();
        for (Car car : carItems) {
            addWinnerCar(winnerCar, car, maxDistance);
        }
        return new Cars(winnerCar);
    }

    private int getMaxDistance() {
        int max = 0;
        for (Car car : carItems) {
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
        for (Car car : winnerCars.getCarItems()) {
            winnerNames.add(car.getName());
        }
        return String.join(CarConstant.WINNER_NAME_DELIMITER, winnerNames);
    }

    @Override
    public Object clone() {
        List<Car> cloneCarItems = new ArrayList<>();
        for (Car car : carItems) {
            Car cloneCar = new Car(car.getName(), car.getDistance());
            cloneCarItems.add(cloneCar);
        }
        return new Cars(cloneCarItems);
    }
}
