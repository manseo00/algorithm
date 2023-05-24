package test.com;

public class Test02 {


	/*
	 * 피보나치(Fibonacci) 수열의 각 항은 바로 앞의 항 두 개를 더한 것입니다.
	 * 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 
	 * 4백만 이하의 짝수 값을 갖는 모든 피보나치 항을 더하면 얼마가 됩니까?
	 * 
	 */

	public static void main(String[] args) {

		int num1 = 1, num2 = 2, sum = 0;

		while (true) {
			if (num2 <= 4000000) {
				if (num2 % 2 == 0) {
					sum += num2;
				}
				int temp = num2;
				num2 += num1;
				num1 = temp;
			} else
				break;
		}
		System.out.println(sum);
	

	}// end main

}// end class
