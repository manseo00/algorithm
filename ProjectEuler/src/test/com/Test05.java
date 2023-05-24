package test.com;

public class Test05 {

	/*
	 * 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다. 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는
	 * 가장 작은 수는 얼마입니까?
	 */

	public static void main(String[] args) {
		long n = 1;

		while (true) {
			int count = 0;
			for (int i = 1; i <= 20; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 20) {
				System.out.println(n);
				break;
			}
			n++;
		}

	}// end main

}// end class
