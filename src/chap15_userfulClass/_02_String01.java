package chap15_userfulClass;

public class _02_String01 {
    public static void main(String[] args) {
        //문자열 객체생성
        String str1 = "bitcamp";//새로 객체를 만든다.
        String str2 = new String("bitcamp");
        //이미 생성된 동일한 문자열이 있으면 그 문자열을 사용한다.
        // str2 = "naver";
        //문자열을 공유하고싶지 않으면 새로운 문자열을 생성자를 통해 만든다.
        char[] chArr = {'b','i','c','a','m','p'};
        
        //같은 문자열인지 비교
        String str3 = new String(chArr);
        if(str1.equals(str3)&&str2.equals(str3)){
            System.out.println("str1, str2, str3는 같은 문자열입니다.");
        }
        else {
            System.out.println("str1, str2, str3는 다른 문자열입니다.");
        }
        
        //문자열에서 해당 인덱스의 문자 확인
        char ch = str1.charAt(4);
        System.out.println("str1의 index 4에 있는 문자는" + ch + " 입니다.");
        
        //두 문자열 같은지 비교
        if(str1.compareTo(str2)==0){
            System.out.println("같습니다.");
        }
        else System.out.println("다릅니다.");
        System.out.println(str1.concat("naver cloud"));
    }
}
