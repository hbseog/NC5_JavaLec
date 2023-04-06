package homework_0404;

public class lambda_02 {
    public static void main(String[] args) {
        System.out.println(action((a,b)->(a.append(b).reverse())));
        System.out.println(action(StringBuilder :: append));
        action2(StringBuilder :: reverse);
    }
    public static StringBuilder action(CombineStrBuilder csb){
        StringBuilder s1 = new StringBuilder("abc");
        StringBuilder s2 = new StringBuilder("xyz");
        StringBuilder sb = csb.com(s1, s2);
        return sb;
    }
    public static void action2(Reverse r){
        StringBuilder sb = r.reverse(action(StringBuilder :: append));
        System.out.println(sb);
    }
}
