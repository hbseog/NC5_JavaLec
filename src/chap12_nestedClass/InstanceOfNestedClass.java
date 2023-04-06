package chap12_nestedClass;
class NestedClass{
    class Add{
        int num1;
        int num2;
        int result;
        int add(){
            result=num1+num2;
            return result;
        }
        final static int a=1;
    }
    static class Sub{
        static int num3;
        static int num4;
        static int result1;
        static int sub(){
            result1 = num3-num4;
            return result1;
        }
    }
}
public class InstanceOfNestedClass {
    public static void main(String[] args) {
        //1. 정적 중첩 클래스의 사용
        NestedClass.Sub.num3 = 10;
        NestedClass.Sub.num4 = 5;
        System.out.println(NestedClass.Sub.sub());
        
        //2. 인스턴스 중첩 클래스의 사용
        //2-1. 외부클래스의 객체를 생성
        NestedClass nc = new NestedClass();
        //2-2. 중첩클래스의 객체생성
        NestedClass.Add add = nc.new Add();
        add.num1 = 12;
        add.num2 = 11;
        System.out.println(add.add());
        
        //final static으로 선언된 상수는 객체없이도 접근 가능
        System.out.println(NestedClass.Add.a);
    }
}
