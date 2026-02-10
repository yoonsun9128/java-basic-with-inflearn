package ref;

public class NullMain1 {
	public static void main(String[] args) {
		Data data = null;
		System.out.println(data);
		data = new Data();
		System.out.println(data);
		System.out.println(data.value);
		data = null;
		//x001에 대한 메모리는 있겠지만 null로 변경함으로 x001에 대한 주소값을 잃어버렸기 때문에 찾을 수가 없다
		//이때 사용할 수 없는 메모리에 대하서 자동적으로 제거하는 GC(가비지 컬렉션)이 발동한다.
		System.out.println(data);
	}
}
