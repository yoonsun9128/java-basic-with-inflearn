package oop1;

public class ValueDataMain {

	public static void main(String[] args) {
		ValueData valueData = new ValueData();
		add(valueData);
		add(valueData);
		add(valueData);
		System.out.println("total value = " + valueData.value);
	}

	static void add(ValueData data) {
		data.value ++;
		System.out.println("number add = " + data.value);
	}
}
