package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		System.out.println("Running");
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		System.out.println("\nQuestion 1:");
			int[] array = {1, 5, 2, 8, 13, 6}; 
			
		
		// 2. Print out the first element in the array
		System.out.println("\nQuestion 2:");	
			System.out.println(array[0]);
			
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("\nQuestion 3:");
			System.out.println(array[array.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		System.out.println("\nQuestion 4: (commented out)");
			//System.out.println(array[6]);
			// error msg: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6 at lab03/week03.Week03ArraysAndMethodsLab.main(Week03ArraysAndMethodsLab.java:23)

		
		// 5. Print out the element in the array at position -1, what happens?
		System.out.println("\nQuestion 5: (commented out)");	
			//System.out.println(array[-1]);
			// error msg: Index -1 out of bounds for length 6
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("\nQuestion 6: "); 	
			for (int i = 0; i < array.length; i++){
				System.out.println(i);
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("\nQuestion 7:");
			for (int number : array) {
				System.out.println(number);  
			}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("\nQuestion 8: ");
			double sum = 0; 
			for (int number : array) {
				sum += number; 
			}
			System.out.println("The total sum is " + sum);
		

			
		// 9. Create a new variable called average and assign the average value of the array to it
			System.out.println("\nQuestion 9: ");
			double average = sum / array.length; 
			System.out.println("The average is " + average);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			System.out.println("\nQuestion 10 - enhanced for loop that prints each odd  number in the array: ");
			for( int number : array) {
				if(number % 2 != 0) {
					System.out.println(number);
				}
			}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			System.out.println("\nQuestion 11: Create Name Array");
			String[] names = { "Sam", "Sally", "Thomas",  "Robert" }; // {} not ()
			for (String name : names) {
				System.out.println(name);
			}
		
		// 12. Calculate the sum of all the letters in the new array
			System.out.println("\nQuestion 12: Calculate the sum of all the letters");
			int nameSum = 0;
			for (String name : names) {
				nameSum += name.length();
			}
			System.out.println("The sum of all the letters in the array is equal to " + nameSum +"."); 

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
			System.out.println("\nQuestion 13 - method 13 (greetings):");
			method13("Tom");
			method13("Sally");
			
		
		// 14. Write and test a method that takes a String name and  
			System.out.println("\nQuestion 14 - method 14 (greetings):");
			String greeting = method14("Sarah");
			System.out.println(greeting);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
			/* The difference between the two methods is the first has a void return type for the method. It them calls the method with the string input in order to print it. 
			 * For method 14, the method has a string return type. Instead of having the system print to the console, you have it return the string. Outside the method you create the 
			 * string and have that print to the console.
			 */
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println("\nQuestion 15: "); 
		System.out.println(method15("code", 5)); 
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println("\nQuestion 16: ");
		System.out.println(method16(names, "Sam"));
		System.out.println(method16(names, "Jane"));
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println("\nQuestion 17: ");
		int[] array17 = {33, 19, 82, 26, 8, 98, 3};
		System.out.println(method17(array17)); 
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		System.out.println("\nQuestion 18: ");
		double[] doubArray = { 2.5, 5.0, 7.5};
		System.out.println(method18(doubArray));
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		System.out.println("\nQuestion 19: ");
		String[] subjects = {"Math", "Science", "Coding", "History", "ELA", "Biology", "Physics", "Gym"};
		int[] subjectsLength = (method19(subjects));
		//System.out.println(method19(subjects));
		for (int number : subjectsLength) {
			System.out.println(number);
		}

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println("\nQuestion 20: ");
		String[] sumLetters = {"A", "AA", "AAA", "AAAA", "AAAAA"}; 
		System.out.println(method20(sumLetters));
		

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println("\nQuestion 21: ");
		System.out.println(method21("hannah"));
		System.out.println(method21("apple"));
		

		
		
	}
	

	
	// Method 13:
	public static void method13(String name) {
		System.out.println("Greetings " + name + ", how are you?");
	}

	// Method 14:
	public static String method14(String name) {
		return "Greetings " + name + ", welcome!";
	}

	
	// Method 15:
	public static boolean method15(String name, int i) {
		return name.length() > i; 
	}
	
	// Method 16:
	public static boolean method16(String[] arr, String string) {
		for(String str : arr) {
			if(str.equals(string)) {
				return true;
			}
		}
		return false; 
	}

	
	// Method 17:
	public static int method17(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}

	
	// Method 18:
	public static double method18(double[] nums){
		double sum = 0.0;
		for (double num : nums) {
			sum += num;
		}
		return sum / nums.length;
	}

	
	// Method 19:
	public static int[] method19(String[] array19) {
		int[] answer = new int[array19.length];
		for (int i = 0; i < array19.length; i++) {
			answer[i] = array19[i].length(); 
		}
		return answer; 
	}

	
	// Method 20:
	public static boolean method20(String[] letters){
		int evenSum = 0;
		int oddSum = 0;
		for(String letter : letters) {
			if (letter.length() % 2 == 0) {
				evenSum += letter.length();
			}
			else {
				oddSum += letter.length();
			}
		}
		return evenSum > oddSum;
	}
	
	
	// Method 21:
	public static boolean method21(String palindrome) {
		for(int i = 0; i < palindrome.length()/2; i++) {
			if(palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
				return false;
			}
		}
		return true; 
	}


	}


