package extends1.ex3;

public class CarMain {

	public static void main(String[] args) {
		// 상속을 받으면 본인에 없지만 부모에 있기 때문에 사용이 가능하다.
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		electricCar.openDoor();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
		gasCar.openDoor();

		HydrogenCar hydrogenCar = new HydrogenCar();
		hydrogenCar.move();
		hydrogenCar.fillHydrogen();
		hydrogenCar.openDoor();
	}
}

// 상속 관계로 인해 중복은 줄어들고, 새로운 수소차를 확장할 수 있다.
