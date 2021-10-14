package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		//변수 사용
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");

	}
}

/*변수는 또 다른 변수에 대입하여 값을 복사할 수 있음.
 * int x = 10; 변수 x에 10을 저장
 * int y = x;  x에 저장된 값을 변수 y에 복사(저장) */

