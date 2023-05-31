package string.test04.reversestring;

import java.io.IOException;

public class Main {

	/*
	 * 문제 : N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성
	 * 입력 예시 : 3
	 * 			 good
	 * 			 Time
	 * 			 Big
	 * 출력 예시 : doog
	 * 			 emiT
	 * 			 giB 
	 * 사용 :
	 */

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
	
//		int len = Integer.parseInt(sc.nextLin());	//3
		int len = 3;
		String[] arr = new String[] {"good","Time","Big"};
		
//		String[] arr = new String[len];
//		for (int i = 0; i < len; i++) {
//			String str = sc.nextLine();	//good,time,big
//			arr[i] = str;
//		
		
		solution(arr);
	}

	private static void solution(String[] arr) {

		for (String x : arr) {
			System.out.println(new StringBuffer(x).reverse());
		}

	}

}// end class
