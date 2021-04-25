package odev2;

public class Courses {
	String ýmagePath;
	String name;
	String teacher;
	int finishAmount;
	
	
	public Courses(String ýmagePath,String name,String teacher,int finishAmount) {
		this.ýmagePath=ýmagePath;
		this.name=name;
		this.teacher=teacher;
		this.finishAmount=finishAmount;
	}
	
	public Courses(String name,String teacher,int finishAmount) {
		this.ýmagePath="Ders Resmi Eklenmemiþ.";
		this.name=name;
		this.teacher=teacher;
		this.finishAmount=finishAmount;
	}
	
}
