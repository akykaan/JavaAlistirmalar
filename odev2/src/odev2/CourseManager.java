package odev2;

public class CourseManager {
	
	public void AddCourse(Courses course) {
		System.out.println
		(course.name+ " Kursu eklendi.");
	}
	
	public void GetCourseInfo(Courses course) {
		System.out.println(
				"\nKursun Ad�:"+course.name+"\n"+
				"Kursun Hocas�:"+course.teacher+"\n"+
				"Kursun Resmi:"+course.�magePath+"\n"+
				"Kursun Bitis Y�zdesi:"+course.finishAmount);
	}

}
