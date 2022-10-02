import java.util.Scanner;
public class currency 
{
    public static void main(String[] args) 
    {
        boolean check = true;
        while(check)
        {
            //open scanner
            Scanner reader = new Scanner(System.in);

            //find which kind of money the user has
            System.out.println("What kind of money do you have? (Please type number)");
            System.out.println("1: United States Dollar");
            System.out.println("2: Euro");
            System.out.println("3: Pound Sterling");
            System.out.println("4: Japanese Yen");
            System.out.println("5: Canadian Dollar");

            int first = reader.nextInt();

            //find out what kind of money the user wants to transfer to
            System.out.println("What currency do you want to convert to? (Please type number)");
            System.out.println("1: United States Dollar");
            System.out.println("2: Euro");
            System.out.println("3: Pound Sterling");
            System.out.println("4: Japanese Yen");
            System.out.println("5: Canadian Dollar");

            int second = reader.nextInt();

            System.out.println("Enter Amount:");

            double amount = reader.nextDouble();

            String convert = "";

            //find out which number was pressed
            switch(first)
            {
                case 1:
                {
                    convert = Usd.usd(second, amount);
                    break;
                }
                case 2:
                {
                    convert = Euro.euro(second, amount);
                    break;
                }
                case 3:
                {
                    convert = Pound.pound(second, amount);
                    break;
                }
                case 4:
                {
                    convert = Yen.yen(second, amount);
                    break;
                }
                case 5:
                {
                    convert = Canada.canada(second, amount);
                    break;
                }
                default:
                {
                    System.out.println("Please enter a number between 1-5.");
                }
            }
            //print the conversion
            System.out.println("The conversion is: " + convert);
            System.out.println("");

            //loop to see if the user needs more conversions.
            boolean check2 = true;
            while(check2)
            {
                System.out.println("Would you like to convert anything else? (Type 1 for Yes/0 for No)");
                int again = reader.nextInt();
            
                if(again == 0)
                {
                    System.out.println("Thanks for using my calculator!");
                    reader.close();
                    check = false;
                    check2 = false;
                }
                else if(again == 1)
                {
                    check = true;
                    check2 = false;
                }
                else
                {
                    System.out.println("Please only enter a 1 or a 0.");
                }
            }
        }
    }
}
