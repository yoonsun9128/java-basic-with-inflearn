package extends1.ex3;

public class Car {
	public void move() {
		// 부모 클래스
		System.out.println("차를 이동합니다");
	}

	//기능 추가 -> 모든 차량에 기능을 추가하게 됨
	public void openDoor() {
		System.out.println("문을 엽니다.");
	}
}
