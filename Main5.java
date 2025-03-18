//"Q5 : 문자열 바꾸기
// 다음과 같은 문자열 a:b:c:d 가 있다. replaceAll 메서드를 사용하여 a#b#c#d 로 바꿔서 출력해 보자

public class Main5 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String b = a.replace(":","#");
        System.out.println(b); // a#b#c#d 출 력
    }
}
