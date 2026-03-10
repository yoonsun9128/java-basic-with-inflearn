package static2.ex;

public class Car {
	String name;
	private static int totalCars;

	public Car(String name) {
		this.name = name;
		totalCars++;
	}

	public static void showTotalCars() {
		System.out.println("total car = " + totalCars);
	}
}
