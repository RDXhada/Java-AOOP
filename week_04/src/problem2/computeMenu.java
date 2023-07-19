package problem2;

import java.util.Scanner;

public class computeMenu {
    private double x;
    //general purpose constructor

    private Scanner scan;
    public computeMenu(double x)
    {
        setX(x);
        scan = new Scanner(System.in);
    }
    //default constructor
    public computeMenu()
    {
        setX(0);
    }
    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x = (x < Double.MAX_VALUE && x > Double.MIN_VALUE) ? x : 0;
    }
    public static void displayMenu()
    {
        for (int i = 0; i < 20; i++)
        System.out.println( );
        var menuText = """
            1. Update the floating point number
            2. Compute and display exp(x)
            3. Compute and display sin(x)
            4. Compute and display floor(x)
            5. Exit""";
        System.out.println(menuText);
    }

    public void doSelection(int choice)
    {
        switch (choice)
        {
            case 1: method1();
                break;
            case 2: method2();
                break;
            case 3 : method3();
                break;
            case 4: method4();
                break;
            default:
                if (choice == 5)
                {
                    doExit();
                }
                else
                {
                    invalidChoice();
                }
                break;
        }
        System.out.println("Press any key to continue..");
        scan.nextLine();
        scan.nextLine();
    }

    public void method1()
    {
        System.out.println("Enter x : ");
        x = scan.nextDouble();
        setX(x);
    }

    public void method2()
    {
        System.out.printf("Exp(%.4f) = %.4f",x, Math.exp(x));
        x = scan.nextDouble();
    }

    public void method3()
    {
        System.out.printf("The sin is ",x, Math.sin(x));
    }
    public void method4()
    {
        System.out.printf("The floor is",x, Math.floor(x));
    }

    public void doExit()
    {
        System.out.println("Quite the program...");
        scan.nextLine();
        scan.nextLine();
        System.exit(0);
    }
    public void invalidChoice()
    {
        System.out.println("Invalid choice...");
        scan.nextLine();
        scan.nextLine();
    }

    public void getUserChoice()
    {
        int choice;
        do {
            displayMenu();
            System.out.print("Select option : ");
            choice = scan.nextInt();
            doSelection(choice);
        } while (true);
    }
    public static void main(String[] args)
    {
        computeMenu computeByMenu = new computeMenu();
        computeMenu.displayMenu();
        computeByMenu.getUserChoice();
    }

}