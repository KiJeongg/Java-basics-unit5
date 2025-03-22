//Q2. 클래스 상속하고 메서드 오버라이딩 하기
//객체 변수 value 가 100 보다 큰 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스 만들기


class Calculator1 {
    int value;

    Calculator1() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}
    class MaxLimCalculator extends Calculator1 {
     void add(int val) {
         this.value += val;
        if(this.value > 100) {
            this.value = 100;
        }
     }

}

public class Main2 {
    public static void main(String[] args){
    MaxLimCalculator cal = new MaxLimCalculator();
    cal.add(50);
    cal.add(80);
    System.out.println(cal.getValue());
}
}
