package chap18_enum;

public class _06_abstractMethodEnum {
    public static void main(String[] args) {
        Calculator add = Calculator.PLUS;
        int result = add.calculator(10, 5);
        System.out.println(result);

//        Calculator[] cArr = Calculator.values();
//        for (Calculator c : cArr) {
//            System.out.println(c.calculate(10, 0));
//        }
        Season[] se = Season.values();
        for (Season s : se) {
            System.out.println(s.toString());
        }
    }
}