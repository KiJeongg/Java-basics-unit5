//"Q3 : 주민등록번호 나누기
// 홍길동 씨의 주민 등록 번호는 881120‑1068234 이다.
// 홍길동 씨의 주민 등록 번호 앞자리에 해당하는 부분인 연월일 (YYYYMMDD) 과 뒷자리에 해당하는 부분으로 나누어 출력해 보자.

public class Main3 {
    public static void main(String[] args) {
        String pin = "881120-1068234";
        String yyyyMMdd = pin.substring(0,6);
        String num = pin.substring(7);
        System.out.println(yyyyMMdd); // 881120 출 력
        System.out.println(num); // 1068234 출 력
    }
}
