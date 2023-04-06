package chap15_userfulClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _14_regex02 {
    public static void main(String[] args) {
        //[a-zA-Z0-9.-] => .-    -하나이상을 포함하는
        //{2,}2자리 이상, \\. = .표시
        String pattern = "[a-zA-Z0-9]{8,20}@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String email = "aaaaaaaa@b-bb.ccc";

        Pattern pt = Pattern.compile(pattern);
        Matcher m = pt.matcher(email);

        //find(): pattern과 일치하는경우 true, 아니면 false
        while (m.find()){
            //find()로 찾은 일치부분을 리턴
            System.out.println("이메일 주소: " + m.group());
        }
        //matches(): 전체문자열이 패턴이랑 일치하는지 검사
//        if(m.matches()) System.out.println("올바른형식");
//        else System.out.println("잘못된형식");
    }
}
