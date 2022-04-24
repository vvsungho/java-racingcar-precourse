package racingcar.constant;

import static racingcar.constant.CarConstant.MAX_VALUE;
import static racingcar.constant.CarConstant.MIN_VALUE;

public class Message {
    public static final String COLON = ":";
    public static final String DASH = "-";
    public static final String INPUT_RACING_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String INPUT_TRY_COUNT = "시도할 회수는 몇회인가요?";
    public static final String PREFIX_ERROR = "[ERROR] ";
    public static final String ERROR_INPUT_NULL_OR_EMPTY = PREFIX_ERROR + "값을 입력해주세요.";
    public static final String ERROR_NUMBER_RANGE = PREFIX_ERROR + MIN_VALUE + "~" + MAX_VALUE + "사이의 숫자로 입력해주세요.";
    public static final String ERROR_NAME_LENGTH = PREFIX_ERROR + "이름은 5글자 이하로 입력해주세요.";
    public static final String ERROR_INPUT_TRY_NUMBER = PREFIX_ERROR + "숫자만 입력 가능합니다.";
    public static final String RACING_RESULT = "실행 결과";
    public static final String RACING_CAR_INFO = "%s : %s\n";
    public static final String WINNER = "최종 우승자는 %s 입니다.";
}
