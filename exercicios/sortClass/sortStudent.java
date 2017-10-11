package sortClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import student.Student;

public class sortStudent {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student(2, "Lucas", 7.26));
		studentList.add(new Student(3, "Leandro", 7.35));
		studentList.add(new Student(4, "Estani", 7.36));
		studentList.add(new Student(3, "Celio", 7.35));
		studentList.add(new Student(1, "Ale", 7.36));

		Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getId));
		studentList.forEach(System.out::println);

	}

}
