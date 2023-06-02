package sort.test03.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	 * 문제 : 삽입정렬
	 * 입력 예시 : 6
	 * 			 11 7 5 6 10 9
	 * 출력 예시 : 5 6 7 9 10 11
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = s.nextInt();
		int n = 6;
		int[] arr = {11, 7, 5, 6, 10, 9};
		System.out.println(Arrays.toString(arr));
		
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		for (int i : solution(arr)) {
			System.out.print(i + " ");
		}
	}
	private static int[] solution(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return arr;
	}


}
