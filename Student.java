package ex;

import java.util.Arrays;
import java.util.List;

public class Student implements Comparable < Student > {
    String name;
    int age;
    int mark;

    Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return o.mark > mark ? 1 : -1;
    }
    
    public static void main(String[] args) {
    	 List < Student > students = Arrays.asList(
    		        new Student("Anna", 18, 95),
    		        new Student("John", 20, 90),
    		        new Student("Mary", 17, 80),
    		        new Student("Belle", 19, 100)
    		    );
    	 boolean goodResult = students.stream().filter(student -> student.mark < 60).count() == 0;
    	 System.out.println(goodResult);
	}
}
