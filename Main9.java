//Q9. 중복 숫자 제거하기
// 다음과 같은 numbers 리스트에서 중복된 숫자를 제거해 보자.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main9 {
    public static void main(String[] arg) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        HashSet<Integer> temp = new HashSet<>(numbers) ;
        ArrayList<Integer> result = new ArrayList<>(temp);
        System.out.println(result);

    }
}
