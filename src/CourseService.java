import java.util.HashMap;

public class CourseService
{
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, Course> courses = new HashMap<>();
    public CourseService()
    {
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }// constructor

    public void enrollStudent(String studentId, String courseId){
      students.get(studentId).enroll(courses.get(courseId));
    } //adds the given course form the student

    public void unEnrollStudent(String studentId, String courseId){
    	students.get(studentId).unEnroll(courses.get(courseId));
    	System.out.println("Sin curso");
    }// removes the given course form the student

    public void displayCourseInformation(String courseId){
    	//courses.forEach( (k,v)-> mostrar (k,v));
    	//System.out.println(courses.keySet()); // id
    	System.out.println("--- COURSES INF ---");
    	System.out.println(courses.entrySet()); // name, id, credits (
        System.out.println("------");
    }//shows the course name, id x and credits

    public void displayStudentInformation(String studentId){
    	    System.out.println("---STUDENT INFO---");
    	    students.forEach( (k,v)-> mostrar (k,v));
    	    
    }// main

	private static void mostrar(String k, Student v) {
			System.out.println("*** " + k);
			System.out.println("+---------------");
		} // mostrar 
	
// CALCULAR CREDITOS
	


}// CourseService