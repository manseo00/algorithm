package test05collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		// Set : 중북된 데이터 허용 안함, 순서 없음
		Set<Integer> s = new HashSet<Integer>();
		s.add(100);
		s.add(100);
		s.add(1000);
		s.add(10000);
		System.out.println(s);

		s.remove(1000);
		System.out.println(s);

		// 3개 출력 다 같음
		s.forEach(System.out::println);
		s.forEach(x -> System.out.println(x));
		for (Integer x : s) {
			System.out.println(x);
		}

		Set<String> s2 = Set.of("aa", "bb", "cc");
		System.out.println(s2);

		// 배열을 Set으로 바꾸기
		String[] arr = new String[] { "aaa", "bbb", "ccc" };
		Set<String> s3 = new HashSet<String>(Arrays.asList(arr));
		System.out.println(s3);
		System.out.println(String.join(" ", s3));
		
		// Set을 배열로 바꾸기
		String[] arr2 = String.join(" ", s3).split(" ");
		System.out.println(Arrays.toString(arr2));
		String[] arr3 = s3.toArray(String[]::new);
//		String[] arr3 = s3.toArray(new String[0]);	// 0 : 배열크기 자동지정
		System.out.println(Arrays.toString(arr3));
	}

}
