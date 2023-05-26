package number.test08.rank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 등수 구하기 (동점시 동일등수)
	 * 입력 예시 : 5
	 * 			 87 89 92 100 76 
	 * 출력 예시 : 4 3 2 1 5
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int len = Integer.parseInt(sc.nextLine());
		int len = 5;

//		String str = sc.nextLine();
		String str = "87 89 92 100 76";
//		String str = "87 89 92 100 100";
		
		System.out.println(solution(len, str));//
	}// end main

	private static String solution(int len, String str) {
		String answer = "";
		System.out.println(str);
		
		// 1. 문자열 배열(split) >> 정수 배열
		String[] arr = str.split(" ");
		
		int[] score = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray(); 
		System.out.println(Arrays.toString(score));
		
		// 2. 등수 배열(0등 없으니까 1등으로 채우기)
		int[] rank = new int[len];
		Arrays.fill(rank, 1);
		System.out.println(Arrays.toString(rank));
		
		// 3. 반복문 >> 순위결정(동점시 동일등수)
		for (int i = 0; i < score.length; i++) {
			//rank[i] = 1;
			
			for (int j = 0; j < score.length; j++) {
				// i점수와 j점수 비교
				if(score[i] < score[j]){
					rank[i]++;
				}
			}
		}
		
		answer = String.join(" ", Arrays.stream(rank).mapToObj(String::valueOf).toArray(String[]::new));	
		return answer;
	}

}// end class
