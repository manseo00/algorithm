package test02substring;

import java.util.Scanner;

public class Main {

	/*
	 * 날짜 : 2023.05.17
	 * 문제 : 입력받은(주어진) 문자열의 3번째부터 끝까지를 뽑아서
	 * 출력하는 프로그램 작성
	 * 입력 예시 : abcdefg
	 * 출력 예시 : defg
	 * 사용 : Sanner / solution 함수 만들어서 출력
	 * */
	
	public static void main(String[] args){

		// 1. Scanner : java.util
		Scanner sc = new Scanner(System.in);
		String str = "abcdefg";
//		String str = sc.nextLine();	// 입력된 라인 한줄 문자열
		System.out.println(solution(str));
		
	}// end main

	private static String solution(String str) {
		
		String answer = "";
		answer = str.substring(3);
		
		return answer;
	}

}// end class
