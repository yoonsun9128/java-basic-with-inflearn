package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
	@Override
	public void fly() {
		System.out.println("치킨 날아");
	}

	@Override
	public void sound() {
		System.out.println("꼬기오");
	}
}
