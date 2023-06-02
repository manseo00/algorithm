package string.test05.reversestring2;

import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	 * 		 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램 작성
	 * 입력 예시 : a#b!GE*T@S
	 * 출력 예시 : S#T!EG*b@a
	 * 사용 : 리스트
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "a#b!GE*T@S";

		System.out.println(solution(str));
	}// end main

	private static String solution(String str) {
		String answer = "";

		// a#b!GE*T@S
		char[] cs = str.toCharArray();
		int left = 0;
		int right = str.length() - 1;

//		System.out.println(Character.isAlphabetic('a'));
//		System.out.println(Character.isAlphabetic('!'));
		//알파벳이면 스왑,알파벳이 아니면 left++, right--
		while (left < right) {
			
			if(!Character.isAlphabetic(cs[left])) {
				left++;
			}else if(!Character.isAlphabetic(cs[right])) {
				right--;
			}else {
				// 알고리즘에 자주쓰이는 함수패턴 : swap 자리바꾸기
				char temp = cs[left]; // '' = g
				cs[left] = cs[right];// g <= d
				cs[right] = temp; // d <= g

				left++;// 0->1
				right--;// 3->2
			}
		}
		answer = String.valueOf(cs);
		return answer;
	}

}// end class
