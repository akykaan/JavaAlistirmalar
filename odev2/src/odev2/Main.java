package odev2;


public class Main {

	public static void main(String[] args) {
		Courses courses1=new Courses
				("\\ımage\\coursesImage1.jpg", "Java Kampı", "Engin Demiroğ", 0);
		
		Courses courses2=new Courses
				("\\ımage\\coursesImage1.jpg", "C# Kampı", "Engin Demiroğ", 0);
		
		Courses courses3=new Courses
				("\\ımage\\coursesImage1.jpg", "Flutter Kampı", "Engin Demiroğ", 0);
		
		Courses courses4=new Courses
				("Unity Kampı", "Engin Demiroğ", 0);
		
		
		Courses courses5=new Courses
				("C++ Kampı", "Engin Demiroğ", 0);

		Courses[] coursesArray= {courses1,courses2,courses3,courses4,courses5};
		
		for (Courses courses : coursesArray) {
			System.out.println(courses.name);
		}
		
		
		
		CourseManager courseManager=new CourseManager();
		courseManager.AddCourse(courses1);
		courseManager.AddCourse(courses2);
		courseManager.AddCourse(courses3);
		courseManager.AddCourse(courses4);
		courseManager.AddCourse(courses5);
		
		courseManager.GetCourseInfo(courses5);
	}

}
