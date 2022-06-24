


import java.util.Random;
import java.util.Scanner;

public class RandomChars {
	public static void main(String[] args) {

       makeRandoms(); // ask the user for a seed and make all the random things
        
	}
	
	// this method asks the user for a seed for the random number generator and 
	// then generates a random uppercase char, lowercase char, digit char
	public static void makeRandoms() {

    // ========== INSERT YOUR CODE HERE ==========
		/* take user input as an int and store it in seedInput with a minimum seed of 8
		 * to generate a specific char based on ASCII table
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a seed for the random number generator:");
		int seedInput = sc.nextInt();
		Random rand = new Random(seedInput);

		/* take the rand int and set a bound of the seedInput and add 65, 97 and 48 to
		 * return the appropriate values on ASCII table
		 */
		char randUpCase = (char)(rand.nextInt(26) + 65);//all values on ASCII table between 65 and 90
		char randLowCase = (char)(rand.nextInt(26) + 97);//all values on ASCII table between 61 and 122
		char randDigit = (char)(rand.nextInt(10) + 48);//all values on ASCII table between 48 and 57

		//output random char to user
		System.out.println(
				"Random:" +
				"\nUppercase = " + randUpCase +
				"\nLowercase = " + randLowCase +
				"\nDigit = " + randDigit );




		// ===========================================
    
	
	
	}
        

}








// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Determining how I can generate a random char and have it
output the same values and understanding what to do with userInput



2. What will you always remember (never forget) from this exercise?
I need to take breaks and let my mind work on a problem subconsciously



*/