package operator;

public class Relation {
	public static void main(String[] args) {
		// 등가 비교
		// @기본 자료형 등가 비교
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println();
		
		// @참조 자료형 등가 비교
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2);
	}
}
