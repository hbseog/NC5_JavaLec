package chap15_userfulClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class _17_bigDecimal {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(1.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.14);
        BigDecimal bd3 = new BigDecimal(12.111222333);

        //반올림 모드
        //divide: 나눌 때 오차가 있을 수 있으므로 반올림모드를 지정
        //MathContext(int precision) => precision은 연산에 사용할 총 자릿수, 정수의 자리수 포함으로 셈?1.111=>4
        System.out.println(bd2.divide(bd1, new MathContext(3, RoundingMode.CEILING)));
        //setScale: 소수점 자리수를 다시 설정
        //.145 3자리에서 .14500으로 변경
        System.out.println(bd2.setScale(5,RoundingMode.FLOOR));
        //.732에서 .7320 4자리로 변경
        System.out.println(bd1.setScale(4,RoundingMode.UP));
        //.111222333 9자리에서 3자리로 변셩하는데 양수면 올림 음수면 버림
        System.out.println(bd3.setScale(3,RoundingMode.DOWN));
    }
}
