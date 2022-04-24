package racingcar.domain;

import racingcar.constant.CarConstant;

public class Car {
    private final String name;
    private int distance;

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public static Car createCar(String name) {
        return new Car(name, CarConstant.CAR_DISTANCE_INIT_VALUE);
    }

    public void move(int number) {
        if (matchMove(number)) {
            increaseDistance();
        }
    }

    private void increaseDistance() {
        this.distance++;
    }

    public boolean matchMove(int distance) {
        return distance >= CarConstant.MOVE_MINIMUM_VALUE;
    }
}
