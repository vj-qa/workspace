import java.io.FileReader;

public class Exceptionfile {
	
	Exceptionfile()
	{
		try
		{
		 FileReader fr = new FileReader("foo.in");
		}
		catch(Exception e)
		{
			System.out.println("The exception is: "+e);
		}
	}
	
	public static void main(String args[])
	{
		Exceptionfile Ef = new Exceptionfile();
	}

}
