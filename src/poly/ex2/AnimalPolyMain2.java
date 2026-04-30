package poly.ex2;

public class AnimalPolyMain2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();

		// 배열은 같은 타입의 데이터를 나열할 수 있다.
		Animal[] animals = {dog, cat, caw};

		// 변하지 않는 부분
		for (Animal animal:animals) {
			System.out.println("animal sound start =====");
			animal.sound();
			System.out.println("animal sound end =====");
		}

	}

}
