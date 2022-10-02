
class Yen 
{
    public static String yen(int second, double amount) 
    {
        String withSym = "";
        double trans = 0;
        if(second == 1)
        {
            //USD
            trans = amount * 0.0069;
            withSym = "$" + trans;
        }
        else if(second == 2)
        {
            //Euro
            trans = amount * 0.0071;
            withSym = "€" + trans;
        }
        else if(second == 3)
        {
            //Pound Sterling
            trans = amount * 0.0063;
            withSym = "£" + trans;
        }
        else if(second == 4)
        {
            //Japanese Yen
            System.out.println("You entered Yen for both current and converted currency. PLease enter two different currencies to convert them.");
        }
        else if(second == 5)
        {
            //Canadian Dollar
            trans = amount * 0.0095;
            withSym = "$" + trans;
        }
        else
        {
            System.out.println("You entered an invalid option. Please enter a number between 1-5.");
        }
        return withSym;
    }    
}
