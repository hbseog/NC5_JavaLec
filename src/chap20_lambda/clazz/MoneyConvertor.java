package chap20_lambda.clazz;
public class MoneyConvertor {
    public static int Convert(int money, char c){
        int convertMoney = 0;
        switch (c){
            case '$':
                convertMoney = money /1300;
                break;
            case '\\':
                convertMoney = money*1300;
                break;
            default:
                convertMoney = -1;
                break;
        }
        return convertMoney;
    }
    public int instanceConvert(int money, char c){
        int convertMoney = 0;
        switch (c){
            case '$':
                convertMoney = money /1300;
                break;
            case '\\':
                convertMoney = money*1300;
                break;
            default:
                convertMoney = -1;
                break;
        }
        return convertMoney;
    }
}
