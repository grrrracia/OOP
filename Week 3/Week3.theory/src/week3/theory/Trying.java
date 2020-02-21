package week3.theory;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class Student implements Comparable {
  String name;
  Double gpa;

  public Student(String n, Double g) {
    this.name = n;
    this.gpa = g;
  }

  public String getName() {
    return name;
  }

  public Double getGPA() {
    return gpa;
  }

  public String formatting() {
    return name + " " + gpa;
  }

  public int compareTo(Object obj) {
    Student emp = (Student) obj;
    int deptComp = name.compareTo(emp.getName());

    return ((deptComp == 0) ? gpa.compareTo(emp.getGPA()) : deptComp);
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Student)) {
      return false;
    }
    Student emp = (Student) obj;
    return name.equals(emp.getName()) && gpa.equals(emp.getGPA());
  }
}

class StudentComparator implements Comparator<Student> {
  public int compare(Student emp1, Student emp2) {
    int nameComp = emp1.getGPA().compareTo(emp2.getGPA());
    return ((nameComp == 0) ? emp1.getName().compareTo(emp2.getName()) : nameComp);
  }
}

public class Trying {
  public static void main(String args[]) {
	  Scanner input = new Scanner(System.in);
    ArrayList<Student> names = new ArrayList<Student>();

    names.add(new Student(getName(), getGPA()));

    Iterator iter1 = names.iterator();
    while (iter1.hasNext()) {
      System.out.println(iter1.next());
    }
    System.out.println("Before sorting");
    Collections.sort(names, new StudentComparator());
    Iterator iter2 = names.iterator();
    while (iter2.hasNext()) {
      System.out.println(iter2.next());
    }
  }

private static Double getGPA() {
	Scanner input = new Scanner(System.in);
    System.out.println("Insert GPA: ");
	Double gpa = input.nextDouble();
	return gpa;
}

private static String getName() {
	Scanner input = new Scanner(System.in);
    System.out.println("Insert Name: ");
	String name = input.next();
	return name;
}
}
