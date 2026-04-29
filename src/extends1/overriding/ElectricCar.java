package extends1.overriding;

public class ElectricCar extends Car {

	@Override //애너테이션 -> 함수를 정확하게 잘 맞추면 사실 애너테이션이 없어도 된다.
	public void move() {
		System.out.println("전기차를 빠르게 이동합니다.");
	}
	public void charge() {
		System.out.println("충전합니다");
	}
}

// 애노테이션은 주석과 비슷한데, 프로그램이 읽을 수 있는 특별한 주석