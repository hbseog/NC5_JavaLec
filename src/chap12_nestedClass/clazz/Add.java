package chap12_nestedClass.clazz;

public class Add implements Carc {
    @Override
    public void calculator(int a, int b) {
        Carc cal = new Carc() {
            @Override
            public void calculator(int a, int b) {
                System.out.println("결과는" + a+b);
            }
        };
        cal.calculator(10,20);
    }
}
