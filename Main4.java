//Q4. 메서드 오버로딩하기
// 정수 배열 또는 정수의 리스트로 그 평균을 구해 리턴하는 Calculator 클래스를 작성

import java.util.ArrayList;
import java.util.Arrays;

class Calculator3 {
    int val = 0;
     int avg(int[] a) {
         int total = 0;
         for (int num : a) {
             total += num;
         }
         return total / a.length;
     }
     int avg(ArrayList<Integer> a) {
         int total = 0;
         for (int num : a) {
             total += num;
         }
         return total / a.size();
     }
}

public class Main4 {
    public static void main(String[] args) {
        Calculator3 cal = new Calculator3();
        int[] b = {1,3,5,7,9};
        int result1 = cal.avg(b);
        System.out.println(result1);

        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(9,5,5,7,9));
        int result2 = cal.avg(c);
        System.out.println(result2);
    }
}
