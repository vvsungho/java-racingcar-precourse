package racingcar.domain;

public class Car {
    public static final int MOVE_MINIMUM_VALUE = 4;
    public static final int CAR_DISTANCE_INIT_VALUE = 0;

    private String name;
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
        return new Car(name, CAR_DISTANCE_INIT_VALUE);
    }

    public void move(int number) {
        if (matchMove(number)) {
            this.distance++;
        }
    }

    public boolean matchMove(int distance) {
        return distance >= MOVE_MINIMUM_VALUE;
    }
}
