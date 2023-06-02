package sort.test02.bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	 * 문제 : 버블정렬
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
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		return arr;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
