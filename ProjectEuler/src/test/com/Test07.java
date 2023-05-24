package test.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test07 {

	/*
	 * 소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
	 * 이 때 10,001번째의 소수를 구하세요.
	 */

	public static void main(String[] args) {

		int n = 2;
		int count1 = 0;
		int count2 = 0;
		
		Set<Integer> num = new HashSet<Integer>();
		while(count2<=10001) {
			for (int i = 2; i <= n; i++) {
				if(n%i==0) {
					count1++;
				}
			}
			if(count1 == 1) {
				count2++;
			}
			n++;
		}
		System.out.println(n);

	}// end main

}// end class
