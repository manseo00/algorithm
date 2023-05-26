package dfsbfs.test01.dfs;

import java.util.Scanner;

public class Main3 {
	/*
	 * 문제 : 바둑이 승차 (DFS)
	 * 		 N마리의 바둑이와 각 바둑이의 무게 W가 주어지면,
	 * 		 철수가 트럭에 태울 수 있는 가장 무거운 무게 출력
	 * 입력 : 259 5 
	 * 		 81
	 * 		 58
	 * 		 42
	 * 		 33
	 * 		 61
	 * 출력 : 242
	 */

	static int answer = Integer.MIN_VALUE, c, n;
	
	public void DFS(int L, int sum, int[] arr) {
		if(sum>c) return;
		if(L==n) {
			answer = Math.max(answer, sum);
		}else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Main3 T = new Main3();
		c = sc.nextInt();
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}


