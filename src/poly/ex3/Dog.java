package poly.ex3;

public class Dog extends AbstractAnimal{

	//느낌이 부모에서 구성해주고 자식에서 구현하는 느낌적인 느낌
	@Override
	public void sound() {
		System.out.println("baw baw");
	}
}
