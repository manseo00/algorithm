package recursive.test01.recursive;

public class Main {
	/*
	 * 문제 : 재귀함수
	 */
	public static void main(String[] args) {
		// 재귀함수 기본원리...
		recursiveTest(1);
	}

	private static void recursiveTest(int count) {
		System.out.println("count : " + count);
		count++;
		if(count >= 5) {
		recursiveTest(count);
		}
		return;
	}
}
