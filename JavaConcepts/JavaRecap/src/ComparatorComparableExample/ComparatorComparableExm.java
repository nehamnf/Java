package ComparatorComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int id;

    public Student(String name,int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student s) {
        return (this.id - s.id) ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class MyCustomComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class ComparatorComparableExm {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student("neha",21));
        students.add(new Student("mn",232));
        students.add(new Student("safi",8));
        students.sort(null);
        System.out.println("Sorted by ID (natural ordering):");
        for(Student stu: students){
            System.out.println(stu);
        }

        System.out.println("\nSorted by name (using custom comparator):");
        students.sort(new MyCustomComparator());
        students.forEach(System.out::println);
    }
}
