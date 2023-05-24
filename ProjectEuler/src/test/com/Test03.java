package test.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test03 {

	/*
	 * 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다. 예를 들면 13195의 소인수는 5,
	 * 7, 13, 29 입니다. 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
	 * 
	 */

	public static void main(String[] args) {
//		long num1 = 2;
//		long num2 = 600851475143L;
//		
//		while(num1 < num2) {
//			if(num2%num1==0) {
//				num2 /= num1;
//				System.out.println(num1);
//				num1=2;
//			}else num1++;
//		}
//		System.out.println(num1);

		// 강사님
//		long su = 13195L;
		long su = 600851475143L;

		ArrayList<Long> list = new ArrayList<Long>();

		for (long i = 2L; i < (long) Math.sqrt(su); i++) {
			if (su % i == 0) {
				list.add(i);
			}
		}
//		System.out.println(list); // [5, 7, 13, 29, 35, 65, 91]

		Set<Long> primeNumbers = new HashSet<Long>();

		for (int x = 0; x < list.size(); x++) {
			primeNumbers.add(list.get(x));

			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(x) + ">>>" + list.get(i));

				if (list.get(x) % list.get(i) == 0) {
//					System.out.println(list.get(x) % list.get(i) != 0);
					if(list.get(x) != list.get(i)) {
						primeNumbers.remove(list.get(x));
					}
				}
			}

		}

		System.out.println(primeNumbers.stream().mapToLong(i -> i).max().getAsLong());

	}// end main

}// end class
