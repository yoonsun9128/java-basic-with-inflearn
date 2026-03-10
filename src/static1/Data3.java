package static1;

public class Data3 {
	public String name; //맴버 변수 , 인스턴스 변수
	public static int count; //맴버 변수, 클래스 변수

	// 멤버 변수는 static아 붙은 것과 안 붙은 걸로 나눠진다.
	// 인스턴스 변수 -> 인스턴스 안에 소속 되어 있으며 인스턴스를 생성해야 사용할 수 있다. + 인스턴스가 생성 될 때마다 새로 만들어진다.
	// 클래스 변수 -> 정적 변수, static 변수, 인스턴스와 무관하여 클래스에서 바로 접근 가능, 여러곳에서 공유하는 목적으로 사용됨

	public Data3(String name) {
		this.name = name;
		count++;
	}
}
