/*import the scanner class from javas utility packadge*/
import java.util.Scanner;

class Assignment1 {
	public static void main(String[] args) {
		
		/*Creates scanner object*/
		Scanner scan = new Scanner(System.in);
		
		/* Prompts the user for a name*/
		System.out.println("Enter the competitor's name: ");
		
		/*the competitors name is captured by our scanner and stored in the variable named "name"*/
		String name = scan.nextLine();
		
		/*We prompt the user 3 times to populate our throw1, throw2, and throw3 variables*/
		/*The varaibles are all doubles, because I have no idea what type of number im going to recieve and it will make conversion easier
		in later steps*/
		System.out.println("Please enter the distance for throw 1: ");
		double throw1meter = scan.nextDouble();
		System.out.println("Please enter the distance for throw 2: ");
		double throw2meter = scan.nextDouble();
		System.out.println("Please enter the distance for throw 3: ");
		double throw3meter = scan.nextDouble();
		
		
		/*use concatenation to attatch the "name" variable to end of the string we output with the println function*/
		/*In programming concatenation is a fancy word for joning a variable to a string, its not that cool, but sometimes they have test
		quetions on it so its good to know*/
		System.out.println("Olympic Javelin Throws Enter the distances, in meters, for " + name);
		
		
		/*Convert our throwmeter variables from meters into yards, we store the yard value in a new variable called throw1yard. 
		again we use concatenation and the "/n" to start a new line and make our data more presentable*/
		System.out.println("Yards: ");
		double throw1yard = throw1meter*1.093;
		double throw2yard = throw2meter*1.093;
		double throw3yard = throw3meter*1.093;
		/*The line below is going to format the data we give it by rouding it up to 2 decimal spaces*/
		/*String.format("%.2f", throw1yard) will format the variable "throw1yard" to have exactly 2 decimal spaces by rouding up
		or adding .00 to an integer*/
		System.out.println(String.format("%.2f", throw1yard) + "\n" + String.format("%.2f", throw2yard) + "\n" + String.format("%.2f", throw3yard));
		
		/*Rinse and repeat for the remaning 3 units of measurement, its basic arithmetic included in the instructions*/
		System.out.println("Feet: ");
		double throw1feet = throw1yard*3;
		double throw2feet = throw2yard*3;
		double throw3feet = throw3yard*3;
		System.out.println(String.format("%.2f", throw1feet) + "\n" + 
		String.format("%.2f", throw2feet) + "\n" + String.format("%.2f", throw3feet));
		
		System.out.println("Inches: ");
		double throw1inch = throw1feet*12;
		double throw2inch = throw2feet*12;
		double throw3inch = throw3feet*12;
		System.out.println(String.format("%.2f", throw1inch) + "\n" + 
		String.format("%.2f", throw2inch) + "\n" + String.format("%.2f", throw3inch));
		
		System.out.println("Cm: ");
		double throw1cm = throw1meter*100;
		double throw2cm = throw2meter*100;
		double throw3cm = throw3meter*100;
		System.out.println(String.format("%.2f", throw1cm) + "\n" + 
		String.format("%.2f", throw2cm) + "\n" + String.format("%.2f", throw3cm));
	}
}