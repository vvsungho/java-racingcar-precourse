package racingcar.constant;

public class ErrorMessage {
    public static String PREFIX_ERROR = "[ERROR] ";
    public static String ERROR_INPUT_NULL_OR_EMPTY = "값을 입력해주세요.";
    public static String ERROR_NUMBER_RANGE = PREFIX_ERROR + CarConstant.MIN_VALUE + "~" + CarConstant.MAX_VALUE + "사이의 숫자로 입력해주세요.";
    public static String ERROR_NAME_LENGTH = PREFIX_ERROR + "이름은 5글자 이하로 입력해주세요.";
}
