import java.util.Scanner;;

public class AreaCalculator {

    public static void main(String[] args) {
       
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the width of the Rectangle: ");
        float width = x.nextFloat();
        System.out.print("Enter the height of the Rectangle: ");
        float height = x.nextFloat();
        float rectangleArea = width * height;
        System.out.println("The area of rectangle is : " + rectangleArea);

        System.out.print("Enter the radius of the Circle: ");
        double radius = x.nextFloat();
        double circleArea = 3.14 * radius * radius;
        System.out.println("The area of circle is : " + circleArea);
        
        System.out.print("Enter the base of the Triangle: ");
        float base = x.nextFloat();
        System.out.print("Enter the height of the Triangle: ");
        float tHeight = x.nextFloat();
        float triangleHeight = (base * tHeight)/2;
        System.out.println("The area of Triangle is : " + triangleHeight);
    }
    
}