package final1;

public class FinalRefMain {
	public static void main(String[] args) {
		final Data data = new Data();
//		data = new Data(); //이미 할당을 해서 변수를 바꿀 수 없다.

		//참조 대상 객체의 값은 변경 가능하다.
		data.value = 10;
		System.out.println(data.value);
		data.value = 20;
		System.out.println(data.value);
	}
//	👉 “final은 껍데기만 고정한다, 속까지 지켜주진 않는다”
}
