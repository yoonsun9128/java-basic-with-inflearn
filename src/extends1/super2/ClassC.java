package extends1.super2;

public class ClassC extends ClassB{
	public ClassC() {
		super(10, 20); // 생성자가 정해져 있으면 내가 직접 정의 하지 못한다.
		System.out.println("ClassC 생성자");
	}
}
