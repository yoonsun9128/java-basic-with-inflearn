package ref;

public class MethodChange1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("change before : " + a);
		changePrimitive(a);
		System.out.println("change after : " + a);
	}

	static void changePrimitive(int x) {
		x = 20;
		// int x = a 형식으로 볼수 있다.
	}
}
