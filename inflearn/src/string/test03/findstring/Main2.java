package string.test03.findstring;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main2 {

	/*
	 * 문제 : 입력받은(주어진) 문장 속 가장 긴 단어 출력하는 프로그램 작성. 
	 * 입력 예시 : it is time to study 
	 * 출력 예시 : study
	 * 사용 : list로 만들어서 구현
	 */

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);

//		String str = sc.nextLine();
		String str = "it is time to study";
		System.out.println(str);

		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";
		
		List<String> list = Arrays.asList(str.split(" "));
		
//		Collections.sort(list);	// 문자정렬
//		list.sort(Comparator.comparingInt(String::length));
//		System.out.println(list);
		
//		answer = list.stream().max(Comparator.comparingInt(String::length)).get();
		answer = list.stream().max(Comparator.comparing(String::length)).get();	//study
		System.out.println(list.stream().map(String::length).max(Integer::compare).get()); // 5
		return answer;
	}

}// end class
