package chap15_userfulClass;

public class _09_absMaxMinMRint {
    public static void main(String[] args) {
        int num1=123, num2=-456;
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2));

        //max, min
        System.out.println(Math.max(num1,num2));
        System.out.println(Math.min(num1,num2));

        //rint
        double num3 = 123.456;
        System.out.println(Math.rint(num3));
    }
}
