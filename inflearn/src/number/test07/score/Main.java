package number.test07.score;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 점수 계산 
	 * 입력 예시 : 10 
	 * 			 1 0 1 1 1 0 0 1 1 0 
	 * 출력 예시 : 10
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int len = Integer.parseInt(sc.nextLine());
		int len = 10;

//		String str = sc.nextLine();
		String str = "1 0 1 1 1 0 0 1 1 0";

		System.out.println(solution(len, str));//
	}// end main

	private static String solution(int len, String str) {
		String answer = "";
		int count = 1;
		
		System.out.println(str);
		// 1. 공백제거
		str = str.replaceAll(" ", "");
		System.out.println(str);
		
		int[] score = new int[len];
		if(str.charAt(0) == '1') score[0] = 1;
		// 2. str.charAt(0) 활용 >> 반복문 >> count++
		for (int i = 1; i < len; i++) {
			// 연속 득점 >> 가산점
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
				score[i] = count;
			}else {
				count = 1;
				score[i] = 1;
			}
			
			if(str.charAt(i) == '0') {
				score[i] = 0;
			}
		}
//		for (int x : score) {
//			System.out.println(x + " ");
//		}
		// 3. total score.
		answer += Arrays.stream(score).sum();
		
		// 정수배열평균
//		System.out.println(total/len);
//		System.out.println(Arrays.stream(score).average().orElse(0));
		return answer;
	}

}// end class
