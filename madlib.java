package madlibs;
import java.util.Scanner;
public class madlib {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);

	
	String noun1 = "?";
	String noun2 = "?";
	String noun3 = "?";
	String adj1 = "?";
	String noun4 = "?";
	String noun5 = "?";
	System.out.println("Type a Noun");
	noun1 = input.nextLine();
	System.out.println("Type a Noun");
	noun2 = input.next();
	System.out.println("Type a Noun");
	noun3 = input.next();
	System.out.println("Type a Adjective");
	adj1 = input.next();
	System.out.println("Type a Noun");
	noun4 = input.next();
	System.out.println("Type a Noun");
	noun4 = input.next();
	
	
	
	
	
	
	System.out.println("Be kind to your " + noun1 + "-footed "+ noun2);
	System.out.println("For a duck may be somebody's " + noun3);
	System.out.println("Be kind to your " + noun2 + " in " + noun5);
	System.out.println("where the weather is always " + adj1);
	System.out.println("");
	System.out.println("You may think that this is the " + noun4 );
	System.out.println("Well it is");
	}

}
