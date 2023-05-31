package string.test02.changeupperlower;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

	/*
	 * 문제 : 입력받은(주어진) 문자열에서 대소문자 변경해서 출력하는 프로그램 작성 
	 * 입력 예시 : StuDY 
	 * 출력 예시 : sTUdy 
	 * 사용 : Stream, map
	 */

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);

//		String str = sc.nextLine();
		String str = "StuDY";
		System.out.println(str);

		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";

		String[] arr = str.split("");
		List<String> list = Arrays.asList(arr);

//		list = list.stream().map(x -> x + "aaa").collect(Collectors.toList());
//		list = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//		answer = list.stream().map(x -> x + "aaa").collect(Collectors.joining());
//		answer = list.stream().map(x ->x.toUpperCase()).collect(Collectors.joining());
//		System.out.println(list);
		
		answer = list.stream().map(x ->{
			if(Character.isUpperCase(x.charAt(0))) {
				return x.toLowerCase();
			}else {
				return x.toUpperCase();
			}
		}).collect(Collectors.joining());

		return answer;
	}

}// end class
