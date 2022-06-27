package collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass {
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass> {
	int data1;
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public int compareTo(MyComparableClass o) {
		if(this.data1 < o.data1) return -1;
		else if(this.data1 == o.data1) return 0;
		else return 1;
	}
}

public class TreeSetMethod {
	public static void main(String[] args) {
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
		MyComparableClass myComparableClass1 = new MyComparableClass(2,5);
		MyComparableClass myComparableClass2 = new MyComparableClass(3,3);
		treeSet4.add(myComparableClass1);
		treeSet4.add(myComparableClass2);
		for(MyComparableClass mcc: treeSet4) {
			System.out.println(mcc.data1);
		}
		
		TreeSet<MyClass> treeSet5 = new TreeSet<MyClass>(new Comparator<MyClass>() {

			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1 < o2.data1) return -1;
				else if(o1.data1 == o2.data1) return 0;
				else return 1;
			}
		});
		MyClass myclass1 = new MyClass(2, 5);
		MyClass myclass2 = new MyClass(3, 3);
		treeSet5.add(myclass1);
		treeSet5.add(myclass2);
		for(MyClass mcc: treeSet5) {
			System.out.println(mcc.data1);
		}
	}
}
