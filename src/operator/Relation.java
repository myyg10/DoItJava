package operator;

public class Relation {
	public static void main(String[] args) {
		// � ��
		// @�⺻ �ڷ��� � ��
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println();
		
		// @���� �ڷ��� � ��
		String str1 = new String("�ȳ�");
		String str2 = new String("�ȳ�");
		System.out.println(str1 == str2);
	}
}
