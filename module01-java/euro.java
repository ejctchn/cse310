class Euro 
{
    public static String euro(int second, double amount) 
    {
        String withSym = "";
        double trans = 0;
        if(second == 1)
        {
            //USD
            trans = amount * 0.9683;
            withSym = "$" + trans;
        }
        else if(second == 2)
        {
            System.out.println("You entered Euros for both current and converted currency. PLease enter two different currencies to convert them.");
        }
        else if(second == 3)
        {
            //Pound Sterling
            trans = amount * 0.88;
            withSym = "£" + trans;
        }
        else if(second == 4)
        {
            //Japanese Yen
            trans = amount * 141.54;
            withSym = "¥" + trans;
        }
        else if(second == 5)
        {
            //Canadian Dollar
            trans = amount * 1.34;
            withSym = "$" + trans;
        }
        else
        {
            System.out.println("You entered an invalid option. Please enter a number between 1-5.");
        }
        return withSym;
    }    
}
