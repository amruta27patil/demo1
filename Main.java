package tryandcatch;

public class Main {
public static void main(String[] args) {
	// What happens if the divisor variable in a 10 / divisor operation is set to 0?

	 int divisor = 0;
	 try {
	 int result = 10/divisor;
	 
	 System.out.println(" Result:"+ result);
	 } catch ( Exception e){
	 System.out.println("Error: cannot be devided by zero");
}
}
}