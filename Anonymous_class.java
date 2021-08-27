abstract class Abs_Class
{
	public abstract void mymethod();
}
public class Anonymous_class {

	public static void main(String[] args) {
		
       Abs_Class obj = new Abs_Class()
        		{
        	        public void mymethod()
        	        {
        	        	System.out.println("Anonymous Inner class");
        	        }
        		};
        		obj.mymethod();
        
		
	}

}