package test.com;

import java.util.stream.IntStream;

public class Test01 {

	/*
	 * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다. 1000보다 작은 자연수
	 * 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
	 * 
	 */

	public static void main(String[] args) {

//		int n = 1;
//		int sum = 0;
//		while (n < 1000) {
//			if (n % 3 == 0 || n % 5 == 0) {
//				sum += n;
//			}
//			n++;
//		}
//		System.out.println(sum);

		// Stream 사용
		int answer = IntStream.range(1, 1000).filter(x -> x % 3 == 0 || x % 5 == 0).sum();
		System.out.println(answer);

	}// end main

}// end class
