package study.clazz;

public class clazz_2 {
    //3. 두 문자열 을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
    public StringBuilder sumString(StringBuilder a, StringBuilder b){
        a.append(b);
        return a;
    }
}
