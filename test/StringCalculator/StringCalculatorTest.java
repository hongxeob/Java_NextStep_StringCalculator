package StringCalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    private StringCalculator cal;

    //테스트 전 항상 초기화
    @Before
    public void setup() {
        cal = new StringCalculator();
    }

    //입력받을 문자가 null or 빈 경우
    @Test
    public void add_null_or_empty() {
        assertEquals(0, cal.add(""));
        assertEquals(0, cal.add(null));
    }

    //문자 하나만 입력 받은 경우
    @Test
    public void add_singleNum() {
        assertEquals(1, cal.add("1"));
    }

    //숫자 두개 이상을 구분자 ,(콤마)로 입력받는 경우
    @Test
    public void add_구분자_콤마_콜론() {
        assertEquals(3, cal.add("1,1:1"));
    }

    //커스텀 구분자가 있는 경우
    @Test
    public void add_커스텀구분자() {
        assertEquals(3, cal.add("//!\n1!2"));
    }

    //정수가 아닌 음수가 들어간 경우 예외
    @Test(expected = RuntimeException.class)
    public void add_음수() throws Exception {
        cal.add("-1,2,3");
    }
}