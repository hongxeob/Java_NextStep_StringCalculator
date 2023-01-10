package StringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String text) {
        if (isBlank(text)) {
            return 0;
        }
        return sum(toInts(split(text)));
    }

    //문자열이 비거나 null 체크 메서드
    private static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    //1.문자열에 커스텀 구분자가 있다면 커스텀 구분자 split 메서드
    //2.커스텀 구분자 없다면 default(,:) 구분자로 split
    //더 나눌 수 있지 않을까?!
    private static String[] split(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }
        String[] values = text.split(",|:");
        return values;
    }

    //더하는 메서드
    private int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    //정수화 하는 메서드
    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < numbers.length; i++) {
            int number = checkPositive(values[i]);
            numbers[i] = number;
        }
        return numbers;
    }

    //음수 체크 메서드
    private static int checkPositive(String values) {
        int number = Integer.parseInt(values);
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }
}
