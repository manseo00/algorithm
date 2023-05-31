package string.test02.changeupperlower;

import java.io.IOException;

public class Main3 {

	/*
	 * 문제 : 입력받은(주어진) 문자열에서 대소문자 변경해서 출력하는 프로그램 작성 입력 예시 : StuDY 출력 예시 : sTUdy 사용 :
	 * 97~122 소문자, 65~90 대문자 를 이용해서 분기
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

//		for (int i = 65; i < 122; i++) {
//			System.out.println(i + " : " + (char) i);
//		}

		// 97~122 소문자, 65~90 대문자 를 이용해서 분기
		// 문자열 >> 캐릭터배열 : toCharArray()
		
		// 방법 1.
		for (char x : str.toCharArray()) {
			if (x >= 65 && x <= 90) {
				answer += (char)(x + 32);
			} else {
				answer += (char)(x - 32);
			}
		}
		
		// 방법 2.
//		String[] arr = str.split("");
//		for (int i = 0; i < arr.length; i++) {
//			char x = arr[i].charAt(0);
//			if (x >= 65 && x <= 90) {
//				answer += (char)(x + 32);
//			} else {
//				answer += (char)(x - 32);
//			}
//		}

		return answer;
	}

}// end class
