package tryandcatch;

public class NumeratorandDenominator {
public static void main(String[] args) {
	// Will the finally block execute if an exception occurs 
	//in a try block with variables numerator and denominator?

	int numerator = 10;
	int denominator = 0;
	
	try {
	int result = numerator/denominator;
	System.out.println("Result:"+ result);
	} catch (Exception e) {
	System.out.println("Error: cannot be devided zero.");
	}finally {
	System.out.println("Finally block executed.");
	


}
}}

