package string.test04.reversestring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main3 {

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
			//good
			char[] cs = x.toCharArray();
			int left = 0;	
			int right = x.length()-1;
			
			while(left<right) {
				//알고리즘에 자주쓰이는 함수패턴 : swap 자리바꾸기
				char temp = cs[left]; //'' = g
				cs[left] = cs[right];// g <= d
				cs[right] = temp; // d <= g
				
				
				left++;//0->1
				right--;//3->2
			}
			
			list.add(String.valueOf(cs));
		}
		
		return list;
	}

}// end class
