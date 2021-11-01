package IfSwitch;

public class IfExample {

	public static void main(String[] args) {
		// ***If문***
		int score = 90;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("A등급입니다.");
		}
		if(score<90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("B등급입니다.");
		}
	}

}
