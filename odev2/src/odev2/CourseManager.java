package odev2;

public class CourseManager {
	
	public void AddCourse(Courses course) {
		System.out.println
		(course.name+ " Kursu eklendi.");
	}
	
	public void GetCourseInfo(Courses course) {
		System.out.println(
				"\nKursun Adý:"+course.name+"\n"+
				"Kursun Hocasý:"+course.teacher+"\n"+
				"Kursun Resmi:"+course.imagePath+"\n"+
				"Kursun Bitis Yüzdesi:"+course.finishAmount);
	}

}
