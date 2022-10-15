use std::io;


fn calc(num1: f32, op: String, num2: f32) -> f32
{
    let operator = op.trim();
    let mut number = 0.0;
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
        println!("it didn't work")
    }
    return number;
}


fn main()
{
    println!("Hi! Welcome to my calculator!");
    println!("");

    let mut check = true;
    while check
    {
        println!("Please enter first number:");
        let mut n1 = String::new();
        io::stdin().read_line(&mut n1).unwrap();

        println!("Please enter operator (+,-,/,*):");
        let mut op = String::new();
        io::stdin().read_line(&mut op).unwrap();

        println!("Please enter second number:");
        let mut n2 = String::new();
        io::stdin().read_line(&mut n2).unwrap();

        let num1: f32 = n1.trim().parse().unwrap();
        let num2: f32 = n2.trim().parse().unwrap();

        let fin = calc(num1, op, num2);

        println!("Your answer is: {}", fin);

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
    println!("Thank you for using my Calculator!");
    
}
