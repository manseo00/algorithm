package test04arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test02StreamArrays {

	public static void main(String[] args) {

		String str = "11 33 22 44";
		String[] arr = str.split(" ");
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		// 스트림 사용 문자열 배열 >> 정수배열
		int[] sus = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		System.out.println(sus);
		System.out.println(Arrays.toString(sus));

		// 스트림 사용 정수배열 >> 문자열 배열
		arr = Arrays.stream(sus).mapToObj(String::valueOf).toArray(String[]::new);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		double[] ds = new double[] {1.2, 2.2, 3.3, 2.0, 1.8};
		System.out.println(Arrays.toString(ds));
		// 각 요소의 10배 증가값이 20이상인 요소들의 갯수
		long count = Arrays.stream(ds).filter(x->x*10>=20).count();
		System.out.println(count);
		
		List<Double> list = Arrays.stream(ds).filter(x->x*10>=20).boxed().collect(Collectors.toList());
		System.out.println(list);
	
	}

}
