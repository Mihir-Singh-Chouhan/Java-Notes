package LambdaExpression;

public class Main {
    public static void main(String[] args) {
       Employee obj = new Person(); // Persion obj = new Person(); also correct
                                    // instead of this we can create lambda expression
                                    //System.out.println(obj.getName());  no more need to Person Class

        //Here Employee is Functional interface which acts as data-type for lambdaExpression:

        Employee object = () -> {
            return "SE: Mihir Singh Chouhan";
        };

        // as single statement inside lambda expression then we can remove {}
        System.out.println(object.getName());

        Employee editor =()-> "Editor";
        System.out.println(editor.getName());

        Employee designer =()-> "Designer";
        System.out.println(designer.getName());
    }
}