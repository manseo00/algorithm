package test05collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class Main2 {

	/*
	 * 문제 : 입력받은(주어진) 문자열에서 중복된 문자열 배제하여 출력하는 프로그램 
	 * 입력 예시 : Hello java java html java 
	 * 출력 예시 : Hello html java
	 */

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();

		String str = "Hello java java html java";

		System.out.println(solution(str));

	}// end main

	private static String solution(String str) {
		String answer = "";
		
		//중복된 java 제거
		//replace
//		System.out.println(str.replace("java", ""));
//		answer = str.replace("java", "");
//		answer = answer.replace("   "," ");
		
		
		String[] arr = str.split(" ");
		System.out.println(String.join(" ", arr));
		
		answer = String.join(" ", new HashSet<String>(Arrays.asList(arr)));

		return answer;
	}

}// end class
