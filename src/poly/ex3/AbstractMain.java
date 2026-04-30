package poly.ex3;

public class AbstractMain {
	public static void main(String[] args) {
		//추상클래스 생성 불가
//		AbstractAnimal animal = new AbstractAnimal()

		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();

		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);
	}

	// 변하지 않는 부분
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("animal sound start =====");
		animal.sound();
		System.out.println("animal sound end =====");
	}
}
