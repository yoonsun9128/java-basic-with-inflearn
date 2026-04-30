package poly.ex1;

public class AnimalSoundMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();

		System.out.println("show animal sound start ----");
		dog.sound();

		System.out.println("show animal sound start ----");
		cat.sound();

//		System.out.println("show animal sound start ----");
//		caw.sound();
		soundCaw(caw);
	}

	// 이렇게 하는건 사실 중복 제거가 아니다.
	private static void soundCaw(Caw caw) {
		System.out.println("show animal sound start ----");
		caw.sound();
	}
}

/*
 출력하는 부분이 계속 중복으로 보여지고 있다.
* */