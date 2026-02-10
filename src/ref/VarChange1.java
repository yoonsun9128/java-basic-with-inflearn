package ref;

public class VarChange1 {
	public static void main(String[] args) {
		int a = 10;
		int b = a; //a,b는 사실 따로 놀고 있다 오직 a의 값만 복사한 상태

		System.out.println(a);
		System.out.println(b);

		a = 20;
		System.out.println("a -> 20");
		System.out.println(a);
		System.out.println(b);

		b = 30;
		System.out.println("b -> 30");
		System.out.println(a);
		System.out.println(b);
	}
}
