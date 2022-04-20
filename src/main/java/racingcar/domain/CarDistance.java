package racingcar.domain;

public class CarDistance {
    private int distance;

    public CarDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void increaseDistance() {
        distance++;
    }
}
