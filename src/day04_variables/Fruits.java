package day04_variables;

import java.sql.SQLOutput;

public class Fruits {
    public static void main(String[] args) {

        int apples = 70;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have: " + 70);       // the value 70 is HARDCODED
        System.out.println("This is how many apples we have: " + apples);   // the value of apple is dynamically used
        System.out.println("Grapes: " +     grapes);
        System.out.println("Bananas: " +    bananas);

        // REASSIGNMENT
        System.out.println("Sold out some of apples");
        apples = 29;
        System.out.println("Apples after selling: " + apples);

        int price = 10;
        System.out.println("The price of my 30 apples is $20"); // IT IS HARDCODED
        System.out.println("The price of my " + apples + " apples is $" + price);


        System.out.println();
        System.out.println();
        System.out.println(50 + 50);
        // NOTE: Anything after FIRST String is CONCATENATION
        System.out.println("50" + 50 + 50);



    }
}
