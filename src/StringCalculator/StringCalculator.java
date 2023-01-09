package StringCalculator;

public class StringCalculator {
    public int add(String text) {
        //문자가 비었거나 null
        if (text == null || text.isEmpty()) {
            return 0;
        }
        //숫자 두 개를 구분자 ,(콤마)로 가졌을 경우
        if (text.contains(",")) {
            String[] values = text.split(",");
            int sum = 0;
            for (String value : values) {
                sum += Integer.parseInt(value);
            }
            return sum;
        }
        //숫자 하나만 문자열로 입력받은 경우
        return Integer.parseInt(text);
    }
}
