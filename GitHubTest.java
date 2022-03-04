import java.util.Scanner;
public class GitHubTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers to add (1) or subtract (2): ");
        int choice = input.nextInt();
        if (choice == 1)
        {
            System.out.println("Enter numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 + num2;
            System.out.println("The result is: " + result);
        }
        else if (choice == 2)
        {
            System.out.println("Enter numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 - num2;
            System.out.println("The result is: " + result);
        }
        else
        {
            System.out.println("Error");
        }
    }
}
