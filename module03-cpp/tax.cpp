#include <iostream>
#include <ctime>
#include <iomanip>
using namespace std;

float get_discount()
{
    //initialize discount amount
    float discount = 0;
    //amount of seconds since Jan 1 1970
    time_t now = time(0);
    //what year is it?
    int yr = 1970 + (now / 31536000);
    //how many days has it been?
    int days = now / 86400;
    //what day of the week is it?
    int dow = days % 7;
    char student;
    int tickets = 0;

    cout << "Deals:\n";
    cout << "On Tuesdays and Thursdays, students get a $10 discount.\n";
    cout << "Going on a date? On Fridays we offer a date deal. $5 off two admissions.\n";
    cout << endl;

    //just in case the user tries to enter something other than y/n for student.
    bool c = true;
    while(c)
    {
        switch (dow)
        {
            case 1:
                cout << "Today is Thursday\n";
                cout << "Are you a student (y/n)? ";
                cin >> student;

                //student discount
                if(student == 'y' || student == 'Y')
                {
                    discount = 10;
                    c = false;
                }
                else if(student == 'n' || student == 'N')
                {
                    discount = 0;
                    c = false;
                }
                else
                {
                    cout << "Please enter a valid option\n";
                }
                break;
            case 2:
                cout << "Today is Friday";
                cout << "How many tickets will you be purchasing? ";
                cin >> tickets;

                //friday date night discount
                if(tickets == 0)
                {
                    discount = 0;
                    c = false;
                }
                else if(tickets % 2 == 0)
                {
                    discount = 5;
                    c = false;
                }
                else
                {
                    discount = 0;
                    c = false;
                }
                break;
            case 3:
                cout << "Today is Saturday";
                discount = 0;
                c = false;
                break;
            case 4:
                cout << "Today is Sunday";
                discount = 0;
                c = false;
                break;
            case 5:
                cout << "Today is Monday";
                discount = 0;
                c = false;
                break;
            case 6:
                cout << "Today is Tuesday";
                cout << "Are you a student (y/n)? ";
                cin >> student;

                //student discount
                if(student == 'y' || student == 'Y')
                {
                    discount = 10;
                    c = false;
                }
                else if(student == 'n' || student == 'N')
                {
                    discount = 0;
                    c = false;
                }
                else
                {
                    cout << "Please enter a valid option\n";
                }
                break;
            case 0:
                cout << "Today is Wednesday";
                discount = 0;
                c = false;
                break;
            default:
                cout << "Hmmm. somethings not right";
                c = false;
                break;
        }    
    }

    return discount;
}
//get subtotal from user
float get_subtotal()
{
    float total;
    cout << endl;
    cout << "What is the subtotal?\n";
    cout << "$";
    cin >> total; 

    return total;
}
//calculate the tax
float calc(float sub)
{
    float tax = sub + (sub * 0.06);

    return tax;
}

class welcome
{
    public:
    string wel;
};

int main()
{
    welcome myobj;
    //always welome your guests
    myobj.wel = "Hello! Welcome to the Idaho Farmers Market!\n";
    cout << endl;
    cout << myobj.wel;
    cout << endl;
    
    //find any discounts that apply
    float disc = get_discount();

    //ask for the subtotal
    float sub = get_subtotal();

    //now for sales tax
    float taxtotal = calc(sub);

    //finally, give them their dicount
    float final = taxtotal - disc;

    if(final < 0)
    {
        //savvy shopper
        cout << "Your total with discounts is $0!\n";
        cout << "Look at you! Gettin' stuff for free!\n";
        cout << endl;
    }
    else
    {
        cout << endl;
        printf("Your total with discounts and sales tax is $%.2f. Enjoy!\n", final);
        cout << endl;
    }
    return 0;
}
