public class Main {
	public static void main(String[] args) {
		CourseService courseService = new CourseService();
		
	    String courseId = "math_01";
	    String studentId = "120120";
	    
	    System.out.println("Course information ID ");
	    courseService.displayCourseInformation(courseId);
	    
	    System.out.println("Student information ID ");
	    courseService.displayCourseInformation(studentId);
	    
	    System.out.println("Enroll Student (ID) ");
	    courseService.enrollStudent(studentId, courseId);
	    
	    System.out.println("Course information (STUDENT ID)");
	    courseService.displayCourseInformation(studentId);
	    
	    System.out.println("Enroll Student x2");
	    courseService.enrollStudent(studentId, courseId );
	    
	    System.out.println("Course informatin x2 (STUDENT ID)");
	    courseService.displayCourseInformation( studentId);
	    
	} //main
	
}// class Main
