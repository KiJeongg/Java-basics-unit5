//Q9. 오류 찾기 2
//다음 코드에서 1 ~ 6 중 오류가 발생하는 문장을 모두 찾고, 오류의 원인을 설명해 보자.

interface Predator1 {
    String bark();
}
abstract class Animal1 {
    public String hello() {
        return "hello";
    }
}
class Dog1 extends Animal1 {
}
class Lion1 extends Animal1 implements Predator1 {
    public String bark() {
        return "Bark bark!!";
    }
}

public class Main9 {
    public static void main(String[] args){
        Animal1 a = new Lion1();
        Lion1 b = new Lion1();
        Predator1 c = new Lion1();
        System.out.println(a.hello()); // 1 번
       // System.out.println(a.bark()); // 2번 - a객체가 Animal1타입으로 생성 > hello 메서드만 가능
        System.out.println(b.hello()); // 3 번
        System.out.println(b.bark()); // 4 번
      //  System.out.println(c.hello()); // 5 번 - c객체가 Pretender1타입으로 생성 > bark메서드만 가능
        System.out.println(c.bark()); // 6 번
    }

}
