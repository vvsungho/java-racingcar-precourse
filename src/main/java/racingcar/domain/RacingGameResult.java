package racingcar.domain;

public class RacingGameResult {
    private String winnerNames;

    public RacingGameResult(String winnerNames) {
        this.winnerNames = winnerNames;
    }

    public String getUserName() {
        return winnerNames;
    }
}
