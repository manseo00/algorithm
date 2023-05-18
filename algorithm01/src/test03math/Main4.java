package test03math;

import java.io.IOException;
import java.math.BigInteger;

public class Main4 {

	/*
	 * 날짜 : 2023.05.17
	 * 문제 : 입력받은(주어진) 정수의 15제곱을 한 후 결과를
	 * 각각의 수의 합을 계산해서 출력하는 프로그램 작성
	 * 2**15 = 32768 :3+2+7+6+8 = 26
	 * 2의 1000제곱
	 * 입력 예시 : 2
	 * 			 15
	 * 출력 예시 : 26
	 * 사용 : BigInteger
	 * 
	 * 참고 : 제곱근 sqrt(), 절대값 abs(), 소수점 자리수 floor()
	 * 
	 * */
	
	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
		
//		int su1 = sc.nextInt();
//		int su2 = sc.nextInt();
		int su1 = 2;
		int su2 = 1000;
		
		System.out.println(solution(su1, su2));
	}// end main

	private static String solution(int su1, int su2) {
		String answer = "";
//		System.out.println(Math.pow(su1,su2));	// double(실수형)의 8byte
//		System.out.println((long)Math.pow(su1,su2));	//63제곱까지만가능(2기준)
		// 64제곱이상일경우 (2기준) => 큰수를 처리하는 타입으로계산
		BigInteger p = new BigInteger(String.valueOf(su1)).pow(su2);
		System.out.println(p);
		
		char[] cs = String.valueOf(p).toCharArray();
		int sum = 0;
		
		for(int i = 0; i < cs.length; i++) {
//			System.out.println(cs[i]);
			sum += Integer.parseInt(String.valueOf(cs[i]));
		}
		
		answer = String.valueOf(sum);
//		answer = Integer.toString(sum);
		
		//참고 : 제곱근 sqrt(), 절대값 abs(), 소수점 자리수 floor()
		System.out.println(Math.sqrt(100));
		System.out.println((int)Math.sqrt(100));
		System.out.println(Math.abs(-100));
		System.out.println(Math.floor(3.14));
		
		return answer;
	}

}// end class
