package chap18_enum;

public class _02_withDefaultEnum {
    public static void main(String[] args) {
        //DefaultMonth형의 변수 선언
        //DefaultMonth.JAN을 값으로 갖는 열거형 객체가 생성
        DefaultMonth jan = DefaultMonth.JAN;
        //열거형 객체의 이름(상수의 이름): JAN
        System.out.println(jan);
        //해당 상수의 인덱스
        System.out.println(jan.ordinal());
        //ordinal() => 해상 상수의 인덱스 (몇 번째 상수인지 나타남)
        System.out.println(DefaultMonth.AUG);
        //열거형 객체의 이름(상수의 이름): AUG
    }

}
