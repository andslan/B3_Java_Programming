package day03_comments_escape_sequence;

public class Quotes {

    /*
        I like "java programming.
     */
    public static void main(String[] args) {
        System.out.println("I like \"java\" programming");
        System.out.println("\"This is a double quote\""); // "This is a double quote"
    /*
        Q: How about if I want to print the following

        The car has on/off button.
     */
    System.out.println("The car has on\\off button.");

    System.out.println("The car has on\\\\off button.");
    }
}
