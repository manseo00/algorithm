package number.test02.showstudent;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/*
	 * 문제 : 보이는 학생
	 * 		 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서있는 학생의 키가 앞에서부터 순서대로
	 * 		 주어질 때, 맨 앞에 서있는 선생님이 볼 수 있는 학생 수 구하기
	 * 		 앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않음
	 * 입력 예시 : 8
	 * 			 130 135 148 140 145 150 150 153
	 * 출력 예시 : 5
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int len = Integer.parseInt(sc.nextLine());
		int len = 8;
	
//		String str = sc.nextLine();
		String str = "130 135 148 140 145 150 150 153";
		
		System.out.println(solution(str));//
	}// end main

	private static int solution(String str) {
		// 문자열 >> 문자열 배열 >> 정수배열
		String[] arr = str.split(" ");
		int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		
		int count = 1;
		int max = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if(max < nums[i]) max = nums[i];
			if(nums[i]<nums[i+1] && max < nums[i+1]) {
				count++;
			}
		}
	
		return count;
	}

}// end class
