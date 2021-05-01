package odev2;

public class Courses {
	String imagePath;
	String name;
	String teacher;
	int finishAmount;
	
	
	public Courses(String imagePath,String name,String teacher,int finishAmount) {
		this.imagePath=imagePath;
		this.name=name;
		this.teacher=teacher;
		this.finishAmount=finishAmount;
	}
	
	public Courses(String name,String teacher,int finishAmount) {
		this.imagePath="Ders Resmi Eklenmemis.";
		this.name=name;
		this.teacher=teacher;
		this.finishAmount=finishAmount;
	}
	
}
