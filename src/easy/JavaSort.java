package easy;

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double CGPA;
	public Student(int id, String fname, double CGPA) {
		super();
		this.id = id;
		this.fname = fname;
		this.CGPA = CGPA;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCGPA() {
		return CGPA;
	}
}

//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		
		studentList.sort(new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                int cgpaComparison = Double.compare(s2.getCGPA(), s1.getCGPA());
	                if (cgpaComparison != 0) {
	                    return cgpaComparison;
	                }

	                int nameComparison = s1.getFname().compareTo(s2.getFname());
	                if (nameComparison != 0) {
	                    return nameComparison;
	                }

	                return Integer.compare(s1.getId(), s2.getId());
	            }
	        });
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
      	
      	in.close();
	}
}
