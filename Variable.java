package tryandcatch;

public class Variable {
public static void main(String[] args) {
	// What will happen if the index variable is set to 5 
	//while accessing an array with three elements?

  int[] myNumbers = {1,2,3};
  try {
  System.out.println(myNumbers[5]);
  }catch (Exception e) {
  System.out.println("Something went wrong.");
}
}
}
