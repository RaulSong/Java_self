package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		//***printf() 메소드 사용 방법***
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); //%d : 정수
		System.out.printf("상품의 가격:%6d원\n", value); //%6d : 여섯 자리 정수. 왼쪽 빈자리 공백
		System.out.printf("상품의 가격:%-6d원\n", value); //%-6d : 여섯 자리 정수. 오른쪽 빈자리 공백
		System.out.printf("상품의 가격:%06d원\n", value); //%06d : 여섯자리 정수. 왼쪽 빈자리 0채움
	
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		String name = "베른드 레노";
		String job = "축구 선수";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	
	}

}
