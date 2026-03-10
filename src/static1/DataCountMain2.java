package static1;

public class DataCountMain2 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Data2 data1 = new Data2("A", counter);
		System.out.println("A count = " + counter.count);

		Data2 data2 = new Data2("B", counter);
		System.out.println("B count = " + counter.count);

		Data2 data3 = new Data2("C", counter);
		System.out.println("C count = " + counter.count);
	}

	// 객체가 몇개 생성되었는지에 대한 누적된 값을 찾고 싶다.
	// Data2 에서 모든 과정이 이뤄줬으면 했으나 어쩔 수 없이 외부의 변수를 이용해서 Data2가 몇개 생성되었는지에 대한 카운트를 사용중
	// 공용으로 사용해서 한 큐에 이뤄질 수 있는 구조를 원함
}
