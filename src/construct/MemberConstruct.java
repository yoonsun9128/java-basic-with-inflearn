package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;

	//생성자 만듬
	// 메서드와 비슷하지만 몇가지의 차이가 있음
	// -> 생성자의 이름은 클래스 이름과 같아야한다. 반환 타입이 없음
	MemberConstruct(String name, int age, int grade) {
		System.out.println("생성자 호출==> " + name +", "+ age +", "+ grade);

		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
