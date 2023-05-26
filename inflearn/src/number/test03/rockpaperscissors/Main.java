package number.test03.rockpaperscissors;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/*
	 * 문제 : 가위바위보
	 * 		 1 : 가위, 2 : 바위, 3 : 보
	 * 입력 예시 : 5
	 * 			 2 3 3 1 3
	 * 			 1 1 2 2 3
	 * 출력 예시 : A B A B D
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int len = Integer.parseInt(sc.nextLine());
		int len = 5;
	
//		String strA = sc.nextLine();
//		String strB = sc.nextLine();
		String strA = "2 3 3 1 3";
		String strB = "1 1 2 2 3";
		
		System.out.println(solution(len, strA, strB));//
	}// end main

	private static String solution(int len,String strA,String strB) {
		String answer = "";
		// 문자열 >> 문자열 배열 >> 정수배열
		String[] arrA = strA.split(" ");
		String[] arrB = strB.split(" ");
		int[] numsA = Arrays.stream(arrA).mapToInt(Integer::parseInt).toArray();
		int[] numsB = Arrays.stream(arrB).mapToInt(Integer::parseInt).toArray();
		
		for (int i = 0; i < len; i++) {
			if(numsA[i] == 1) {
				if(numsB[i] == 1) {
					answer += " D";
				}else if(numsB[i] == 2) {
					answer += " B";
				}else if(numsB[i] == 3) {
					answer += " A";
				}
			}else if(numsA[i] == 2) {
				if(numsB[i] == 1) {
					answer += " A";
				}else if(numsB[i] == 2) {
					answer += " D";
				}else if(numsB[i] == 3) {
					answer += " B";
				}
			}else if(numsA[i] == 3) {
				if(numsB[i] == 1) {
					answer += " B";
				}else if(numsB[i] == 2) {
					answer += " A";
				}else if(numsB[i] == 3) {
					answer += " D";
				}
			}
		}
	
		return answer;
	}

}// end class
