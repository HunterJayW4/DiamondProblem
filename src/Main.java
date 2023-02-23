import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean running = true;

        while (running)
        {
            System.out.println("Enter an odd number:");
            String val = scan.next();
            try
            {
                int num = Integer.parseInt(val.toString());
                if (num % 2 != 1)
                {
                    System.out.println("I said an odd number, nerd.");
                    num++;
                    System.out.println("You entered: " + (num - 1) + " but i added 1 to make it odd, \n" +
                            "so the number is now: " + num);

                }
                System.out.println("Here's your beautiful diamond:");
                //below is the logic for computing a diamond out of the given number.

                //Upper part of the diamond...
                for (int i = 1; i <= num; i++)
                {
                    for (int j = 1; j <= num - i; j++)
                    {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                //Lower part of the diamond...
                for (int i = num - 1; i >= 1; i--)
                {
                    for (int j = 1; j <= num - i; j++)
                    {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
            catch (NumberFormatException e)
            {
                System.out.println("I said a number, nerd...");
            }
        }
    }
}