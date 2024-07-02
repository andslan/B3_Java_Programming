package day36_inheritance.final_examples;

public class FinalExample {

    // STATIC VARIABLE
    public static final String PLANET = "Earth"; // if variable is "static final" - it is also called CONSTANT variable
    //INSTANCE VARIABLES
    // final int z; // if variable is "final" it MUST have initial value. Either directly assigned or through constructor
    final int a = 5;
    final int b; //Here, the reason it does not complain is because it is initialized through constructor

    // You can also initialize the "public static final String PLANET" in the static block instead of on declaration.
    //static {
    //    PLANET = "Earth";
    //}

    // Other CONSTANT VARIABLE samples
    //Math.PI;
    //Integer.MAX_VALUE;

    public FinalExample(int b) {
        this.b = b;
    }

}