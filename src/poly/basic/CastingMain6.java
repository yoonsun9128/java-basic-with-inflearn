package poly.basic;

public class CastingMain6 {
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		System.out.println("parent1 call");
		call(parent1);

		Parent parent2 = new Child();
		System.out.println("parent2 call");
		call(parent2);
	}

	private static void call(Parent parent) {
		parent.parentMethod();
		// 여기서 바로 다운 캐스팅을 하고 있기 때문
		if (parent instanceof Child child) {
			System.out.println("chid 인스턴스 맞음");
			// java 16 버전 이상부터는 바로 호출이 가능함
			child.childMethod();
		} else {
			System.out.println("child 인스턴스 아님");
		}
	}
}

