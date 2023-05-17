package test02substring;

import java.util.Scanner;

public class Main3 {

	/*
	 * 날짜 : 2023.05.17
	 * 문제 : 입력받은(주어진) 문자열의 입력받은 알파벳 한개(첫번째)부터 
	 * 끝까지를 뽑아서 출력하는 프로그램 작성
	 * 첫줄의 문자는 1개의 알파벳,
	 * 두번째줄에는 여러 문자열을 입력받는다.
	 * 입력 예시 : c
	 * 			 abc def gccc ddd
	 * 출력 예시 : c def gccc ddd
	 * 사용 : Sanner / substring() / indexOf()
	 * */
	
	public static void main(String[] args){

		// 1. Scanner : java.util
		Scanner sc = new Scanner(System.in);
		
//		String str1 = sc.next();
//		String str2 = sc.nextLine();
		
		String str1 = "c";
		String str2 = "abc def gccc ddd";
		System.out.println(solution(str1, str2));
		
	}// end main

	private static String solution(String str1, String str2) {
		
		String answer = "";
//		System.out.println(str2.indexOf(str1));
//		answer = str2.substring(2);
		
		answer = str2.substring(str2.indexOf(str1));
		
		return answer;
	}

}// end class
