package poly.basic;

public class PolyMain {
	public static void main(String[] args) {
		//부모 변수가 부모 인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod();

		//child -> child
		System.out.println("child -> child");
		Child child = new Child();
		child.childMethod();
		child.parentMethod();

		//parent -> child
		System.out.println("parent -> child");
		Parent polyParent = new Child();
		polyParent.parentMethod();

		//polyParent의 타입은 Parent이기 때문에 chlid의 매소드를 호출 할 수 없다.
//		polyParent.childMethod();

		//child -> parent : 자식은 부모를 담을 수 없다.
//		Child polyChild = new Parent();
	}
}
