package static2;

public class DecoData {
	private int instanceValue;
	private static int staticValue;

	public static void staticCall() {
//		instanceValue++; // 인스턴스 변수 접근, compile error
//		instanceMehtod(); // 인스턴스 메서드 접근, compile error -> 매번 새롭게 생성되어서 참조 값을 알수 없다.

		staticValue++; //정적 변수 접근
		staticMethod();// 정적 메서드 접근 -> 클래스 안에 있기 때문에
	}

	public void instanceCall() {
		instanceValue++;
		instanceMehtod();

		staticValue++; //정적 변수 접근
		staticMethod();// 정적 메서드 접근 -> 클래스 안에 있기 때문에
	}

	private void instanceMehtod() {
		System.out.println("instance start = " + instanceValue);
	}
	private static void staticMethod() {
		System.out.println("start static = " + staticValue);
	}
}
