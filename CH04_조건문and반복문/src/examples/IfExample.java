package examples;

public class IfExample {

	public static void main(String[] args) {
		// ***if문***
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score<90) 
			System.out.println("점수가 90보다 작습니다."); //false가 되므로 출력 안됨 
			System.out.println("등급은 B입니다."); //if문과는 상관없는 실행문
		
	}

}
