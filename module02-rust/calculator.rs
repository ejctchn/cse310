use std::io;

/*
input: bring in the user input
processing: find out what operator they used,
output: return the correct calculation
*/

fn calc(num1: f32, op: String, num2: f32) -> f32
{
    //trim the newline "whitespace" off the operator
    let operator = op.trim();
    let mut number = 0.0;

    //find out what operator they used
    if operator == "+"
    {
        number = num1 + num2;
    }
    else if operator == "-"
    {
        number = num1 - num2;
    }
    else if operator == "*"
    {
        number = num1 * num2;
    }
    else if operator == "/"
    {
        number = num1 / num2;
    }
    else
    {
        //prepare for that guest that always disobeys the rules
        println!("That was not a valid operator. Please only enter +, -, *, /.")
    }
    return number;
}


fn main()
{
    // it's polite to welcome your guests
    println!("Hi! Welcome to my calculator!");
    println!("");

    let mut check = true;
    while check
    {
        //receive input
        println!("Please enter first number:");
        let mut n1 = String::new();
        io::stdin().read_line(&mut n1).unwrap();

        println!("Please enter operator (+,-,/,*):");
        let mut op = String::new();
        io::stdin().read_line(&mut op).unwrap();

        println!("Please enter second number:");
        let mut n2 = String::new();
        io::stdin().read_line(&mut n2).unwrap();

        //convert input to float values
        let num1: f32 = n1.trim().parse().unwrap();
        let num2: f32 = n2.trim().parse().unwrap();

        //call the calculation function
        let fin = calc(num1, op, num2);

        //print out the answer
        println!("Your answer is: {}", fin);

        //make sure your guests don't need anything else
        println!("Need to calculate another number? (y/n)");
        let mut again = String::new();
        io::stdin().read_line(&mut again).unwrap();

        if again.trim() == "n"
        {
            check = false;
        }
        else
        {
            continue;
        }
    }
    //just being polite :)
    println!("Thank you for using my Calculator!");
    
}
