//Connor Johnston

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coins
{
    public static void main(String[] args)
    {
    
//Var.s
        double total, quarters, dimes, nickels, pennies;

//Input
        Scanner listen = new Scanner(System.in);
        System.out.println("How many quarters do you have?");
        quarters = listen.nextDouble();
        
        System.out.println("How many dimes do you have?");
        dimes = listen.nextDouble();
        
        System.out.println("How many nickels do you have?");
        nickels = listen.nextDouble();
        
        System.out.println("How many pennies do you have?");
        pennies = listen.nextDouble();
        
//Values
        total = total (quarters, dimes, nickels, pennies);
        DecimalFormat df = new DecimalFormat("#.00");
        
//Output
        if (total >= 1){
            System.out.println("You have $" + df.format(total));
        }
        
        else
        System.out.println("You have ¢0" + df.format(total));
    }
    
//Methods
    public static Double total(Double quarters, Double dimes, Double nickels, Double pennies){
        Double total;
        quarters = quarters * 0.25;
        dimes = dimes * 0.10;
        nickels = nickels * 0.05;
        pennies = pennies * 0.01;
        total = quarters + dimes + nickels + pennies;
        return total;
    }
}