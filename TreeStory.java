import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
       	console.printf("Thanks for using my first madlib using Java.\n");
       	String ageAsString = console.readLine("How old are you? ");
       	// turning a String into an int
       	int age = Integer.parseInt(ageAsString);

       	
       	// If statements
       	if( age < 13) {
       		// Insert exit code
       		console.printf("Sorry, you must be 13 to play this game.\n");
       		// exit the system without errors
       		System.exit(0);
       	}

           // __name__ is a __adjective___ __noun__.  They are always __adverb__ __verb__.
        

        String name = console.readLine("Enter your name: ");
        String adjective = console.readLine("Enter an adjective: ");
        String noun = console.readLine("Please enter a noun:  ");
        //the teacher doesn't want to be called a dork or Jerk
        if (noun.equalsIgnoreCase("dork") ||
        	noun.equalsIgnoreCase("jerk")){
        		console.printf("That word is not allowed. Existing\n");
        		System.exit(0);
        }
        String adverb = console.readLine("Almost there, Just one adverb:  ");
        String verb = console.readLine("Last one, Just one verb:  ");

        console.printf("%s is a %s %s.  They are always %s %s. \n", name, adjective, noun, adverb, verb);
    }
    
}

