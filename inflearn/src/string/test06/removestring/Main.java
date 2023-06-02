package string.test06.removestring;

import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 중복문자제거
	 * 		 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램 잓어
	 * 		 중복 제거된 문자열의 각 문자는 원래 문자열의 순서 유지
	 * 입력 예시 : ksekkset
	 * 출력 예시 : kset
	 * 사용 : 리스트
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "ksekkset";

		System.out.println(solution(str));//kset
	}// end main

	private static String solution(String str) {
		String answer = "";

		//1.반복문으로 문자열을 반복
		for (int i = 0; i < str.length(); i++) {
			//2.문자의 위치가 인덱스의 위치와 다르면 중복된것
			System.out.println(str.indexOf(str.charAt(i)) +","+i);
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}

}// end class
