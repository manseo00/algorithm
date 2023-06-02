package sort.test01.selectionsort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	 * 문제 : 선택정렬
	 * 입력 예시 : 6
	 * 			 13 5 11 7 23 15
	 * 출력 예시 : 5 7 11 13 15 23
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = s.nextInt();
		int n = 6;
		int[] arr = {13, 5, 11, 23, 15};
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
		for (int i = 0; i < arr.length - 1; i++) {
			int minldx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minldx]) {
					minldx = j;
				}
			}
			swap(arr,i,minldx);
		}
		return arr;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
