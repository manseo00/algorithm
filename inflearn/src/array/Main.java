package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/*
	 * 문제 : 두 배열 합치기
	 * 입력 예시 : 3
	 * 			 1 3 5
	 * 			 5
	 *			 2 3 6 7 9 
	 * 출력 예시 : 1 2 3 5 6 7 9 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] sus1 = new int[n];
		for (int i = 0; i < sus1.length; i++) {
			sus1[i] = s.nextInt();
		}
		int m = s.nextInt();
		int[] sus2 = new int[m];
		for (int i = 0; i < sus2.length; i++) {
			sus2[i] = s.nextInt();
		}
		
		System.out.println(solution(n,m,sus1,sus2));
	}
	private static ArrayList<Integer> solution(int n,int m,int[] a,int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int p1 = 0,p2 = 0;
		while(p1<n && p2<m) {
			if(a[p1]<b[p2]) {
				answer.add(a[p1++]);// add선행, p1++
//				System.out.println(answer);
			}
			else {
				answer.add(b[p2++]);
			}
		}
		while(p1<n)answer.add(a[p1++]);
		while(p2<m)answer.add(b[p2++]);
		return answer;
	}

}// end class
