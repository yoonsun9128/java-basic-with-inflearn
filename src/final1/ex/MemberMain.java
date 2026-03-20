package final1.ex;

public class MemberMain {
	public static void main(String[] args) {
		Member member = new Member("azalea", "choi");

		member.print();

		member.changeData("yoonsun");
		member.print();
	}
}
