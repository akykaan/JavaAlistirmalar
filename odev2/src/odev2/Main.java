package odev2;


public class Main {

	public static void main(String[] args) {
		Courses courses1=new Courses
				("\\�mage\\coursesImage1.jpg", "Java Kamp�", "Engin Demiro�", 0);
		
		Courses courses2=new Courses
				("\\�mage\\coursesImage1.jpg", "C# Kamp�", "Engin Demiro�", 0);
		
		Courses courses3=new Courses
				("\\�mage\\coursesImage1.jpg", "Flutter Kamp�", "Engin Demiro�", 0);
		
		Courses courses4=new Courses
				("Unity Kamp�", "Engin Demiro�", 0);
		
		
		Courses courses5=new Courses
				("C++ Kamp�", "Engin Demiro�", 0);

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
