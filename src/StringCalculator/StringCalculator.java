package StringCalculator;

public class StringCalculator {
    public int add(String text) {
        //문자가 비었거나 null
        if (text == null || text.isEmpty()) {
            return 0;
        }
        //숫자를 구분자 ,(콤마)로 가졌을 경우
        String[] values = text.split(",");
        int sum = 0;
        for (String value : values) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }
}
