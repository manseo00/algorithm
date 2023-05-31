package string.test02.changeupperlower;

import java.io.IOException;

public class Main {

	/*
	 * 문제 : 입력받은(주어진) 문자열에서 대소문자 변경해서 출력하는 프로그램 작성
	 * 입력 예시 : StuDY
	 * 출력 예시 : sTUdy
	 * 사용 :
	 * */
	
	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
		
//		String str = sc.nextLine();
		String str = "StuDY";
		System.out.println(str);
		
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";

//		System.out.println(Character.isUpperCase(str.charAt(0)));
		//toUpperCase(), toLowerCase()
		
		String[] arr = str.split("");
		for (int i = 0; i < arr.length; i++) {
			if(Character.isUpperCase(arr[i].charAt(0))) {
				answer += arr[i].toLowerCase();
			}else {
				answer += arr[i].toUpperCase();
			}
		}
		
		return answer;
	}

}// end class
