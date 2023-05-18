package test04arrays;

import java.util.Arrays;

public class Test04StreamMinMaxSum {

	public static void main(String[] args) {

		Double[] ds = new Double[] {1.1, 2.2, 3.3, 2.0, 1.8};
		
		// min
		System.out.println(Arrays.stream(ds).mapToDouble(x->x).min());	//OptionalDouble[1.1]
		System.out.println(Arrays.stream(ds).mapToDouble(x->x).min().getAsDouble()); //1.1
		
		// max
		System.out.println(Arrays.stream(ds).mapToDouble(x->x).max());	//OptionalDouble[3.3]
		System.out.println(Arrays.stream(ds).mapToDouble(x->x).max().getAsDouble()); //3.3
		
		// sum
		System.out.println(Arrays.stream(ds).mapToDouble(x->x).sum());	//10.4
		
	}

}
