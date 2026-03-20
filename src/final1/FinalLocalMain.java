package final1;

public class FinalLocalMain {
	public static void main(String[] args) {
		//final 지역 변수
		final int data1;
		data1 = 10; //최조 한번만 할다 가능
//		data1 = 20; //컴파일 오류

		//final 지역 변수 2
		final int data2 = 10;
//		data2 = 20;
	}

	//final 매개변수
	static void method(final int parameter) {
//		parameter = 20; 이미 밖에서 final에 대해서 값을 지정했기 때문에 메서드 안에서 또 지정할 수가 없다.
	}
}
