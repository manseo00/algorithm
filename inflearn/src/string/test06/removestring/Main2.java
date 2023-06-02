package string.test06.removestring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	/*
	 * 문제 : 중복문자제거
	 * 		 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램 잓어
	 * 		 중복 제거된 문자열의 각 문자는 원래 문자열의 순서 유지
	 * 입력 예시 : ksekkset
	 * 출력 예시 : kset
	 * 사용 : 리스트
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "ksekkset";

		System.out.println(solution(str));//kset
	}// end main

	private static String solution(String str) {
		String answer = "";

		//스트림으로 해보세요
		//스트림에 오라클 중복배제와 같은 함수가 있다.
		List<String> list = new ArrayList<String>(Arrays.asList(str.split("")));
		
		answer = list.stream().distinct().reduce("", String::concat);
		
		return answer;
	}
		

}// end class
