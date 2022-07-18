package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main (String[] args){
        String alice = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search: ");
        String searchTerm = input.nextLine().toLowerCase();

        Boolean trueOrFalse = alice.toLowerCase().contains(searchTerm);
        System.out.println(trueOrFalse);

        Integer index = alice.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appear at index " + index + ". Your term is " + length + " characters long. ");
        String modifiedSentence = alice.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}
