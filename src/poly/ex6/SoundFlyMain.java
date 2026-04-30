package poly.ex6;

public class SoundFlyMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		Chicken chicken = new Chicken();

		soundAnimal(dog);
		soundAnimal(bird);
		soundAnimal(chicken);

//		flyAnimal(dog); //dog는 interface fly를 가지고 있지 않아 에러 발생
		flyAnimal(bird);
		flyAnimal(chicken);
	}

	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("start animal sound ----");
		animal.sound();
		System.out.println("end animal sound ----");
	}

	private static void flyAnimal(Fly fly) {
		System.out.println("start animal fly +++++");
		fly.fly();
		System.out.println("end animal fly +++++");
	}
}
