package recursive.test04.fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	/*
	 * 문제 : 재귀함수 - 피보나치 입력 : 10 출력 : 1 1 2 3 5 8 13 21 34 55
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = s.nextInt();
		int len = 45;
		// 팩토리얼 결과를 반복하면서 리턴받아 출력 :
		// 1 1 2 3 5 8 13 21 34 55
//		for (int i = 1; i <= len; i++) {
//			System.out.println(solution(i) + " ");
//		}
		System.out.println(fibonacci(len));
		System.out.println(Arrays.toString(temp[0]).replace("[0, ", "").replace(" 0]", "").replace(",", ""));
	}// end main

	private static int solution(int i) {
		if (i <= 1)
			return i;
		else {
			return solution(i - 2) + solution(i - 1);
		}
	}

	public static int fibonacci(int num) {
		int[] arr = new int[num + 2];// num이 0일경우 index 예외 발생방지
		arr[1] = 1;
		return fibo_arr(num, arr);
	}

	static int[][] temp = new int[1][];

	public static int fibo_arr(int num, int[] arr) {
		if (num == 0) {
			return 0;
		} else if (arr[num] == 0) {
			arr[num] = fibo_arr(num - 1, arr) + fibo_arr(num - 2, arr);
		}
//		 System.out.println(Arrays.toString(arr));
		temp[0] = arr;
		return arr[num];
	}
}
