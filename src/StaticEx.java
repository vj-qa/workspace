
public class StaticEx {
public static int empid=0;
// constructor
public  StaticEx(){
	empid +=1;
	//static method
}
	public static void doShow(int n){
		System.out.println("abcd "+n);
	}

public static void main(String args[]){
	StaticEx sec=new StaticEx();
	System.out.println(empid);
	sec.doShow(5);
}
}
