package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		// ***이스케이프 문자 출력***
		System.out.println("사카\t스미스로우\t오바메양"); // /t : 탭만큼 띄움
		System.out.print("아스날 우승\n"); // \n : 줄바꿈('print'메소드에서 이용)
		System.out.print("아스날 우승\n");
		System.out.println("우리는 \"축구선수\"입니다."); // \" : " 출력
		System.out.println("라카제트\\토미야스\\티어니\\램스데일"); // \\: \ 출력
	}

}
