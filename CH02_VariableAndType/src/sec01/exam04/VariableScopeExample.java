package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		// ***변수의 사용범위***
		int v1 = 15;
		if(v1>10) {
			int v2; //if 블록 내부에서 변수 v2 선언됨.
			v2 = v1 -10;
		}
		//int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}

}
