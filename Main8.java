//Q8. 오류 찾기 1
//다음 코드에서 1 ~ 5 중 오류가 발생하는 문장을 찾고, 오류의 원인을 설명해 보자

    interface Predator {
    }
    class Animal {
    }
    class Dog extends Animal {
    }
    class Lion extends Animal implements Predator {
    }
    public class Main8 {
        public static void main(String[] args) {
            Animal a = new Animal(); // 1 번
            Animal b = new Dog(); // 2 번
            Animal c = new Lion(); // 3 번
            //Dog d = new Animal(); // 4 번
            Predator e = new Lion(); // 5 번
        }

    }
    //4번이다 이유는 Dog 클래스는 Animal 의 자식 클래스로 IS‑A 관계가 성립될 수 없기 때문이다.