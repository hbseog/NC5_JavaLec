package chap12_nestedClass;

public class _01_innerStaticNestedClass{
    //인스턴스클래스 선언
    class Add{
        int num1 = 100;
        //static변수는 static으로 선언된 static클래스에서만 사용 가능하다.
        //static int num2 = 100; => 에러
        //상수로 선언된 static변수는 사용가능
        final static int num2 = 300;
        //상수라서 static 지정 가능
        int result = num1+num2;
    }
    //정적 중첩 클래스 선언
    static class Sub{
        static int num3 = 200;
        static int num4 = 100;
        static int result1 = num3-num4;
    }
    public static void main(String[] args) {
        //중첩클래스의 사용
        System.out.println(Sub.result1);

        //Add add = new Add();
        //외부클래스에 객체를 생성하지 않고, 인스턴스 클래스의 객체를 생성하면 에러발생 => 클래스 자체가 저장되지 않아서 그런듯?

        System.out.println(Add.num2);
    }
}
