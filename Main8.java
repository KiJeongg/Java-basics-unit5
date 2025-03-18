//Q8. 맵에서 값 삭제하기
//다음과 같은 grade 맵에서 B 에 해당되는 값을 삭제해 보자.

import java.util.HashMap;
public class Main8 {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        int result = grade.remove("B");
        System.out.println(result); // 무엇이 삭제되었는지를 출력
        System.out.println(grade); // 현재 맵에 남아있는것을 출력
    }
}
