//Q7.리스트를 문자열로 만들기.
//다음과 같은 [ ‘Life’, ‘is’ , ‘too’, ‘short’] 리스트를 ‘Life is too short’과 같이
//하나의 문자열로 만들어 출력해 보자.

import java.util.ArrayList;
import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList);
        System.out.println(result);
    }
}