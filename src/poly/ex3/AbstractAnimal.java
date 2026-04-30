package poly.ex3;

public abstract class AbstractAnimal {

	public abstract void sound();

	//오버라이딩 목적으로 생성
	public void move() {
		System.out.println("animal move----");
	}
}
