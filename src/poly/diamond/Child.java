package poly.diamond;

public class Child implements InterfaceA, InterfaceB{
	@Override
	public void methodA() {
		System.out.println("methodA");
	}

	@Override
	public void methodB() {
		System.out.println("methodB");
	}

	//양쪽에 있지만 동일해서 하나만 생성하면 된다.
	@Override
	public void methodCommon() {
		System.out.println("methodCommon");
	}
}
