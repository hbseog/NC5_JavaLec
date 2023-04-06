package homework_0321.middle;

public class middle {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();
        Calculator.Add add = Calc.new Add();
        Calculator.Sub sub = Calc.new Sub();
        Calculator.Mul mul = Calc.new Mul();
        Calculator.Div div = Calc.new Div();

        System.out.println(add.add(20,10));
        System.out.println(sub.sub(20,10));
        System.out.println(mul.mul(20,10));
        System.out.println(div.div(20,10));
    }
}
