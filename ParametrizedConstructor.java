import java.util.Scanner;;

class Dog {
    String name,color;
    
    Dog (String n,String c) {
        name = n;
        color = c;
    }
}

public class ParametrizedConstructor {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name = x.nextLine();
        System.out.print("Enter the color : ");
        String color = x.nextLine();

        Dog dog = new Dog(name,color);

        System.out.println("The name is " + dog.name);
        System.out.println("the color is " + dog.color);
    }
}
