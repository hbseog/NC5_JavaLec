package chap20_lambda;

import chap20_lambda.clazz.CompareStr;

public class _07_compareString {
    public static void main(String[] args) {
        action(String :: equals);
        //action2(String :: indexOf);
//        String a = "aaa";
//        a.equals("aaa");
//        a.indexOf('a');
    }
    public static void action(CompareStr cs){
        boolean result = cs.compareStr("bit", "byte");
        boolean result2 = cs.compareStr("naver", "naver");
        System.out.println(result);
        System.out.println(result2);
    }
//    public static void action2(Test ts){
//        int t = ts.test("bbaa",'a');
//        System.out.println(t);
//    }
}
