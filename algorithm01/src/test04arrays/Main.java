package test04arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	/*
	 * 날짜 : 2023.05.17
	 * 문제 : 입력받은(주어진) 문자열을 순정렬해서 출력하는 프로그램 작성
	 * 입력 예시 : 33 22 44 11 
	 * 출력 예시 : 11 22 33 44
	 * 사용 :
	 * */
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		String str = "33 22 44 11";	
		
		System.out.println(solution(str));
		
	}// end main

	private static String solution(String str) {
		String answer ="";
		
		// str >> 문자열배열
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));	//[33, 22, 44, 11]
		
		// 문자열배열 >> 정수배열
		Integer[] sus = new Integer[arr.length];
		
		for (int i = 0; i < sus.length; i++) {
			sus[i] = Integer.parseInt(arr[i]);
		}
//		System.out.println(Arrays.toString(sus));
		
		// 뒤집기
		List<Integer> slist = Arrays.asList(sus);
		Collections.reverse(slist);
		System.out.println(slist);	//[11, 44, 22, 33]
		
		// 순정렬
		Arrays.sort(sus);
		System.out.println(Arrays.toString(sus));	//[11, 22, 33, 44]
		
		// 순정렬 후 뒤집기(역정렬)
		List<Integer> dlist = Arrays.asList(sus);
		Collections.reverse(dlist);
		System.out.println(dlist);	//[44, 33, 22, 11]
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(sus[i]);
		}
//		System.out.println(arr);
		
		// 순정렬 이후에 반전 >> 역정렬
//		List<String> list = Arrays.asList(arr);
//		Collections.reverse(list);
//		System.out.println(list);
		
		// answer에 할당
		answer = String.join(" ", arr);
		
		return answer;
	}

}// end class
