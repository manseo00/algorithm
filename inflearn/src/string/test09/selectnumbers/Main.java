package string.test09.selectnumbers;

import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 숫자만 추출
	 * 		 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수 만듦
	 * 		 추출하여 만들어지는 자연수는 100000000을 넘지 않는다.
	 * 입력 예시 : g0en2T0s8eSoft
	 * 출력 예시 : 208
	 * 사용 : 리스트
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		String str = "g0en2T0s8eSoft";

		System.out.println(solution(str));//208
	}// end main

	private static int solution(String str) {
		int answer = 0;
		
		// 숫자들만 뽑기 == 숫자가 아닌것 제거
		// [0-9]
		System.out.println(str);
		str = str.replaceAll("[^0-9]", "");
		System.out.println(str);
		
		answer = Integer.parseInt(str);
		
		return answer;
	}

}// end class
