package odev2;

public class Courses {
	String �magePath;
	String name;
	String teacher;
	int finishAmount;
	
	
	public Courses(String �magePath,String name,String teacher,int finishAmount) {
		this.�magePath=�magePath;
		this.name=name;
		this.teacher=teacher;
		this.finishAmount=finishAmount;
	}
	
	public Courses(String name,String teacher,int finishAmount) {
		this.�magePath="Ders Resmi Eklenmemi�.";
		this.name=name;
		this.teacher=teacher;
		this.finishAmount=finishAmount;
	}
	
}
