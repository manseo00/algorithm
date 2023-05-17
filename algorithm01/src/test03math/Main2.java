package test03math;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	/*
	 * 날짜 : 2023.05.17
	 * 문제 : 입력받은(주어진) 정수의 15제곱을 출력하는 프로그램 작성
	 * 입력 예시 : 2
	 * 			 15
	 * 출력 예시 : 32768
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
		
		answer += (int)Math.pow(su1, su2);
		
		return answer;
	}

}// end class
