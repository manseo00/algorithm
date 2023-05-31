package string.test01.findchar;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	/*
	 * 문제 : 입력받은(주어진) 문자열에서 특정 문자의 갯수 출력하는 프로그램 작성
	 * 입력 예시 : Computercooler
	 * 			 c
	 * 출력 예시 : 2
	 * 사용 : Main을 Stream을 사용하여 다시 구현
	 * */
	
	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
		
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
		String str1 = "Computercooler";
		String str2 = "c";
		
		System.out.println(solution(str1, str2));
	}// end main

	private static int solution(String str1, String str2) {
		int count = 0;
		
		List<String> list = Arrays.asList(str1.split(""));
//		System.out.println(list);
//		System.out.println(list.stream().filter(i->i.equalsIgnoreCase(str2)).count());
		count += list.stream().filter(i->i.equalsIgnoreCase(str2)).count();
		
		return count;
	}

}// end class
