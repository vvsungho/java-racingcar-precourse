package racingcar.constant;

import static racingcar.constant.CarConstant.MAX_VALUE;
import static racingcar.constant.CarConstant.MIN_VALUE;

public class Message {
    public static final String COLON = ":";
    public static final String COMMA = ",";
    public static final String DASH = "-";
    public static final String SPACING = " ";
    public static final String PREFIX_ERROR = "[ERROR] ";
    public static final String ERROR_INPUT_NULL_OR_EMPTY = "값을 입력해주세요.";
    public static final String ERROR_NUMBER_RANGE = PREFIX_ERROR + MIN_VALUE + "~" + MAX_VALUE + "사이의 숫자로 입력해주세요.";
    public static final String ERROR_NAME_LENGTH = PREFIX_ERROR + "이름은 5글자 이하로 입력해주세요.";
    public static final String ERROR_INPUT_TRY_NUMBER = PREFIX_ERROR + "숫자만 입력 가능합니다.";
    public static final String RACING_RESULT = "실행 결과";
    public static final String WINNER = "최종 우승자는 #{winnerName} 입니다.";
}
