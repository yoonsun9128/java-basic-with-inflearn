package final1;

public class FinalFieldMain {

	public static void main(String[] args) {
		//final 필드 -> 생성자 초기화
		System.out.println("생성자 초기화");

		ConstructInit constructInit1 = new ConstructInit(10);
		ConstructInit constructInit2 = new ConstructInit(20);

		// 두개의 값은 이후로 수정할 수가 없다.

		System.out.println(constructInit1.value);
		System.out.println(constructInit2.value);

		//final 필드 -> 필드 초기화
		System.out.println("필드 초기화");
		FieldInit fieldInit1 = new FieldInit();
		FieldInit fieldInit2 = new FieldInit();
		FieldInit fieldInit3 = new FieldInit();
		System.out.println(fieldInit1.value);
		System.out.println(fieldInit2.value);
		System.out.println(fieldInit3.value);
		// 값이 변경되지 않은데 이렇게 사용하면 메모리 중복 사용 -> 이럴때 사용하면 좋은게 static 영역

		//상수 접근 static final
		// static 이라서 클라스에 포함되어 있어 바로 접근이 가능
		// JVM이 클래스를 로딩할떄 메모리에 바로 올라가기 때문에 접근이 가능
		System.out.println("상수");
		System.out.println(FieldInit.CONST_VALUE);
	}
}
