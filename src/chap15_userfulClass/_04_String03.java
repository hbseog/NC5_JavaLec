package chap15_userfulClass;

public class _04_String03 {
    public static void main(String[] args) {
        String str1 = "bit-naver-cloud";
        String str2 = "kiaCar";
        String str3 = "aBcDeF";
        int num1 = 1234;
        double num2 = 1234.5678;
        boolean a = true;

        //특정문자로 문자열 자르기
        String[] strArr = str1.split("-");
        for(String s : strArr){
            System.out.println(s);
        }
        //인덱스로 문자열 자르기
        System.out.println(str2.substring(4));
        System.out.println(str2.substring(2,4));
        System.out.println(str2.substring(str2.indexOf('a')));
        System.out.println(str2.substring(1,(str2.length())));
        
        //소문자 치환=>.jpg, .JPG 이렇게 올 때
        System.out.println(str3.toLowerCase());
        //대문자 치환
        System.out.println(str3.toUpperCase());
        String str4 = "              aaabbb     ddd    ";
        
        //앞뒤 공백 없애기
        System.out.println(str4.trim());

        //다른 타입의 값을 String으로 변환
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String s3 = String.valueOf(a);

        //Integer를 사용해서 객체로 만든 다름에 toString으로 변환함.
        String s4 = Integer.valueOf(num1).toString();

        System.out.println(s1 + ", " + s2 + ", " + s3 + ", " + s4);
    }
}
