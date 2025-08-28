package ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shape {
	public void test(Shape s) {
		System.out.println("Inside shape");
	}
	
	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.test(s);
		s.test(null);
		
//		List < Integer > ls = new ArrayList < Integer > ();
//		ls.add(2);
//		ls.add(1);
//		ls.add(5);
//		ls.add(4);
//		ls.sort(new Comparator < Integer > () {
//		@Override
//		    public int compare(Integer num1, Integer num2) {
//		        return 1;
//		    }
//		});
//		List < Integer > lo = ls;
//		for (Object o: lo)
//		System.out.println(o);
//		
////		        List < Integer > list = new ArrayList < >();
////		        list.add(21);
////		        list.add(13);
////		        list.add(30);
////		        list.add(11);
////		        list.removeIf(e -> e % 2 != 0);
////		        System.out.println(list);
//		
//		Long d =134l;
//		Long l = Long.remainderUnsigned(Long.reverse(Long.reverse(d)),136l);
//		Double db =Double.valueOf(l-1);
//		System.out.println(db);
//		System.out.println(new Double(db).SIZE);
}
}

class Rectangle extends Shape {
	public void test(Shape s) {
		System.out.println("Inside Rectangle");
	}
}
