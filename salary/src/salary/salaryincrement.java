package salary;

import java.util.Scanner;

public class salaryincrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float salary;
		System.out.println("Please Enter Amount:");
		salary=input.nextFloat();
		for(int i=10000; salary<=i; ++i) {
			if (i>=10050) {
				break;
			}
			System.out.println(i);
			System.out.println(" Thank you for service!");
	}

}
}
