package test03math;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	/*
	 * 날짜 : 2023.05.17
	 * 문제 : 입력받은(주어진) 정수의 제곱을 출력하는 프로그램 작성
	 * 입력 예시 : 10
	 * 출력 예시 : 100
	 * 사용 : 
	 * */
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
//		int su = sc.nextInt();
		int su = 10;
		
		System.out.println(solution(su));
	}// end main

	private static String solution(int su) {
		String answer = "";
		
		answer += (int)Math.pow(su, 2);
		
		return answer;
	}

}// end class
