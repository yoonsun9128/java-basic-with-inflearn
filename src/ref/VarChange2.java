package ref;

public class VarChange2 {
	public static void main(String[] args) {
		Data dataA = new Data();
		dataA.value = 10;
		Data dataB = dataA;

		System.out.println(dataA); //x001**
		System.out.println(dataB); //x001**
		System.out.println(dataA.value); //10
		System.out.println(dataB.value); //10

		dataA.value = 20;
		System.out.println("dataA.value -> 20");
		System.out.println(dataA.value); //20
		System.out.println(dataB.value); //20

		dataB.value = 30;
		System.out.println("dataB.value -> 30");
		System.out.println(dataA.value); //20->30 아? b를 바꾸면 어쨌든 dataA를 바라보고 있어서 같이 바꾸나보다
		System.out.println(dataB.value); //30

		// 실제 있는것 사실 하나의 X001이기때문에 dataB.value를 바꿔도 동일하다.
	}
}
