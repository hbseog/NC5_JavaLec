package chap20_lambda;

import chap20_lambda.clazz.UserChar;

public class CustomString {
    String str;
    public CustomString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    public void changeStr(char ch, UserChar us){
        this.str = us.findUserChar(ch,this.str);
    }

    @Override
    public String toString() {
        return "CustomString{" +
                "str='" + str + '\'' +
                '}';
    }
}
