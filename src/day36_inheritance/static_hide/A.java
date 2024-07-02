package day36_inheritance.static_hide;

public class A {


    public static void staticMethod() {
        System.out.println("Static method from the PARENT class");
        // instanceMethod();  // static accepts static only
    }

    public void instanceMethod() {
        System.out.println("instance method form PARENT class");
        staticMethod();
    }


}