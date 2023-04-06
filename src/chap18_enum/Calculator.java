package chap18_enum;

public enum Calculator {
    PLUS("+"){
        public int calculator(int a, int b){
            return a+b;
        }
    }, MINUS("-") {
        public int calculator(int a, int b) {
            return a-b;
        }
    },MULTIPLE("*") {
        public int calculator(int a, int b) {
            return a*b;
        }
    },DIVIDE("/") {
        public int calculator(int a, int b) {
            if (b==0) throw new  ArithmeticException("분모가 0이 될 수 없습니다.");
            return a/b;
        }
    };
    private String operator;
    Calculator(String operator){
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    //추상메소드 선언
    public abstract int calculator(int a, int b);
}
