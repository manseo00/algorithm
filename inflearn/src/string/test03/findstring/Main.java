package string.test03.findstring;

import java.io.IOException;

public class Main {

	/*
	 * 문제 : 입력받은(주어진) 문장 속 가장 긴 단어 출력하는 프로그램 작성 입력 예시 : it is time to study 출력 예시 :
	 * study 사용 :
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
		
		int temp = 0;
		// 1. 배열로 만들고 반복문 구현
		for (String x : str.split(" ")) {
			// 2. 아이템 x의 길이가 임시저장된 문자열의 길이보다 크면 if
			if(x.length() > temp) {
				temp = x.length();	// 큰문자열의 길이 임시저장
				answer = x;	// 답변에 단어 할당
			}
		}
	
		return answer;
	}

}// end class
