import java.util.Scanner;

public class CalculateMoneySpent{
	public static void main(String[] args){
		String name;
		int moneySpent;
		double average;
		int total;
		int totalDay = 7;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Your Money!!!\n");
		
		System.out.println("Hey, What is your name?");
		name = input.nextLine();
		
		System.out.println("How much money did you spend at the club on Monday");
		moneySpent = input.nextlnt();
		
		total = moneySpent;
		
		System.out.println(How much money did you spend at the club on Tuesday");
		moneySpent = input.nextlnt();
		
		total = total + moneySpent; 
		
		
	}
}
        total = total + moneySpent;
		
		System.out.println("How much money did you spend at the club on Thursday");
		moneySpent = input.nextlnt();
		
		total = moneySpent;
		
		System.out.println("How much money did you spend at the club on Friday");
		moneySpent = input.nextlnt();
		
		total = moneySpent;
		
		System.out.println("How much money did you spend at the club on Saturday");
		moneySpent = input.nextlnt();
		
		total = moneySpent;
		
		System.out.println("How much money did you spend at the club on ");
		moneySpent = input.nextlnt();
		
		total = moneySpent;
		
		average = (double) total/totalDay;
		
		System.out.prlntn("The Calculation Result:");
		
		System.out.prlntn("Hi Jonson.");
        System.out.prlntn("Your total expediture at the clubthis week is $ " + total);
        System.out.prlntn("With Ian Average daily expediture of $ " + average)l
    }	
}