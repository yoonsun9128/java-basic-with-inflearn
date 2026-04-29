package extends1.super1;

public class Child extends Parent{
	public String value = "child";

	@Override
	public void hello() {
		System.out.println("Child.hello");
	}

	public void call() {
		System.out.println("this value = " + this.value); //this 생략 가능
		System.out.println("super value = " + super.value); //

		this.hello(); //this 생략가능 -> this 에서 없으면 부모로 가서 찾는다
		super.hello();
	}
}
