package racingcar.utils;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class CommonUtils {
    public static final String COMMA = ",";
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 9;

    public static boolean isNullOrEmptyString(String str) {
        return str == null || str == "";
    }

    public static String inputText() {
        return Console.readLine();
    }

    public static int getRandomNumber(int startNumber, int endNumber) {
        return Randoms.pickNumberInRange(MIN_VALUE, MAX_VALUE);
    }
}
