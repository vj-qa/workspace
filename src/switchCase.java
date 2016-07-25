
public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empId = 10;
		
		
		/*
		 * switch case does not take boolena
		 * string okay from java 7
		 * every case stmt needs a break followed by semicolon
		 */
		switch(empId){
		case 50:
			System.out.println("emp is madhu");
			break;
		case 100:
			System.out.println("emp is vijay");
			break;
		default:
			System.out.println("invalid");
			break;
		}
	}

	}
