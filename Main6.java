//Q6.생성자와 초깃값 설정하기
//다음은 Calculator 객체를 생성하고 값을 더한 후, 그 결괏값을 출력하는 예제이다.
// 하지만 코드를 실행하면 오류가 발생한다. 오류가 발생하지 않도록 코드를 수정해 보자.

class Calculator4 {
    Integer value;

    Calculator4() {
        this.value = 0; // 2. 이걸로 초깃값을 생성해줘야됨
    }
    void add(int val) {
        this.value += val;
    }
    public Integer getValue(){
        return this.value;
    }
}
public class Main6 {
    public static void main(String[] args){
        Calculator4 cal = new Calculator4();
        cal.add(3);// 1. 그냥쓰면 여기서 NullPointerException 발생
        System.out.println(cal.getValue());
    }

}
