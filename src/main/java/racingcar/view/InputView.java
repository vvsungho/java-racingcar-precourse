package racingcar.view;

public class InputView {
    private static final String INPUT_RACING_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_TRY_COUNT = "시도할 회수는 몇회인가요?";

    public static void inputRacingCarNames() {
        System.out.println(INPUT_RACING_CAR_NAMES);
    }

    public static void inputTryCount() {
        System.out.println(INPUT_TRY_COUNT);
    }
}