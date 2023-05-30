package recursive.test01.recursive;

import java.util.Scanner;

public class Main2 {
	/*
	 * 문제 : 재귀함수
	 * 입력 : 3
	 * 출력 : 1 2 3
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		solution(n);
		
	}

	private static void solution(int n) {
		if(n==0) return;
//		System.out.print(n + " ");	// push 3 2 1 
		solution(n-1);	
		System.out.print(n + " ");	// pop 1 2 3 
	}
}
