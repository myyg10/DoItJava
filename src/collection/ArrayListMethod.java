package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		List<Integer> aList1 = new ArrayList<Integer>();
		// add(E element)
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		// add(int index, E element)
		aList1.add(1, 6);
		System.out.println(aList1.toString());
		// addAll(또 다른 리스트 객체)
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2);
		// 4. addAll(int index, 또 다른 리스트 객체)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(aList3);
		// 5. set(int index, E element)
		aList3.set(1, 5);
		aList3.set(3, 6);
		System.out.println(aList3);
	}

}
