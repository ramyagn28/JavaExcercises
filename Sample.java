package ex;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sample {
	static String str = "";
	public static void main(String args[]) {
		
//		for(int y =1; y<3; y++) {
//		z:	for (int x=2 ; x <7 ;x++) {
//				if(x==3) continue;
//				if(x==5) break z;
//				str = str+x;
//			}
//		}
//		System.out.println(str);
		
//		int i=0;
//		for(i=2; i<20; i+=2) {
//			i = i + i;
//		}
//		System.out.println(i);
		
//		String s = "America";
//		s = "Country" + s;
//		System.out.println(s);
		
//		int n, value;
//		value = 10;
//		try {
//			int i=1;
//			while(i<10) {
//				value = (value / i);
//				i=i+1;
//			}
//		} catch(ArithmeticException e) {
//			System.out.println("Exception Caught");
//		}
//		System.out.println(value);
		
//		Set <Integer> set1 = new HashSet <> (Arrays.asList(1, 2, 3));
//		Set <Integer> set2 = new HashSet <> (Arrays.asList(1, 2, 3));
//		List <Set <Integer>> list = new ArrayList <> (Arrays.asList(set1, set2));
//		Optional <?> data = list.stream()
//		.flatMap(s -> s.stream())
//		    .reduce(Integer::sum);
//		System.out.println(data.get());
		
		 SortedSet<String> set1 = new TreeSet<>();
		    set1.add("Java");
		    set1.add("It's");
		    set1.add("Program");
		    set1.add("Coding");
		    set1.add("Testing");
		    set1.add("Java");
		    System.out.println(set1);
//		    SortedSet<String> set2= set1.headSet("P");
		    SortedSet<String> set2= set1.tailSet("P");
		    System.out.println(set2);
//		    set2.remove("It's");
		    set2.add("Why");
//		    set2.add("Not");
		    System.out.println(set2);
		    System.out.println(set1);
	}	
}
