package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//***float타입과 double타입***
		//*실수값 저장
		//float var1 = 3.14; -> 컴파일 에러 : float 타입은 리터럴 뒤에 f나 F를 붙여야 함
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//*정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);/*double 타입인 var5가 float타입인 var4보다
		 									  2배 이상 정밀한 값으로 출력됨.*/
		
	}

}
