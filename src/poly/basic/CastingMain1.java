package poly.basic;

public class CastingMain1 {
	public static void main(String[] args) {
		//parent -> chlid
		Parent poly = new Child();
//		poly.childMethod();

		//다운캐스팅 (부모 타입 -> 자식 타입)
		// 기존의 poly를 그대로 사용하는게 아니라 복사해서 사용하고 있다!
		Child chlid = (Child) poly; //자식은 속이 쫍아서 담을 수 없다.but 자바에서는 경고를 하고 있으나 개발자가 지시 할 수 있다
		chlid.childMethod();
	}
}
