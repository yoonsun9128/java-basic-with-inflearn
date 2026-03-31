package extends1.ex2;

public class CarMain {

	public static void main(String[] args) {
		// 상속을 받으면 본인에 없지만 부모에 있기 때문에 사용이 가능하다.
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}
}

//자식은 누구로 부터 상속받는지 정확게 알고 있지만 부모는 누구에게 내려주는 모른다.
