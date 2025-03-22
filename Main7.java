//Q7. 인터페이스 사용하기

class Gold {
}
class Sliver {
}
class Bronze {
}
class MineralCalculator{
    int value = 0;
        public void add(Gold gold) {
             this.value +=150000;
}
        public void add(Sliver sliver) {
             this.value +=100000;
}
        public void add(Bronze bronze) {
             this.value +=70000;
}
        public int getValue() {
             return this.value;
}
}

public class Main7 {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Sliver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());
    }
}
