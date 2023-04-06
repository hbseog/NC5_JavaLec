package homework_0323;

public class middle1 {
    public static void main(String[] args) throws InterruptedException {
        //1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
        //    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
        StringBuffer hello = new StringBuffer(30);
        hello.append("hello");
        System.out.println(hello.capacity());
        System.out.println(hello.length());
        String[] bit = {"b","i","t",null};
        int j=0;
        for(int i=0;hello.length()!=30;i++){
            if(bit[j]==null) j-=(bit.length-1);
            hello.append(bit[j]);
            j++;
            System.out.println(hello);
            System.out.println(hello.capacity());
        }
        System.out.println(hello);
        System.out.println("최종 버퍼 크기: " + hello.capacity());
        hello.append("a");
        System.out.println("최종 버퍼 +1 크기: " + hello.capacity());
    }
}
