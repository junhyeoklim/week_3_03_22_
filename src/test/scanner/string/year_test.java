package test.scanner.string;

import java.util.Calendar;
import java.util.Scanner;

public class year_test {

	public static void main(String[] args) {
		
//		현재년도를 구한다.		
		Calendar cal = Calendar.getInstance();
		int NowYear = cal.get(Calendar.YEAR);
		
//		출생년도를 입력받는다.		
		System.out.println("===나이계산===");
		Scanner s = new Scanner(System.in);
		System.out.println("출생년도 입력: ");
		int birthday = s.nextInt();
		
//		나이계산 출력
		int age = NowYear - birthday;
		System.out.println("당신의 나이는 " + age +"세입니다.");
		s.close();

	}

}
