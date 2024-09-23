import java.util.Scanner;

public class Calculator {

    public static double square_root (double x){
        if(x < 0){
            return Double.NaN; // Invalid input
        }
        return Math.sqrt(x);
    }

    public static double factorial(Integer x){
        if(x < 0){
            return Double.NaN; // Invalid input
        }
        double fact = 1;
        for(int i = 1; i <= x; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static double natural_log(double x){
        if(x <= 0){
            return Double.NaN; // Invalid input
        }
        return Math.log(x);
    }

    public static double exponent(double x, double y){
        return Math.pow(x,y);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Please enter one of the following options: ");
            System.out.println("------------------------------------------");
            System.out.println("1. for square root");
            System.out.println("2. for factorial");
            System.out.println("3. for natural log");
            System.out.println("4. for exponent");
            System.out.println("5. to exit the menu");
            System.out.println("------------------------------------------");

            int op = sc.nextInt();

            if(op == 1){
                System.out.print("Please Enter the number to find the square root of: ");
                double num1 = sc.nextDouble();
                double result = square_root(num1);
                System.out.println("The answer is: " + result);
            }else if(op == 2){
                System.out.print("Please Enter the number to find the factorial of: ");
                Integer num1 = sc.nextInt();
                double result = factorial(num1);
                System.out.println("The answer is: " + result);
            }else if(op == 3){
                System.out.print("Please Enter the number to find the natural log of: ");
                double num1 = sc.nextDouble();
                double result = natural_log(num1);
                System.out.println("The answer is: " + result);
            }else if(op == 4){
                System.out.print("Please Enter the base: ");
                double base = sc.nextDouble();
                System.out.print("Please Enter the exponent: ");
                double exponent = sc.nextDouble();
                double result = exponent(base,exponent);
                System.out.println("The answer is: " + result);
            }else if(op == 5){
                break;
            }else{
                System.out.println("Please enter a valid option.");
            }
        }

        sc.close();

    }

}
