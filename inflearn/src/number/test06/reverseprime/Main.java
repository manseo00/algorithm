package number.test06.reverseprime;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/*
	 * 문제 : 뒤집은 소수
	 * 입력 예시 : 9
	 * 			 32 55 62 20 250 370 200 30 100
	 * 출력 예시 : 23 2 73 2 3
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int len = Integer.parseInt(sc.nextLine());
		int len = 20;
		
//		String str = sc.nextLine();
		String str = "32 55 62 20 250 370 200 30 100";
		
		System.out.println(solution(len, str));//
	}// end main

	private static String solution(int len, String str) {
		String answer = "";
		
		System.out.println(str);
		
		// 1. 스플릿 >> 문자열 배열
		String[] arr = str.split(" ");
		
		// 2. 문자열배열 >> 반복문 >> 뒤집기 >> 정수로 바꿔서 >> 정수배열
		int[] sus = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sus[i] = Integer.parseInt(new StringBuffer(arr[i]).reverse().toString());
		}
		System.out.println(Arrays.toString(sus));
		
		// 3. 정수배열 사용 >> 소수 검증 (이중for문)
		for (int x = 0; x < sus.length; x++) {
//			System.out.println("====="+sus[x]);
			for (int i = 2; i <= sus[x]; i++) {
				// i가 끝까지 증가하여 sus[x]와 같으면 소수
				if(sus[x] == i) {
//					System.out.println(i);
					answer += i + " ";
				}
				// i가 증가하다가 나누어 떨어지는 경우 소수X >> 반복문 탈출
				if(sus[x] % i == 0) {
					break;
				}
			}
		}
		
		return answer;
	}

}// end class
