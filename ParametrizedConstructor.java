class Dog {
    String name,color;
    
    Dog (String n,String c) {
        name = n;
        color = c;
    }
}

public class ParametrizedConstructor {
    public static void main(String[] args) {
        Dog dog = new Dog("Boby","Black");
        System.out.println(dog.name);
        System.out.println(dog.color);
    }
}
