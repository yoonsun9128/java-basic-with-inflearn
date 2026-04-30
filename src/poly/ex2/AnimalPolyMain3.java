package poly.ex2;

public class AnimalPolyMain3 {
	public static void main(String[] args) {

		Animal[] animals = {new Dog(), new Cat(), new Caw()};
		for (Animal animal:animals) {
			soundAnimal(animal);
		}

	}
	// 변하지 않는 부분
	private static void soundAnimal(Animal animal) {
		System.out.println("animal sound start =====");
		animal.sound();
		System.out.println("animal sound end =====");
	}

}

/*
* 이 코드에도 우선 문제점이 있다.
* 1. animal은 사실 추상적인 개념인데 누군가가 직접 인스턴스를 생성할 수 있다는 점
* 2. Animal을 상속 받았으나 sound() 메서드 오버라이딩을 하지 않았을 경우
* */
