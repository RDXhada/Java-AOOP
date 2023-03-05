import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double height, width;
        System.out.print("Input height: ");
        height = input.nextDouble();
        System.out.print("Input width: ");
        width = input.nextDouble();


        Rectangle rect = new Rectangle(width, height);
        System.out.println("The width is: " + rect.getWidth());
        System.out.println("The height is: " + rect.getHeight());
        System.out.println("The default color is: " + rect.getColor());
        rect.setColor("White");
        System.out.println("Changing rectangle color to: " + rect.getColor());

        System.out.println("The area of this rectangle is: " + rect.getArea());
        System.out.println("The perimeter of this rectangle is: " + rect.getPerimeter());

        //test cases
        System.out.println("Test cases are : ");
        System.out.print(height == rect.getHeight());
        System.out.print(width == rect.getWidth());
        System.out.print("White" == rect.getColor());
        System.out.print(height * width == rect.getArea());
        System.out.print(2*(height + width) == rect.getPerimeter());

    }
}

