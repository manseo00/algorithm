package test03math;

import java.math.BigInteger;

public class TestBigInteger {

	public static void main(String[] args) {

		// 1. 초기화 - String
		BigInteger big = new BigInteger("26");
		System.out.println(big);
		
		// 2. 초기화 - int
		big = BigInteger.valueOf(26);
		System.out.println(big);
		
		// 3. 초기화 상수
		big = BigInteger.TEN;	// ONE, TWO, TEN, ZERO
		System.out.println(big);
		
		// 4. 더하기 - add
		big = big.add(new BigInteger("100"));
		System.out.println(big);
		
		big = big.add(BigInteger.valueOf(1000));
		System.out.println(big);
		
		big = big.add(BigInteger.TEN);
		System.out.println(big);
		
		// 5. 빼기 : substract()
		
		
		// 6. 곱하기 : multiply()
		
		
		// 7. 나누기 : divide()
		
		
	}

}
