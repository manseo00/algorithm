package string.test04.reversestring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

	/*
	 * 문제 : N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성
	 * 입력 예시 : 3
	 * 			 good
	 * 			 Time
	 * 			 Big
	 * 출력 예시 : doog
	 * 			 emiT
	 * 			 giB 
	 * 사용 : 리스트
	 */

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
//	
//		int len = Integer.parseInt(sc.nextLine());	//3
		int len = 3;
		String[] arr = new String[] {"good","Time","Big"};
		
//		String[] arr = new String[len];
//		for (int i = 0; i < len; i++) {
//			String str = sc.nextLine();	//good,time,big
//			arr[i] = str;
//		}
		
		List<String> list = solution(arr);
		for (String x : list) {
			System.out.println(x);
		}
	}

	private static List<String> solution(String[] arr) {
		List<String> list = new ArrayList<String>();
		
		for (String x : arr) {
			list.add(new StringBuffer(x).reverse().toString());
		}
		
		return list;
	}

}// end class
