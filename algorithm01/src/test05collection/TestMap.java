package test05collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String,String>();
		map.put("id", "admin");
		map.put("pw", "hi11");
		map.put("result", "1");
		
		System.out.println(map);
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("result"));
		
		for (String key : map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
		
		// map의 key >> Object[]
		String[] keys = map.keySet().toArray(String[]::new);
		System.out.println(Arrays.toString(keys));
		
		// map의 values >> Object[]
		String[] values = map.values().toArray(String[]::new);
		System.out.println(Arrays.toString(values));
		
		
		
	}

}
