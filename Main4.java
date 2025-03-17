//"Q4 : 원하는 숫자 출력하기
// 주민 등록 번호 뒷자리의 첫 번째 숫자는 성별을 나타낸다. 첫 번째 숫자가 1 이면 남자를, 2 이면 여자를 의미한다.
// 홍길동 씨의 주민 등록 번호 881120‑1068234 에서 성별을 나타내는 숫자를 출력해 보자.

public class Main4 {
    public static void main(String[] args) {
        String pin = "881120-1068234";
        System.out.println(pin.charAt(7));
    }
}
