package recursive.test03.factorial;

import java.util.Scanner;

public class Main {
	/*
	 * 문제 : 재귀함수 - 팩토리얼
	 * 입력 : 5
	 * 출력 : 120
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(solution(n));
		
	}

	private static int solution(int n) {
		if(n==1) return n;
		else return solution(n-1)*n;
	}
}
