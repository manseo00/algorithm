package recursive.test02.binary;

import java.util.Scanner;

public class Main {
	/*
	 * 문제 : 재귀함수 - 2진수
	 * 입력 : 11
	 * 출력 : 1011
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		solution(n);
	}

	private static void solution(int n) {
		if(n==0) return;
		
		solution(n/2);	
		System.out.print(n%2);
	}
}
