package student;

public class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(Integer id, String fname, Double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return getFname().concat(" ").concat(String.valueOf(getCgpa()));
	}
}
