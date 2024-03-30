package day05_variables;

public class MyName {
    public static void main(String[] args) {


        char first = 'A';
        char second = 'n';
        char third = 'd';
        char fourth = 'r';
        char fifth = 'e';
        char sixth = 'w';

        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
        System.out.println("fourth = " + fourth);
        System.out.println("fifth = " + fifth);
        System.out.println("sixth = " + sixth);

        System.out.println();

        System.out.println(first + second + third + fourth + fifth + sixth); // int

        String name = "" + first + second + third + fourth + fifth + sixth;
        System.out.println(name);


    }
}
