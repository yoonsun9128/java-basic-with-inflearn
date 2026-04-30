package poly.ex2;

public class AnimalPolyMain1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();

		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);

	}
	//다형적 참조의 활용 -> 하나의 동물이지만 실제로는 개,고양이, 소가 되고 있다. == 부모는 자식을 담을 수 있기 때문이다.
	private static void soundAnimal(Animal animal) {
		System.out.println("soundAnimal start");
		animal.sound();
		System.out.println("soundAnimal end");
	}
}
