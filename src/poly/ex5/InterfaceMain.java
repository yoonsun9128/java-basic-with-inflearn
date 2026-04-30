package poly.ex5;

public class InterfaceMain {
	public static void main(String[] args) {
		//인터페이스 생성 불가
//		InterfaceAnimal interfaceAnimal = new InterfaceAnimal()

		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();

		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);
	}

	private static void soundAnimal(InterfaceAnimal animal) {
		System.out.println("start animal sound ----");
		animal.sound();
		System.out.println("end animal sound ----");
	}
}
