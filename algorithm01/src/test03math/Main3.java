package test03math;

import java.io.IOException;
import java.util.Scanner;

public class Main3 {

	/*
	 * 날짜 : 2023.05.17
	 * 문제 : 입력받은(주어진) 정수의 15제곱을 한 후 결과를
	 * 각각의 수의 합을 계산해서 출력하는 프로그램 작성
	 * 2**15 = 32768 :3+2+7+6+8 = 26
	 * 입력 예시 : 2
	 * 			 15
	 * 출력 예시 : 26
	 * 사용 : 
	 * */
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
//		int su1 = sc.nextInt();
//		int su2 = sc.nextInt();
		int su1 = 2;
		int su2 = 15;
		
		System.out.println(solution(su1, su2));
	}// end main

	private static String solution(int su1, int su2) {
		String answer = "";
		int p = (int)Math.pow(su1, su2);
		
		answer += p;
		
		char[] cs = answer.toCharArray();
		
		int sum = 0;
		
		for(int i = 0; i < cs.length; i++) {
//			System.out.println(cs[i]);
			sum += Integer.parseInt(String.valueOf(cs[i]));
		}
		
		answer = String.valueOf(sum);
//		answer = Integer.toString(sum);
		return answer;
	}

}// end class
