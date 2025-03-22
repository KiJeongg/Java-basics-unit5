//Q1. Calculator 클래스를 상속하는 UpgradeCalculator를 만들고
// 값을 뺄 수 있는 minus 메서드를 추가 10 - 3 = 7 만들기

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

    class UpgradeCalculator extends Calculator {
        void minus(int val) {
            this.value -= val;

    }
}

public class Main {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());

    }
}