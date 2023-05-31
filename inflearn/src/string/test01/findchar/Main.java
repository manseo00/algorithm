package string.test01.findchar;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 입력받은(주어진) 문자열에서 특정 문자의 갯수 출력하는 프로그램 작성
	 * 입력 예시 : Computercooler
	 * 			 c
	 * 출력 예시 : 2
	 * 사용 :
	 * */
	
	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
		
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
		String str1 = "Computercooler";
		String str2 = "c";
		
		System.out.println(solution(str1, str2));
	}// end main

	private static int solution(String str1, String str2) {
		int count = 0;
		
		for (int i = 0; i < str1.length(); i++) {
//			System.out.println(str1.toLowerCase().charAt(i)==str2.charAt(0));
			if(str1.toLowerCase().charAt(i)==str2.charAt(0)) count++;
		}
		
		return count;
	}

}// end class
