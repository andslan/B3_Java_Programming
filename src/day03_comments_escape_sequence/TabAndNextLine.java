package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {
        // Examples of TAB
        System.out.println("This is a sentence");
        System.out.println(" This is a sentence");
        System.out.println("  This is a sentence");
        System.out.println("   This is a sentence");
        System.out.println("    This is a sentence");

        System.out.println("\tThis is a sentence"); // 1 tab is equal to 4 spaces

        // Let's put two TABS
        System.out.println("\t\tThis is a sentence"); // 1 tab is equal to 4 spaces

        System.out.println();

        //Examples of NEW LINE
        System.out.println("1) Go to store");
        System.out.println("2) Grab bread");
        System.out.println("3) Pay cashier");

        System.out.println();

        System.out.println("1) Go to store \n2) Grab bread \n3) Pay cashier");

        System.out.println("Week \n\tMonday \n\tTuesday \n\tWednesday \n\tThursday \n\tSaturday \n\tSunday");
    }
}
