import java.util.Scanner;

class Calculator 
{

    public int add(int n1, int n2) {
        System.out.println("Numbers are: " + n1 + " and " + n2);
        int r = n1 + n2;
        return r;
    }
}

public class main {

    public static void main (String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int result = calc.add(num1, num2);

        System.out.println("Result = " + result);

        sc.close();
    }
}