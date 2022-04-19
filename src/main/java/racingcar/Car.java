package racingcar;

public class Car {
    public static final int MOVE_MINIMUM_VALUE = 5;
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

    public CarStatus move(Car car) {
        return matchMove(car.getDistance()) ? CarStatus.MOVE : CarStatus.STOP;
    }

    private boolean matchMove(int distance) {
        return distance >= MOVE_MINIMUM_VALUE;
    }
}
