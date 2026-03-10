package static1;

public class DataCountMain3 {
	public static void main(String[] args) {
		Data3 data1 = new Data3("A");
		System.out.println("A count = " + Data3.count);

		Data3 data2 = new Data3("B");
		System.out.println("B count = " + Data3.count);

		Data3 data3 = new Data3("C");
		System.out.println("C count = " + Data3.count);

		//추가
		// 인스턴스를 통한 접근
		Data3 data4 = new Data3("D");
		System.out.println("D count = " + data4.count);// 접근은 가능하지만 인스턴스의에 있는 static 영역으로 다시 들어간다
	}

	//Data3.count -> 붕어빵 틀에서 바로 사용하는 느낌
}
