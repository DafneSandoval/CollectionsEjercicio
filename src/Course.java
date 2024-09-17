public class Course
{ 
	
	public String name; //Nombre de curso
     public String id; //ID del curso
       public int credits; //Créditos

    public Course( String name, String id, int credits )
    {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }
    
    public String getName()
	{ return name;
	
}  // get Name
    
    public String getId()
	{ return id;
	
}  // get credits
   
    public int getCredits()
    	{ return credits;
    	
    }  // get credits

    @Override
    public String toString()
    {
        return "Course{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", credits=" + credits + '}';
    }
}