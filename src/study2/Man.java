package study2;
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

class MaxLimitCalculator extends Calculator{
	
}

public class Man {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        System.out.println(cal.getValue());  // 10 출력
        cal.minus(5);
        System.out.println(cal.getValue());  // 5
        
        int i=0;

        do {

            ++i;

            System.out.println(i);

        } while (i<=5);
    }
}