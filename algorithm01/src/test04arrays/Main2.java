package test04arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	/*
	 * 날짜 : 2023.05.17
	 * 문제 : 입력받은(주어진) 문자열을 순정렬해서 출력하는 프로그램 작성
	 * 입력 예시 : 33 22 44 11 
	 * 출력 예시 : 11 22 33 44
	 * 사용 :
	 * */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "33 22 44 11";
		
		System.out.println(solution(str));
		
		
	}//end main

	private static String solution(String str) {
		String answer = "";
		
		//str >> 문자열배열
		String[] arr = str.split(" ");
//		System.out.println(Arrays.toString(arr));
		
		//스트림 사용 문자열배열 >> 정수배열
		int[] sus = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray(); 
		System.out.println(Arrays.toString(sus));	
		
		//순정렬 11, 22, 33, 44
		Arrays.sort(sus);
		System.out.println(Arrays.toString(sus));	
		
		//스트림 사용 정수배열 >> 문자열 배열
		arr = Arrays.stream(sus).mapToObj(String::valueOf).toArray(String[]::new);
		System.out.println(arr);

		answer = String.join(" ", arr);
		
		//answer 할당
		return answer;
	}

}//end class
