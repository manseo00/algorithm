package number.test01.bignumber;

import java.util.Arrays;
import java.util.Scanner;


public class Main2 {

	/*
	 * 문제 : 큰 수 출력하기
	 * 		 N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력
	 * 		 첫 번째 수는 무조건 출력
	 * 입력 예시 : 6
	 * 			 7 3 9 5 6 12
	 * 출력 예시 : 7 9 6 12
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int len = Integer.parseInt(sc.nextLine());
		int len = 6;
	
//		String str = sc.nextLine();
		String str = "7 3 9 5 6 12";
		
		System.out.println(solution(str));//
	}// end main

	private static String solution(String str) {
		String answer = "";
		// 문자열 >> 문자열 배열 >> 정수배열
		String[] arr = str.split(" ");
		int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		
		answer += nums[0];
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]<nums[i+1]) {
				answer += " " + nums[i+1];
			}
		}
	
		return answer;
	}

}// end class
