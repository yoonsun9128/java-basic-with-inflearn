package ref;

public class MethodChange2 {
	public static void main(String[] args) {
		Data dataA = new Data();
		dataA.value = 10;
		System.out.println("change before : " + dataA.value); //10
		System.out.println(dataA);
		changeReference(dataA);
		System.out.println("change after : " + dataA.value); //20??
	}

	static void changeReference(Data dataX) {
		System.out.println(dataX);
		dataX.value = 20;
	}
}
