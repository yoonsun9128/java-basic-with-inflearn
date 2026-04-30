package poly.overriding;

public class OverridingMain {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("child -> child");
		System.out.println("value : " + child.value);
		child.method();

		System.out.println("-----------------------");
		Parent parent = new Parent();
		System.out.println("parent -> parent");
		System.out.println("value : " + parent.value);
		parent.method();

		System.out.println("-----------------------");
		Parent poly = new Child();
		System.out.println("parent -> child");
		System.out.println("value : " + poly.value); //변수는 오버라이딩 X
		poly.method(); //child.mehtod!!!! 메서드는 오버라이딩이 된다.
		// poly가 우선 parent를 먼저 보고 있지만 자녀쪽에서 overriding이 되어 있으면 최종적으로 자녀쪽으로 간다.
		// 오버라이딩이 절대적 우선권이라고 보면 된다
	}
}

/*
child -> child
value : child
child.mehtod!!!!
		-----------------------
parent -> parent
value : parent
parent.method
-----------------------
parent -> child
value : parent
child.mehtod!!!!
 */
