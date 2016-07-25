import java.util.*;
public class LinkedEx {
public static void main(String args[]){
	 LinkedList l=new LinkedList();
	Iterator it;
	 Integer a[]={2,4,6,8,10};
	 it=l.iterator();
	 l.add(a[0]);
	 for (int count=0;it.hasNext();count++){
		 System.out.println(it.next());
	 }
	 
	 
}
}
