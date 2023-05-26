package number.test10.maxmountain;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 봉우리
	 * 입력 예시 : 5 
	 *			 5 3 7 2 3 
	 *			 3 7 1 6 1 
	 *			 7 2 5 3 4 
	 *			 4 3 6 4 1 
	 *			 8 7 3 5 2 
	 * 출력 예시 : 10
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int len = Integer.parseInt(sc.nextLine());
		int len = 5;

		String[] strs = new String[len];
//		String str = sc.nextLine();
		strs[0] = "5 3 7 2 3";
		strs[1] = "3 7 1 6 1";
		strs[2] = "7 2 5 3 4";
		strs[3] = "4 3 6 4 1";
		strs[4] = "8 7 3 5 2";

		System.out.println(solution(strs));//
	}// end main

	private static String solution(String[] strs) {
		String answer = "";
		System.out.println(Arrays.toString(strs));

		// 1. 문자열 배열 >> 2차원 정수배열 변환 >> 테두리 0으로 채우기
		int[][] ss = new int[strs.length + 2][strs.length + 2];

		for (int i = 0; i < strs.length; i++) {
			strs[i] = "0 " + strs[i] + " 0";
			String[] arr = strs[i].split(" ");
			int[] score = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
			ss[i+1] = score;
		}

		for (int[] is : ss) {
			System.out.println(Arrays.toString(is));
		}
		
		int count = 0;
		// 2. 2차원반복문 : 상하좌우값과 비교해서 검증
		for (int i = 1; i < ss.length - 1; i++) {
			for (int j = 1; j < ss.length - 1; j++) {
				if(ss[i][j]>ss[i-1][j] && ss[i][j]>ss[i+1][j] && ss[i][j]>ss[i][j-1] && ss[i][j]>ss[i][j+1]) {
					count++;
				}
			}
		}
		
		answer += count;
		return answer;
	}

}// end class
