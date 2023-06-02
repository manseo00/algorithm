package string.test12.binary;

import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 암호
	 * 		 
	 * 입력 예시 : #****###**#####**#####**##**
	 * 출력 예시 : K2HS7E
	 * 사용 : 리스트
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int len = sc.nextInt();
//		String str = sc.nextLine();
		String len = "4";
		String str = "#****###**#####**#####**##**";
		
		System.out.println(solution(Integer.parseInt(len), str));//
	}// end main

	private static String solution(int len, String str) {
		String answer = "";
		System.out.println(len);
		System.out.println(str);
		
		String temp = "";
		// 반복문 1 = 암호 / len		
		// 반복문 2 = len * 7 (7씩 증가)
		for (int i = 0; i < len*7; i+=7) {
//			System.out.println(i);
			// 7자리씩 획득
			temp = str.substring(i,i+7);
//			System.out.println(temp);
			
			// 암호 잘라서 #=1, *=0 바꾸기
			temp = temp.replace("#", "1").replace("*", "0");
			System.out.println(temp);
			
			// 정수로 변환
			int su = Integer.parseInt(temp,2);	// 2진수형태의 문자를 10진수로 바꿈
			System.out.println(su + " : " + (char)su);
			
			// 문자형들 결합
			answer += (char)su;
		}
		
		return answer;
	}

}// end class
