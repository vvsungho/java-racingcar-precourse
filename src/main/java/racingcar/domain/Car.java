package racingcar.domain;

public class Car {
    public static final int MOVE_MINIMUM_VALUE = 4;
    public static final int CAR_DISTANCE_INIT_VALUE = 0;

    private final CarName carName;
    private final CarDistance carDistance;

    public Car(CarName carName, CarDistance carDistance) {
        this.carName = carName;
        this.carDistance = carDistance;
    }

    public static Car createCar(String name) {
        return new Car(new CarName(name), new CarDistance(CAR_DISTANCE_INIT_VALUE));
    }

    public CarDistance getCarDistance() {
        return carDistance;
    }

    public void move(int number) {
        if (matchMove(number)) {
            carDistance.increaseDistance();
        }
    }

    public boolean matchMove(int distance) {
        return distance >= MOVE_MINIMUM_VALUE;
    }
}
