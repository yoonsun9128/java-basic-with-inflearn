package poly.basic;

public class CastingMain5 {
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
		// 함수에서 부르게 되면 사실상 어떤 인스턴스가 오는지 모르기 때문에 그걸 확인 하는 과정
		if (parent instanceof Child) {
			// 오른쪽에 있는 타입이 왼쪽에 있는 인스턴스 타입에 들어갈 수 있으면 참!!
			System.out.println("chid 인스턴스 맞음");
			((Child) parent).childMethod();
		} else {
			System.out.println("child 인스턴스 아님");
		}
	}
}

