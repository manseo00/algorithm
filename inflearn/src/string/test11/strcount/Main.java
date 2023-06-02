package string.test11.strcount;

import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 문자열 압축
	 *		 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우
	 *		 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열 압축
	 *		 반복되는 횟수 1일경우 생략
	 * 입력 예시 : KKHSSSSSSSE
	 * 출력 예시 : K2HS7E
	 * 사용 : 리스트
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		String str = "KKHSSSSSSSE";
		
		System.out.println(solution(str));//
	}// end main

	private static String solution(String str) {
		String answer = "";
		System.out.println(str);
		
		// 주의(맨끝은 +1하면 에러)
		str += " ";	// 문자하나를 늘려주고 반복문(길이)에서는 -1
		
		//str.charAt(i), str.toCharArray()
		//for
		//[0] == [0+1] count++, else -> count = 1
		//count >= 2 : 숫자 print
		
		int count=1;	// 첫 문자 카운트는 무조건 1개
		for (int i = 0; i < str.length()-1; i++) {
//			System.out.println(str.charAt(i));
			if(str.charAt(i) == str.charAt(i+1)) {
				count++; // 연속된 문자일 때 증가
			}else {
				answer +=str.charAt(i);
				if(count >= 2) answer += count;
				count = 1;
			}
		}
		return answer;
	}

}// end class
