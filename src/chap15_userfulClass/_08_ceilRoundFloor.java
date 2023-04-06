package chap15_userfulClass;

public class _08_ceilRoundFloor {
    public static void main(String[] args) {
        double num = 123.45678;

        System.out.println(Math.ceil(num));
        System.out.println((float) Math.round(num*100)/100);//소수점 자릿수 변경
        System.out.println(Math.floor(num));
        int a = Math.min(1,1);
        System.out.println(a);
    }
}
