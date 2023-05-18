package test04arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test05IntStreamRange {

	public static void main(String[] args) {

		// n ~ n+9가지 할당된 배열 생성
		System.out.println(IntStream.range(0, 10));
		System.out.println(IntStream.range(0, 10).boxed().collect(Collectors.toList()));

		IntStream.range(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);

		IntStream.range(0, 10).filter(x -> x % 2 == 0).peek(System.out::println).count();

		IntStream.range(0, 10).boxed().map(x -> x * 10).forEach(System.out::println);
		
		IntStream.range(0, 10).boxed().map(x -> x * 10).limit(5).forEach(System.out::println);

		List<Integer> list = 
				IntStream.range(0, 10).boxed().map(x -> x * 10).limit(5).collect(Collectors.toList());
		System.out.println(list);
		
		
		
	}

}
