package number.test01.bignumber;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

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
//		int len = sc.nextInt();
		int len = 6;
		int[] nums = new int[len];
//		for (int i = 0; i < len; i++) {
//			nums[i] = sc.nextInt();
//		}
		nums[0] = 7;
		nums[1] = 3;
		nums[2] = 9;
		nums[3] = 5;
		nums[4] = 6;
		nums[5] = 12;
		
		System.out.println(solution(nums));//
	}// end main

	private static String solution(int[] nums) {
		String answer = "";
		System.out.println(Arrays.toString(nums));
		
		answer += nums[0];
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]<nums[i+1]) {
				answer += " " + nums[i+1];
			}
		}
	
		return answer;
	}

}// end class
