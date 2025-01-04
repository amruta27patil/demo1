package tryandcatch;

public class NullPoint {
public static void main(String[] args) {
	// How does the program handle 
	//a NullPointerException for a String name = null variable when accessing its length?

  String name = null;
   try {
  int length = name.length();
  System.out.println("Length:"+length);
   } catch (Exception e) {
  System.out.println("Error: String is null, cannot be access its length");
}
}
}