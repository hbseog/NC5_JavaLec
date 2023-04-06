package chap08_staric.clazz;

public class Weight {
    public void twoWeightSum() {
        int a = 76;
        int b = 65;
        String sum = Add.add(a, b, "kg");
        System.out.println(sum);

        sum = Add.add(a, b, "g");
    }

    public void wtoWeightGramSum() {
        int a = 76, b = 65;
        String sum = Add.add(a * 1000, b * 1000, "kg");
        System.out.println(sum);
    }

}
