package test.com;

import java.util.ArrayList;
import java.util.Collections;

public class Test04_1 {

	/*
	 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다. 두 자리 수를 곱해 만들 수 있는
	 * 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다. 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
	 */

	public static void main(String[] args) {

//		for (int i = 999; i >= 100; i--) {
//			for (int j = 999; j >= 100; j--) {
//				int mul = i*j;
//				
//				String rev1 = String.valueOf(mul);
//				String rev2 = new StringBuffer(rev1).reverse().toString();
////				System.out.println(rev1);
////				System.out.println(rev2);
//				if(rev1 == rev2) {
//					System.out.println(rev1);
//				}
//			}
//		}

		// 강사님

		int positionCount = 100;
		long startTime = System.currentTimeMillis();
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int x = positionCount; x < positionCount * 10; x++) {
			for (int i = positionCount; i < positionCount * 10; i++) {
				if (isSymmetry(x * i)) {
//					System.out.println(x + "*" + i + "=" + x * i);
					list.add(x * i);
				}
			}

		}
		System.out.println(Collections.max(list));
		System.out.println("time : "+(System.currentTimeMillis()-startTime));

	} // end main

	private static boolean isSymmetry(int su) {

		int tempSu = su;
		int result = 0;

		while (tempSu != 0) {
			result *= 10;
			result += tempSu % 10; // 나머지
			tempSu /= 10; // 몫
//			System.out.println(result);

		}

		return su == result;
	}
}// end class
