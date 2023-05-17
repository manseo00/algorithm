package test04arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Test01StreamCollection {

	public static void main(String[] args) {
		// Stream api : jdk 8
		
		List<String> names = new ArrayList<String>();
		names.add("aaa");
		names.add("bbb");
		names.add("ccc");

		System.out.println(names);
		names.forEach(System.out::println);
		
		names = Arrays.asList("xxx","yyy","zzz");
		System.out.println(names);
		
//		String[] strs = new String[]{"xxx2","yyy2","zzz2"};
//		names = Arrays.asList(strs);
		
		names = Arrays.asList(new String[]{"xxx2","yyy3","zzz2"});
		System.out.println(names);
		
		// names : 2라는 텍스트가 있는 단어가 몇개인지 출력
		// 반복문
		// 각 요소에서 2를 포함하는가?
		// 포함하면 카운트 업
		int count = 0;
		
		for (String x : names) {
//			System.out.println(x.indexOf("2")!=-1);	// 2를 포함
			System.out.println(x.contains("2"));	// 2를 포함
			if(x.contains("2")) count++;
			//참고
//			System.out.println(x.startsWith("2"));	// 2로 시작
//			System.out.println(x.endsWith("z2"));	// z2로 끝
		}
		System.out.println(count);
		
		// stream 파이프라인을 이용한 코딩방법 << 함수형프로그래밍
//		long count2 = names.stream().filter(x-> x.contains("2")).count();
		long count2 = names.stream().filter(x-> x.endsWith("2")).count();
		System.out.println(count2);
		names.stream().filter(x-> x.contains("2")).peek(System.out::println).count();
		
		Object[] names2 = names.stream().filter(x->x.endsWith("2")).toArray();
		System.out.println(names2);
		
		String[] names3 = names.stream().filter(x->x.endsWith("2")).toArray(String[]::new);
		System.out.println(names3);
		
		List<String> names4 = names.stream().filter(x-> x.endsWith("2")).collect(Collectors.toList());
		System.out.println(names4);
		
	}

}
