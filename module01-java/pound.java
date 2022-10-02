class Pound 
{
    public static String pound(int second, double amount) 
    {
        String withSym = "";
        double trans = 0;
        if(second == 1)
        {
            //USD
            trans = amount * 1.11;
            withSym = "$" + trans;
        }
        else if(second == 2)
        {
            //Euro
            trans = amount * 1.13;
            withSym = "€" + trans;
        }
        else if(second == 3)
        {
            System.out.println("You entered Pounds for both current and converted currency. PLease enter two different currencies to convert them.");
        }
        else if(second == 4)
        {
            //Japanese Yen
            trans = amount * 160;
            withSym = "¥" + trans;
        }
        else if(second == 5)
        {
            //Canadian Dollar
            trans = amount * 1.52;
            withSym = "$" + trans;
        }
        else
        {
            System.out.println("You entered an invalid option. Please enter a number between 1-5.");
        }
        return withSym;
    }    
}
