class Usd 
{
    public static String usd(int second, double amount)
    {
        String withSym = "";
        double trans = 0;
        if(second == 1)
        {
            System.out.println("You entered US Dollars for both current and converted currency. PLease enter two different currencies to convert them.");
        }
        else if(second == 2)
        {
            //Euro
            trans = amount * 1.02;
            withSym = "€" + trans;
        }
        else if(second == 3)
        {
            //Pound Sterling
            trans = amount * 0.9;
            withSym = "£" + trans;
        }
        else if(second == 4)
        {
            //Japanese Yen
            trans = amount * 144.33;
            withSym = "¥" + trans;
        }
        else if(second == 5)
        {
            //Canadian Dollar
            trans = amount * 1.37;
            withSym = "$" + trans;
        }
        else
        {
            System.out.println("You entered an invalid option. Please enter a number between 1-5.");
        }
        return withSym;
    }
}
