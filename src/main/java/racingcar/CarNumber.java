package racingcar;

public class CarNumber {
    public static final int MIX_VALUE = 0;
    public static final int MAX_VALUE = 9;
    private int number;

    public CarNumber(int number) {
        if (!validateNumber(number)) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static boolean validateNumber(int number) {
        return number >= MIX_VALUE && number <= MAX_VALUE;
    }
}
