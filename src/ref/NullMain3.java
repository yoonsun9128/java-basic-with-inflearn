package ref;

public class NullMain3 {
	public static void main(String[] args) {
		BigData bigData = new BigData();
		System.out.println(bigData.count);
		System.out.println(bigData.data); // 참조형이라서 데이터 초기값이 null 이다
		System.out.println(bigData.data.value); //이때 null pointer exception 에러 발생
	}
}
