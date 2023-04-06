package homework_0321.middle;

public class Calculator {
    public int a;
    public int b;
    public class Add extends Calculator{
        public int add(int a, int b){
            this.a = a;
            return a+b;
        }
    }
    public class Sub{
        public int sub(int a, int b){
            return a-b;
        }
    }
    public class Mul{
        public int mul(int a, int b){
            return a*b;
        }
    }
    public class Div{
        public int div(int a, int b){
            return a/b;
        }
    }
}
