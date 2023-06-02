package dfsbfs.test02.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	/*
	 * 문제 : 송아지 찾기 (BFS : 상대트리탐색)
	 * 입력 : 5 14
	 * 출력 : 3
	 */
	
	static int asnwer = 0;
	static int[] dis = {1, -1, 5};
	static int[] ch;
	static Queue<Integer> Q = new LinkedList<>();
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int s = sc.nextInt();
//		int e = sc.nextInt();
		int s = 5;
		int e = 14;
		
		System.out.println(BFS(s,e));
	}
	
	private static int BFS(int s, int e) {
		
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0; // root level
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				for (int j = 0; j < 3; j++) { //  자식 3개짜리
					int nx = x+dis[j];
					if(nx==e) return L+1;
					//범위값안에 있으면서 방문한적이 없다면
					if(nx>1 && nx<=10000 && ch[nx]==0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		
		return 0;
	}

}
