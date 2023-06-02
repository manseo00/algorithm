package string.test08.woo0woo2;

import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 유효한 팰린드롬 - 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 함
	 * 		 문자열이 입력되면 해당 문자열이 팰린드롬이면 'yes', 아니면 'no'를 출력하는 프로그램
	 * 		 단 회문을 검사할 때 알파벳만 검사, 대소문자 구분 X, 알파벳 이외의 문자들 무시
	 * 입력 예시 : found7, time: study; Yduts; emit, 7Dnuof
	 * 출력 예시 : YES
	 * 사용 : 리스트
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		String str = "found7, time: study; Yduts; emit, 7Dnuof";

		System.out.println(solution(str));//YES or NO
	}// end main

	private static String solution(String str) {
		String answer = "NO";
		
		// 알파벳 제외하고 제거 하려면
		
		//1. 알파벳 검증
		//Character.isAlphabetic(0);
		//str.matches[^a-zA-Z]
		System.out.println(str);
		str = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
		
		//2. 바꾸기 : str.replace(), str.replaceAll()
//		str.Character.isAlphabetic(0);
		
		//3. 주어진 문자열이 대소분자 구분없이 뒤집은 문자열과 같다면 : YES
		if(str.equalsIgnoreCase(new StringBuffer(str).reverse().toString())) {
			answer = "YES";
		}
		
		return answer;
	}

}// end class
