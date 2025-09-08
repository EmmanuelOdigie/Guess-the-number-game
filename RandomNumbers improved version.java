package JavaRandomNumbers; // project made in eclipse
import java.util.Scanner; // imported Scanner class
import java.io.IOException;

public class RandomNumbers { // public class 'RandomNumbers' made

public void calcRandomNum() {
	
// opens scanner, object input created, (System.in) - allows keyboard use
	Scanner input = new Scanner(System.in); 
	
	double secondNumber = 11*Math.random() + 1; // '11*Math.randon()' gets code to pick number
	// 0.0 to 10.0 adding '+1' shifts it to 1.0 - 10.0
	
	int number2 = (int) secondNumber; // convert double to int
	
	int randNum2 = input.nextInt(); // reads in the integer input from user and stores it in integer
	// variable 'randNum2'
	
	input.close(); // close scanner
	
// if randNum2 (user input) is equal to number2 (converted system number by Mat.random())
	if(randNum2 == number2) { // if statements made
	
	// if the numbers match display text with the number chosen by the system
		System.out.println("You guessed it, congratulations!!, I chose the number: " + number2);
	
	}else if(randNum2<0) { // if user puts in an invalid number, number less than 0
		
		System.out.print("Error please start again and put a number between 1 and 10 "); // display text	
		
	}else { // if the user put in the valid number, system will check and compare
		
		System.out.println("AHH UNLUCKY, Please try again "); // display text if no match
		System.out.println("The actual number was: " + number2); // display text and number from
		// system input
	}
		
}

	public static void main(String[] args) {// reads, run & executes code
		
	// display text
		System.out.println("Lets see if you can match the number I'm thinking of :-P ");
		System.out.print("Please put in a number between 1 and 10: ");
		
	// created object 'input' to open the scanner (System.in) allows for keyboard use
		Scanner input = new Scanner(System.in);
		
	// created int variable 'number' set it to chose a number up to number 10 
		
		double firstNumber = Math.floor(11*Math.random()); // 11*Math.random() calculates a random number up to 10
		// the equation assigned to double variable 'firstNumber', Math.random(), is set to double
		//values by default, Math.floor rounds the number to 1, so it can go from 1 to 10
		
		int number = (int) firstNumber; // convert double to int and stores it in int variable 'number' 
		
		int randNum = input.nextInt();  // read in the integer input from user and stores it in 
		// int variable 'randNum'
		
	// display text and number assigned to variable randNum
		System.out.println("Number chosen: " + randNum); 
		
		RandomNumbers myRandomNumbersRetry = new RandomNumbers();
		
		if(randNum == number) { // if statement set, if randNum(users input) equals to number -
	//11*Math.random() system input
			
		// display text and systems input assigned to variable number
		System.out.println("You guessed it, congratulations!!, I chose the number: " + number);
		}else if(randNum<0) {
			
			System.out.print("Please put a number between 1 and 10: ");	
			myRandomNumbersRetry.calcRandomNum();
			
		}else {
			
			System.out.println("AHH UNLUCKY, Please try again "); // display text if no match
			System.out.println("The actual number was: " + number); // display text and number from
			// system input
		}
		
	

	}

}

// result:
//Lets see if you can match the number I'm thinking of :-P 
//Please put in a number between 1 and 10: -1
//Number chosen: -1
//Please put a number between 1 and 10: 6
//You guessed it, congratulations!!, I chose the number: 6

//Result:
//Lets see if you can match the number I'm thinking of :-P 
//Please put in a number between 1 and 10: -1
//Number chosen: -1
//Please put a number between 1 and 10: -1
//Error please start again and put a number between 1 and 10 

//Result
//Please put in a number between 1 and 10: 9
//Number chosen: 9
//AHH UNLUCKY, Please try again 
//The actual number was: 1

