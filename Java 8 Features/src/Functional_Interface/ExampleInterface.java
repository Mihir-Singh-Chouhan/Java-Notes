package Functional_Interface;

@FunctionalInterface
public interface ExampleInterface {
    public void sayHello(); // yes beacuse only single asbstract method

    // public void sayBye();
    // if i uncomment this line @ gives us an error message

    // if interface is empty then we can't say it is an functional reference : run Defination

    default void sayBye(){};
    static  void sayOk(){}; // during implementation can't be overriden as static in nature

}
