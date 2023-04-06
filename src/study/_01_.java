package study;


class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class UpgradeCalculator extends Calculator{
	void minus(int val) {
		this.value -= val;
	}
}

public class _01_ {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(4);
        System.out.println(cal.getValue());  // 10 출력
    }
}