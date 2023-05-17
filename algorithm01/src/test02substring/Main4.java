package test02substring;

import java.util.Scanner;

public class Main4 {

	/*
	 * 날짜 : 2023.05.17
	 * 문제 : 입력받은(주어진) 문자열을 뒤집어서 출력하는 프로그램 작성
	 * 입력 예시 : abcdefg
	 * 출력 예시 : gfedcba
	 * 사용 : Sanner / solution 함수 만들어서 출력
	 * */
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		String str = "abcdefg";
		System.out.println(solution(str));
		
	}// end main

	private static String solution(String str) {
		
		String answer = "";
//		System.out.println(str.charAt(0));	//a
//		System.out.println(str.charAt(str.length()-1));	//g
		
//		for (int i = str.length() - 1; i >= 0; i--) {
//		    answer += str.charAt(i);
//		}
		
//		answer = new StringBuffer(str).reverse().toString();
		
		char[] cs = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
		    answer += cs[i];
		}

		return answer;
	}

}// end class
