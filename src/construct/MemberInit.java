package construct;

public class MemberInit {
	String name;
	int age;
	int grade;

	void initMember(String name, int age, int grade) {
		//this를 이용해서 자기 자신의 인스턴스를 가리킨다
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
