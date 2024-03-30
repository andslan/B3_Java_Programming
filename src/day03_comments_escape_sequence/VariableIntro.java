package day03_comments_escape_sequence;

import java.sql.SQLOutput;

public class VariableIntro {
    public static void main(String[] args) {

        // OPTION 1
        int quantity1;      // This is just VARIABLE DECLARATION
        quantity1 = 4;      // This is just ASSIGNING VALUE/DATA into VARIABLE
        System.out.println(quantity1);
        System.out.println(4);
        quantity1 = 5;      // This is just a REASSIGNMENT - I assigned another value to my container

        //OPTION 2
        int quantity2 = 3;  // This is just DECLARING VARIABLE and at the same time ASSIGNING VALUE/DATA

        System.out.println(quantity2);
        System.out.println(3);

        byte n1 = 4;
        short n2 = 4;
        int n3 = 4;
        long n4 = 34;
        System.out.println(n2);
        System.out.println(4);

        float d1 = 3.4f;
        double d2 = 3.4;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(4.5);

        char letter = 'a';
        System.out.println(letter);
        String letter2 = "a";

        boolean var1 = true;
        System.out.println(var1);
        boolean var2 = false;
        System.out.println(var2);

        // Sample 3
        String word = "Anything"; // Here, I declared
        System.out.println("Anything");
        System.out.println(word);

    }
}
