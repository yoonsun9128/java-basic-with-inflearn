package poly.car0;

public class CarMain0 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		K3Car k3Car = new K3Car();

		driver.setK3Car(k3Car); //운전자가 진짜 차를 가지게 된는 파트
		driver.drive();

		//추가
		Model3Car model3Car = new Model3Car();
		driver.setModel3Car(model3Car);
		driver.setK3Car(null);
		driver.drive();
	}
}
