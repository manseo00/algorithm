package string.test07.woo0woo;

import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 회문 문자열 - 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
	 * 		 문자열이 입력되면 해당 문자열이 회문문자열이면 'yes', 아니면 'no'출력
	 * 		 대소문자 구분 X
	 * 입력 예시 : gooG
	 * 출력 예시 : YES
	 * 사용 : 리스트
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "gooG";

		System.out.println(solution(str));//YES or NO
	}// end main

	private static String solution(String str) {
		String answer = "NO";
		//주어진 문자열이 대소분자 구분없이 뒤집은 문자열과 같다면 : YES
		if(str.equalsIgnoreCase(new StringBuffer(str).reverse().toString())) {
			answer = "YES";
		}
		
		return answer;
	}

}// end class
