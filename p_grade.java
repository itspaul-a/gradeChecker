import java.util.Scanner;


class p_grade{


	public static int getInput(){

	
		Scanner s = new Scanner(System.in);
		System.out.println("How many assignments?: ");

		//number of classes
		int num = s.nextInt();
		return num;


	}

	public static void getTotal(){

		int n = getInput();
		int total = 0;

		for(int i=0; i<n; i++){
			while(i<n){
				Scanner a1 = new Scanner(System.in);
				int tem = i+1;
				System.out.println("Grade " + tem + " ?");

				int num = a1. nextInt();
				total = total + num;

				i++;
			}
		}


	}


	public static void main(String []args) {
		
		getTotal();
	}







	
	//public static void test() {

		//Scanner myObj = new Scanner(System.in);
		//System.out.println("Enter username");

		//String userName = myObj.nextLine();
		//System.out.println("Username is: " + userName);
	//	
	//}



};
