package racingcar.domain;

public enum CarStatus {
    MOVE, STOP;

    public boolean isMove(CarStatus carStatus) {
        return MOVE == carStatus;
    }

    public boolean isStop(CarStatus carStatus) {
        return STOP == carStatus;
    }
}
