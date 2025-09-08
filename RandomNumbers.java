package JavaRandomNumbers; // project made in eclipse
import java.util.Scanner; // imported Scanner class

public class RandomNumbers { // public class 'RandomNumbers' made

	public static void main(String[] args) {// reads, run & executes code
		
	// display text
		System.out.println("Lets see if you can match the number I'm thinking of :-P ");
		System.out.print("Please put in a number between 1 and 10: ");
		
	// created object 'input' to open the scanner (System.in) allows for keyboard use
		Scanner input = new Scanner(System.in);
		
	// created int variable 'number' set it to chose a number up to number 10 
		
		double firstNumber = 11*Math.random(); // 11*Math.random() calculates a random number up to 10
		// the equation assigned to double variable 'firstNumber', Math.random(), is set to double
		//values by default
		
		int number = (int) firstNumber; // convert double to int and stores it in int variable 'number' 
		
		int randNum = input.nextInt();  // read in the integer input from user and stores it in 
		// int variable 'randNum'
		
	// display text and number assigned to variable randNum
		System.out.println("Number chosen: " + randNum); 
		
		input.close();// close scanner
		
		if(randNum == number) { // if statement set, if randNum(users input) equals to number -
	//11*Math.random() system input
			
		// display text and systems input assigned to variable number
		System.out.println("You guessed it, congratulations!!, I chose the number: " + number);
		}else {
			System.out.println("AHH UNLUCKY, Please try again "); // display text if no match
			System.out.println("The actual number was: " + number); // display text and number from
			// system input
		}
		

	}

}

// result:
// Lets see if you can match the number I'm thinking of :-P 
//Please put in a number between 1 and 10: 7
//Number chosen: 7
//You guessed it, congratulations!!

//Result:
//Number chosen: -1
//AHH UNLUCKY, Please try again 
//The actual number was: 7