package number.test05.primenumber;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;


public class Main2 {

	/*
	 * 문제 : 소수(에라토스테네스 체)
	 * 		 자연수 N이 입력되면 1부터 N까지의 소수의 개수 출력
	 * 입력 예시 : 20
	 * 출력 예시 : 8
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int len = sc.nextInt();
		int len = 20;
		
		System.out.println(solution(len));//
	}// end main

	private static int solution(int len) {
		int count = 0;

		// 1. 소수인가 아닌가를 검증할 배열 : int배열
		int[] sus = new int[len+1]; //0-19,20
//		for (int x : sus) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
		
		
		// 2. 2중 반문목 이용 : 소수면 true, true 개수 count
		for (int x = 2; x <= len; x++) {
//			System.out.println("====="+x+"=====" + sus[x]);
			if(sus[x]==0) {
				// 0== 소수가됨
				count++;
				for (int i = x; i <= len; i+=x) {
//					System.out.println(i);
					sus[i] = 1;
				}
			}
		}

		return count;
	}

}// end class
