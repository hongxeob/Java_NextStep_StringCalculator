package StringCalculator;

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

    //문자열을 split해 주는 메서드
    private static String[] split(String text) {
        String[] values = text.split(",");
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
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }


}
