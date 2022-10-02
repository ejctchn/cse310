class Canada 
{
    public static String canada(int second, double amount) 
    {
        String withSym = "";
        double trans = 0;
        if(second == 1)
        {
            //USD
            trans = amount * 0.73;
            withSym = "$" + trans;
        }
        else if(second == 2)
        {
            //Euro
            trans = amount * 0.74;
            withSym = "€" + trans;
        }
        else if(second == 3)
        {
            //Pound Sterling
            trans = amount * 0.66;
            withSym = "£" + trans;
        }
        else if(second == 4)
        {
            //Japanese Yen
            trans = amount *105.45;
            withSym = "¥" + trans;
        }
        else if(second == 5)
        {
            //Canadian Dollar
            System.out.println("You entered Canadian Dollar for both current and converted currency. PLease enter two different currencies to convert them.");
        }
        else
        {
            System.out.println("You entered an invalid option. Please enter a number between 1-5.");
        }
        return withSym;
    }    
}
