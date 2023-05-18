package test05collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("aaa");
		names.add("bbb");
		names.add("ccc");

		System.out.println(names);
		names.forEach(System.out::print);
		System.out.println();
		names.forEach(System.out::println);

		names = Arrays.asList("xxx", "yyy", "zzz");
		System.out.println(names);
		
		System.out.println("=======================");

//		String[] strs = new String[]{"xxx2","yyy2","zzz2"};
//		names = Arrays.asList(strs);

		names = Arrays.asList(new String[] { "xxx2", "y2yy3", "zzz2" });
		System.out.println(names);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			if(names.get(i).startsWith("xx")) names.set(i, "yang");
		}
		System.out.println(names);
		
		System.out.println("=======================");
		
		List<String> names2 = new ArrayList<String>();
		names2.add("aaa");
		names2.add("bbb");
		names2.add("ccc");
		
		System.out.println(names2);
		
		names2.remove(1);
		
		System.out.println(names2);
		
		System.out.println("=======================");
		
		List<Integer> list = List.of();
		System.out.println(list);
//		list.set(0, 44);	//UnsupportedOperationException
//		list.remove(0);		//UnsupportedOperationException
		
		
		
	}

}
