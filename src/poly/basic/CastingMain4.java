package poly.basic;

public class CastingMain4 {
	public static void main(String[] args) {
		//다운캐스팅을 자동으로 하지 않는 이유
		Parent parent1 = new Child(); //child + parent 인스턴스가 존재함
		Child child1 = (Child) parent1;
		child1.childMethod(); //다운 캐스팅을 해도 문제가 없음 우선

		Parent parent2 = new Parent(); //child 인스턴스가 없음
		Child child2 = (Child) parent2; //런타임 오류
		/*
		*Exception in thread "main" java.lang.ClassCastException: class poly.basic.Parent cannot be cast to class poly.basic.Child (poly.basic.Parent and poly.basic.Child are in unnamed module of loader 'app')
	at poly.basic.CastingMain4.main(CastingMain4.java:11)
		* */
		child2.childMethod(); //실행이 불가
	}
}

