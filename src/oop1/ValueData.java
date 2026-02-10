package oop1;

public class ValueData {
	int value;

	//메서드는 객체를 생성해야 호출할 수 있다. 그런데 static이 붙으면 객체를 생성하지 않아도 메서드를 호출할 수 있음
	void add() {
		value++;
		System.out.println("number add = " + value);
	}
}
