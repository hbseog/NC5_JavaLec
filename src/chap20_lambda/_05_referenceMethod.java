package chap20_lambda;

import chap20_lambda.clazz.Convertor;
import chap20_lambda.clazz.MoneyConvertor;

public class _05_referenceMethod {
    public static void main(String[] args) {
        action(MoneyConvertor :: Convert);


        MoneyConvertor mc = new MoneyConvertor();
        //static 메소드는 클래스 원령에서 바로 참조
        action(mc :: instanceConvert);
    }
    public static void action(Convertor convertor){
        int result = convertor.conv(1000000,'$');
        System.out.println("변환된 돈: " + result + "$");
    }
}
