package access.a;

public class AccessData {

	public int publicField;
	int defaultField;
	private int privateField;

	public void publicMethod() {
		System.out.println("publicMethod go : " + publicField);
	}

	void defaultMethod() {
		System.out.println("defaultMethod go : " + defaultField);
	}

	private void privateMethod() {
		System.out.println("privateMethod go : " + privateField);
	}

	public void innerAccess() {
		System.out.println("inner access go!!!");
		publicField = 100;
		defaultField = 200;
		privateField = 300;

		//내 안에 있는건 모두 호출 할 수 있다.(내부호출) -> private을 포함한 모든 곳에 접근할 수 있다.
		publicMethod();
		defaultMethod();
		privateMethod();
	}
}
