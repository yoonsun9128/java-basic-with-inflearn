package ref;

public class NullMain4 {
	public static void main(String[] args) {
		BigData bigData = new BigData();
		//data에 대한 null pointer exception 에러 수정
		bigData.data = new Data();
		System.out.println(bigData.count);
		System.out.println(bigData.data);
		System.out.println(bigData.data.value);
	}
}
