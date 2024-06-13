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
		float total = 0, avg;

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

		int possible = n * 100;

		System.out.println(total);
		System.out.println(possible);

		avg = total / possible * 100; 

		System.out.println("final grade is: " + avg);



	}


	public static void getPossible() {
		
		Scanner s = new Scanner(System.in);
		System.out.println();


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
