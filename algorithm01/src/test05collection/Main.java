package test05collection;

import java.io.IOException;
import java.util.Stack;

public class Main {

	/*
	 * 문제 : 입력받은(주어진) 문자열의 끝에서 3단어를 제거하여 출력하는 프로그램 
	 * 입력 예시 : Hello world java html css 
	 * 출력 예시 : Hello world 사용 :
	 */

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();

		String str = "Hello world java html css";

		System.out.println(solution(str));

	}// end main

	private static String solution(String str) {
		String answer = "";

		String[] arr = str.split(" ");

//		for (int i = 0; i < arr.length-3; i++) {
//			answer += arr[i] + " ";
//		}

		Stack<String> st = new Stack<String>();
		for (int i = 0; i < arr.length; i++) {
			st.push(arr[i]);
		}
		System.out.println(st);

		for (int i = 0; i < 3; i++) {
			st.pop();
		}
		System.out.println(st);
		
//		for (String x : st) {
//			answer += x + " ";
//		}
//		System.out.println(String.join(" ", st));
		answer = String.join(" ", st);

		return answer;
	}

}// end class
