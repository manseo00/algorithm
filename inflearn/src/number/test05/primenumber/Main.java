package number.test05.primenumber;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

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
//		int num = 2;
//		while(num <= len) {
//			for (int i = 2; i <= num; i++) {
//				if (num % i == 0 && i != num) {
//                    break;
//                }
//				if(num % i == 0 && i == num) {
//					count++;
//				}
//			}
//			num++;
//		}

		// 1. 소수인가 아닌가를 검증할 배열 : Boolean배열
		ArrayList<Boolean> prime = new ArrayList<Boolean>();
		prime.add(false);	// 0
		prime.add(false);	// 1
		for(int i = 2; i <= len; i++) {
			prime.add(true);
		}
//		System.out.println(prime);
		
		// 2. 2중 반문목 이용 : 소수면 true, true 개수 count
		for (int x = 2; x*x <= len; x++) {
//			System.out.println("====="+x+"=====");
			if(prime.get(x)) {
				for (int i = x*x; i <= len; i+=x) {
//					System.out.println(i);
					prime.set(i, false);// 나누어 떨어지는 수들 (배수들 포지션) false
				}
			}
		}
		
		for (int i = 0; i < prime.size(); i++) {
			if(prime.get(i)) {
				count++;
			}
		}
		return count;
	}

}// end class
