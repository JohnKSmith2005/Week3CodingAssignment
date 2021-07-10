package promineoClasses;

public class Week3CodeProject {
	
	public static void main(String[] args) {
	//1.Create integer array "ages"
	int[] ages = {3,9,23,64,2,8,28,93};
	
	//Subtract value of first element from the value of the last element
	ages[ages.length-1] = ages[ages.length-1] - ages[0];
	System.out.println("The value of the last element of this array is: " + ages[ages.length-1]);

	//Add a new age element to the array "ages". This is done by creating an another array named "newAges" with space for one more element 
	//and using a for loop to copy over the contents of array "ages"
	int newAges[] = new int[ages.length+1];
	for (int i=0; i<ages.length; i++) {
		newAges[i] = ages[i];
	}
	
	//In this example, 32 will be the age element added to the end of the array. The new array should be [3,9,23,64,2,8,28,93,32] at this point.
	newAges[newAges.length-1] = 32;
	
	//Repeating subtraction with new array to ensure it still works.Subtraction will take first element (3) and subtract this from (32) to create (29)
	newAges[newAges.length-1] = newAges[newAges.length-1] - newAges[0];
	System.out.println("The value of the last element of this array after adding another element is: " + newAges[newAges.length-1]);
	
	//Loop through array and calculate the average age and print the result
	int totalAge = 0;
	for (int i=0; i<newAges.length; i++) {
		totalAge = newAges[i] + totalAge;
	}
	System.out.println();
	System.out.println("Total Age is: " + totalAge);
	System.out.println("Number of elements is: " + newAges.length);
	System.out.println("The integer value of the average age of all ages in this array is: " + (totalAge / newAges.length));
	//actual average is closer to 28.4444, but system is set to display integers.
	
	
	//2.Create string array "names"
	String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
	
	//Loop to iterate the array and calculate the average number of letters per name.
	int letterTotal = 0;
	for (int i=0; i<names.length; i++) {
		letterTotal = names[i].length() + letterTotal;
	}
	
	//print the result
	System.out.println();
	System.out.println("The integer value of the average number of letters in all names is: " + (letterTotal / names.length));
	//actual average is closer to 3.83333, but system is set to display integers.
	
	//Loop to iterate and concatenate all names together, separated by spaces.
	String allNamesConcatenated = "";
	for (int i=0; i<names.length; i++) {
		allNamesConcatenated = names[i] + " " + allNamesConcatenated;
	}
	
	//Print the result
	System.out.println("All names concatenated: " + (allNamesConcatenated));
	
	//3. How do you access the last element of any array?
	// The last element of an array can be accessed with "arrayName[arrayName.length-1]". Because arrays are coded starting with 0, it is necessary to take the length total minus one.
	
	//4. How do you access the first element of any array?
	// The first element of an array can be accessed with "arrayName[0], this is because arrays are coded so the first position is "0".
	
	//5. Create integer array nameLengths 
	int nameLengths[] = new int[names.length];
	
	//Loop over array names to add the length of each name to the nameLengths array.
	for (int i=0; i<names.length; i++) {
		nameLengths[i] = names[i].length();
	}
	
	//6. Write a loop to iterate over the array "nameLengths" and calculate the sum of all elements.
	int nameLengthsTotal = 0;
	for (int i=0; i<names.length; i++) {
		nameLengthsTotal = nameLengths[i] + nameLengthsTotal;
	}
	
	//Print the result
	System.out.println();
	System.out.println("The sum of all elements in the array \"nameLengths\" is: " + nameLengthsTotal);
	
	
	
	//This section is used to test the method written in step 7.

	System.out.println();
	System.out.println("Method Step 7 test:");
	
	String testString = "test";
	String resultString = concatenateWord(testString,1);
	
	System.out.println("Inputs: test, 1");
	System.out.println("Result: " + resultString);
	testString = "JohnSmith";
	
	resultString = concatenateWord(testString,5);
	System.out.println("Inputs: JohnSmith, 5");
	System.out.println("Result: " + resultString);
	
	testString = "supercalifragilisticexpialidocious";
	resultString = concatenateWord(testString,2);
	
	System.out.println("Inputs: supercalifragilisticexpialidocious , 2");
	System.out.println("Result: " + resultString);
	
	//This section is used to test the method written in step 8.
	
	System.out.println();
	System.out.println("Method Step 8 test:");
	
	String testString1 = "John";
	String testString2 = "Smith";
	resultString = concatenateWord(testString1,testString2);
	System.out.println("Inputs: John, Smith");
	System.out.println("Result: " + resultString);
	
	testString1 = "Sam";
	testString2 = "Baker";
	resultString = concatenateWord(testString1,testString2);
	System.out.println("Inputs: Sam, Baker");
	System.out.println("Result: " + resultString);
	
	testString1 = "Matt";
	testString2 = "Jefferson";
	resultString = concatenateWord(testString1,testString2);
	System.out.println("Inputs: Matt, Jefferson");
	System.out.println("Result: " + resultString);
	
	//This section is used to test the method written in step 9.
	
	System.out.println();
	System.out.println("Method Step 9 test:");
	
	int arrayTest[] = {2,2,2,2,2,2,2,2,2};
	boolean checkResult = checkIfGreaterThan100(arrayTest);
	System.out.println("Input: [2,2,2,2,2,2,2,2,2]");
	System.out.println("Result: " + checkResult);
	
	int arrayTest2[] = {0,50,50,75,100};
	checkResult = checkIfGreaterThan100(arrayTest2);
	System.out.println("Input: [0,50,50,75,100]");
	System.out.println("Result: " + checkResult);
	
	int arrayTest3[] = {25,25,25,25};
	checkResult = checkIfGreaterThan100(arrayTest3);
	System.out.println("Input: [25,25,25,25]");
	System.out.println("Result: " + checkResult);
	
	//This section is used to test the method written in step 10.
	System.out.println();
	System.out.println("Method Step 10 test:");
	double doubleArrayTest1[] = {13,25,22};
	double averageResult = findAverage(doubleArrayTest1);
	System.out.println("Input:[13, 25, 22]");
	System.out.println("Result: " + averageResult);
	
	double doubleArrayTest2[] = {100, 100, 100};
	averageResult = findAverage(doubleArrayTest2);
	System.out.println("Input:[100, 100, 100]");
	System.out.println("Result: " + averageResult);
	
	double doubleArrayTest3[] = {12342343, 8947582, 1};
	averageResult = findAverage(doubleArrayTest3);
	System.out.println("Input:[12342343, 8947582, 1]");
	System.out.println("Result: " + averageResult);
	
	//This section is used to test the method written in step 11.
	
	System.out.println();
	System.out.println("Method Step 11 test:");
	
	double compareArrayTestA[] = {1,2,3,4};
	double compareArrayTestB[] = {5,6,7,8};
	boolean compareArrayTest = checkArraysIfGreater(compareArrayTestA, compareArrayTestB);
	System.out.println("Input Array A:[1,2,3,4]");
	System.out.println("Input Array B:[5,6,7,8]");
	System.out.println("Result: " + compareArrayTest);
	
	compareArrayTest = checkArraysIfGreater(compareArrayTestB, compareArrayTestA);
	System.out.println("Input Array A:[1,2,3,4]");
	System.out.println("Input Array B:[5,6,7,8]");
	System.out.println("Result: " + compareArrayTest);
	
	//This section is used to test the method written in step 12.
	
	System.out.println();
	System.out.println("Method Step 12 test:");
	
	boolean drinkResult = willBuyDrink (true, 9.5);
	System.out.println("Input: true, 9.5");
	System.out.println("Result: " + drinkResult);
	
	drinkResult = willBuyDrink (false, 11.5);
	System.out.println("Input: false, 11.5");
	System.out.println("Result: " + drinkResult);
	
	drinkResult = willBuyDrink (true, 11.5);
	System.out.println("Input: true, 11.5");
	System.out.println("Result: " + drinkResult);
	
	//This section is used to test the method written in step 13. This will list all prime numbers from 1 to 100.
	
	System.out.println();
	System.out.println("Method Step 13 test:");
	String primeNumbers = "";
	String notPrimeNumbers = "";
	
	for (int i=1; i<=100; i++) {
		if (primeChecker(i) == true) {
			primeNumbers = primeNumbers + i + ",";
		} else {
			notPrimeNumbers = notPrimeNumbers + i + ",";
		}
	}
		primeNumbers = primeNumbers.substring(0,primeNumbers.length() - 1);
		notPrimeNumbers = notPrimeNumbers.substring(0,primeNumbers.length() - 1);
		System.out.println("Input: Numbers from 1 to 100");
		System.out.println("Numbers that are prime are: " + primeNumbers);
		System.out.println("Numbers that are not prime are: " + notPrimeNumbers);
	
	
}
	
	//7. Write a method that takes a String, word, and an integer, n, as arguments and returns the word concatenated to itself n number of times. 
	static String concatenateWord (String word, int n) {
	String concatenateResult = "";
	for (int i=0; i<n; i++) {
		concatenateResult = concatenateResult + word;
	}
	return concatenateResult;
		}
	
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space). 
	static String concatenateWord (String firstName, String lastName) {
		String fullNameResult = (firstName + " " + lastName);
		return fullNameResult;
	}
	
	//9. Write a method that takes an array of integer and returns true if the sum of all the integers in the array is greater than 100.
	static boolean checkIfGreaterThan100 (int[] arrayToCheck) {
		int arrayTotal = 0;
		for (int i=0; i<arrayToCheck.length; i++) {
			arrayTotal = arrayTotal + arrayToCheck[i];
		}
		if (arrayTotal > 100) {
			return true;
		} else {
			return false;
		}
	}
		
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	static double findAverage (double[] arrayToAverage) {
		double arrayTotal = 0;
		for (int i=0; i<arrayToAverage.length; i++) {
			arrayTotal = arrayTotal + arrayToAverage[i];
		}
		double arrayAverageResult = arrayTotal / arrayToAverage.length;
		return arrayAverageResult;
	}
	
	//11.Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	static boolean checkArraysIfGreater (double[] firstArray, double[] secondArray) {
		//Method from step 10 is used here to find averages.
		double firstArrayAverage = findAverage(firstArray);
		double secondArrayAverage = findAverage(secondArray);
		if (firstArrayAverage > secondArrayAverage) {
			return true;
		} else {
			return false;
		}	
		}
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	// This method is called primeChecker, which is used to check if an integer number is prime. This will return true if a given integer is prime, and false if the given integer is not. 
	//"1" is a corner case and the method addresses that.
	static boolean primeChecker (int numberToCheck) {
		if (numberToCheck <= 1)
return false;
		
for (int i = 2; i < numberToCheck; i++)
	if (numberToCheck % i ==0) {
		return false;
	}
	return true;

}
}