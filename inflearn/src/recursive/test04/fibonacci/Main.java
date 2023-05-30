package recursive.test04.fibonacci;

import java.util.Scanner;

public class Main {
	/*
	 * 문제 : 재귀함수 - 피보나치 입력 : 10 출력 : 1 1 2 3 5 8 13 21 34 55
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 10;
		for (int i = 1; i <= n; i++) {
			System.out.print(solution(i) + " ");
		}
	}

	private static int solution(int i) {
		if(i<=1) return i;
		
		return solution(i - 1) + solution(i - 2);
	}
}
