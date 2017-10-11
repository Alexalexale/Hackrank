package priotiryQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import student.Student;

public class PriorityQueueExerc {

	static class Priorities {
		public List<Student> getStudents(List<String> events) {
			PriorityQueue<Student> pq = new PriorityQueue<Student>(Comparator.comparing(Student::getCgpa).reversed()
					.thenComparing(Student::getFname).thenComparing(Student::getId));
			for (String i : events) {
				String[] s = new String[4];
				s = i.split("\\s");
				if (s.length > 1) {
					pq.add(new Student(Integer.valueOf(s[3]), s[1], Double.valueOf(s[2])));
				} else {
					pq.poll();
				}
			}
			while (pq.size() > 1) {
				System.out.println(pq.poll().getFname());
			}
			return new ArrayList<Student>(pq);
		}
	}

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getFname());
			}
		}
	}

}
