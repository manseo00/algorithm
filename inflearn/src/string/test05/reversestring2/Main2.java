package string.test05.reversestring2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {

	/*
	 * 문제 : 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	 * 		 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램 작성
	 * 입력 예시 : a#b!GE*T@S
	 * 출력 예시 : S#T!EG*b@a
	 * 사용 : 리스트
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "a#b!GE*T@S";

		System.out.println(solution(str));
	}// end main

	private static String solution(String str) {
		String answer = "";

		//0. 리스트에 할당
		List<String> list = Arrays.asList(str.split(""));
		System.out.println(list);
		
		//1.스트림 필터로 알파벳만 뽑아서 문자열로 반환
//		String temp = list.stream()
//				.filter(x->Character.isAlphabetic(x.charAt(0)))
//				.collect(Collectors.joining());
		String temp = list.stream()
				.filter(x->x.matches("[a-zA-Z]"))
				.collect(Collectors.joining());
		System.out.println(temp);
		
		
		//2.뒤집기
		String reverseStr = new StringBuffer(temp).reverse().toString();
		System.out.println(reverseStr);
		
		//3.새로운 리스트(reverseList)에 할당
		List<String> reverseList = 
				new ArrayList<String>(Arrays.asList(reverseStr.split("")));
		System.out.println(reverseList);
		
		//4.스트림 맵으로 리스트와 탬프를 이용하여 맵핑
//		answer = list.stream().map(x->{
//				if(x.matches("[a-zA-Z]")) {
//					return reverseList.remove(0);
//				}else {
//					return x;
//				}
//			}).collect(Collectors.joining());
		
		//for문으로도 가능
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).matches("[a-zA-Z]")) {
				list.set(i, reverseList.remove(0));
			}
		}
		System.out.println(list);
//		answer = list.stream().collect(Collectors.joining());
		answer = list.stream().reduce("",String::concat);
		return answer;
	}

}// end class
