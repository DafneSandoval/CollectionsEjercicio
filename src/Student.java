import java.util.ArrayList;
import java.util.List;

public class Student
{
   public String name;
    public String id;

    public List<Course> enrolledCourses = new ArrayList<>();


    public Student(String name, String id )
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }//getName

    public void setName( String name )
    {
        this.name = name;
    }//setName

    public String getId()
    {
    	return id;
    }// getId

    public void setId( String id )
    { this.id = id;
    }//setId

    
    // HACER IMPLEMENTACIÓNES
    public void enroll(Course course){
    	if (course != null && !enrolledCourses.contains(course)) {
    	}
        enrolledCourses.add( course );} // if curso 

    public void unEnroll(Course course){
        enrolledCourses.remove( course );
    } //unEnroll 

    public int totalEnrolledCourses(){
        return enrolledCourses.size(); //Regresa # total cursos
    }// totalEnrolledCourses
    
    //FIN DE IMPLEMENTACIONES

    public List<Course> getEnrolledCourses()
    {
        return enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", enrolledCourses=" + enrolledCourses
            + '}';
    }//main
}//class student