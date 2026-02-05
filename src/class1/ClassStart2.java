package class1;

public class ClassStart2 {
	public static void main(String[] args) {
		String[] studentName = {"학생1", "학생2", "학생3"};
		int[] studentAge = {15, 16, 16};
		int[] studentGrade = {90, 80, 100};

		for (int i = 0; i < studentName.length; i++) {
			System.out.println("이름:" + studentName[i] + " 나이:" + studentAge[i] + " 성적:" + studentGrade[i]);
		}
	}
}

//코드 변경을 최소화하는건 해결했으나, 데이터를 변경할때 조심해야한다. 각각의 배열마다의 요소를 잘 찾아서 제거해야한다.
//사람이 관리할때는 학생이라는 카드를 두고 그 안에 각각의 정보가 들어가 있는게 편리하다. -> 요건이 class

