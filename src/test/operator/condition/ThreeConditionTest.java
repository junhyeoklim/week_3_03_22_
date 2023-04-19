package test.operator.condition;

public class ThreeConditionTest {

	public static void main(String[] args) {
		// 두 수중에서 더 큰 수를 구함
		int n1 = 25, n2 = 30;
		int max = 0;
//		max = n1 > n2 ? n1 : n2;
		
		if(n1 > n2)
			max = n1;
		else
			max = n2;
		
		System.out.println("두 수중에 더 큰 값은 "+ max +"입니다.");
		System.out.println();
	}

}
