package Inheritance_In_Functional_Interface;

public interface Child extends Parent {
    // it is functional interface till only we do not create
    // another abstract class to check use : @FunctionalInterface

   // public void sayBye(); // this will generating error while using
                         // @FunctionalInterface as FI: only contain single Abstract method

  public void sayHello(); // correct as same method as parent

    static void sayBye(){
        System.out.println("it is functional interface till only we do not create another abstract class to check use : @FunctionalInterface");
        System.out.println("If No method in child then also it will be Functional Interface as Parent have");
        System.out.println("any number of default and static method can be used not affect functional interface");
    } // static/default can be used
}

