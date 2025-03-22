//Q3. 홀수짝수 판별하기
//Calculator 클래스를 작성해 보자.
// 이때 홀수이면 true, 짝수면 false 를 리턴해야 한다.

class Calculator2 {
        boolean is0dd(int num) {
            return num % 2 == 1;
    }


}
public class Main3 {
    public static void main(String[] args) {
        Calculator2 cal = new Calculator2();
        System.out.println(cal.is0dd(3));
        System.out.println(cal.is0dd(4));

    }
}
