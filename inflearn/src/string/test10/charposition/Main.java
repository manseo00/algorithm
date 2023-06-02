package string.test10.charposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 가장 짧은 문자거리.
	 * 		 한개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와
	 * 		 떨어진 최소거리 출력하는 프로그램 작성.
	 *		 모두 소문자.
	 * 입력 예시 : teachermode e
	 * 출력 예시 : 1 0 1 2 1 0 1 2 2 1 0
	 * 사용 : 리스트
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		String str = "teachermode e";
		String[] strs = str.split(" ");

		System.out.println(solution(strs[0],strs[1].charAt(0)));//208
	}// end main

	private static String solution(String str, char c) {
		String answer = "";
		System.out.println(str);
		System.out.println(c+"\n");
		// t e a c h e r m o d e
		// 1 0 1 2 1 0 1 2 2 1 0
		char[] cs = str.toCharArray();	//  char 배열
		
		ArrayList<String> arr = new ArrayList<String>();
		
		// 1. 순서대로 반복하면서 얼마나 떨어져있는지 확인
		int count = 0;
		for (int i = 0; i < cs.length; i++) {
//			System.out.println(cs[i]);
			
			if(cs[i]==c) {
				count=0;
				arr.add(String.valueOf(count));
			}else {
				count++;
				arr.add(String.valueOf(count));
			}
		}
		System.out.println(arr);
		System.out.println(String.join(" ", arr));
		
		// 2. 반대로 돌리면서 얼마나 떨어졌는지 확인
		// 3. 짧게 떨어진 수로 바꾸기
		count = 0;
		for (int i = cs.length-1; i >= 0; i--) {
//			System.out.println(cs[i]);
			
			if(cs[i]==c) {
				count=0;
			}else {
				count++;
				arr.set(i, String.valueOf(Math.min(Integer.parseInt(arr.get(i)), count)));
			}
		}
		System.out.println(arr);
		System.out.println(String.join(" ", arr));
		
		
		// 최소 : Math.min()
		// 출력 : String.join(" ",arr);
		
		
		
	
		return answer;
	}

}// end class
