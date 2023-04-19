package test.scanner.string;

import java.util.Scanner;

public class scanner_test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("* 주소 입력:");
		String s1 = s.nextLine();
		System.out.println("* 성명 입력:");
		String s2 = s.nextLine();
		System.out.println("* 좋아하는 3인(한줄에 모두) 입력:");
		String s3 = s.next();
		String s4 = s.next();
		String s5 = s.next();
		
		System.out.println("당신의 주소는 " + s1 + " 입니다.");
		System.out.println("당신의 성명은 " + s2 + " 입니다.");
		System.out.printf("당신의 좋아하는 3인은 %s, %s, %s 입니다.", s3, s4, s5);
		s.close();

	}

}
