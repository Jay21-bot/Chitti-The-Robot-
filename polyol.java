import java.util.Scanner;

class Calculator
{
  // ================= ADD =================
  public int add(int a, int b)
  {
    return a + b;
  }

  public int add(int a, int b, int c)
  {
    return a + b + c;
  }

  // ================= SUBTRACT =================
  public int sub(int a, int b)
  {
    return a - b;
  }

  public int sub(int a, int b, int c)
  {
    return a - b - c;
  }

  // ================= MULTIPLY =================
  public int mul(int a, int b)
  {
    return a * b;
  }

  public int mul(int a, int b, int c)
  {
    return a * b * c;
  }

  // ================= DIVISION =================
  public double div(int a, int b)
  {
    if (b == 0)
    {
      System.out.println("Cannot divide by zero!");
      return 0;
    }
    return (double)a / b;
  }

  // ================= MODULUS =================
  public int mod(int a, int b)
  {
    return a % b;
  }

  // ================= POWER =================
  public double power(int base, int exp)
  {
    return Math.pow(base, exp);
  }
}

public class polyol
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    System.out.println("\n===== CALCULATOR MENU =====");
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.println("5. Modulus");
    System.out.println("6. Power");

    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();

    if (choice == 1 || choice == 2 || choice == 3)
    {
      System.out.print("Enter how many numbers (2 or 3): ");
      int count = sc.nextInt();

      System.out.print("Enter first number: ");
      int a = sc.nextInt();

      System.out.print("Enter second number: ");
      int b = sc.nextInt();

      if (count == 2)
      {
        if (choice == 1)
          System.out.println("Result: " + calc.add(a, b));
        else if (choice == 2)
          System.out.println("Result: " + calc.sub(a, b));
        else
          System.out.println("Result: " + calc.mul(a, b));
      }
      else
      {
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (choice == 1)
          System.out.println("Result: " + calc.add(a, b, c));
        else if (choice == 2)
          System.out.println("Result: " + calc.sub(a, b, c));
        else
          System.out.println("Result: " + calc.mul(a, b, c));
      }
    }

    else if (choice == 4)
    {
      System.out.print("Enter first number: ");
      int a = sc.nextInt();

      System.out.print("Enter second number: ");
      int b = sc.nextInt();

      System.out.println("Result: " + calc.div(a, b));
    }

    else if (choice == 5)
    {
      System.out.print("Enter first number: ");
      int a = sc.nextInt();

      System.out.print("Enter second number: ");
      int b = sc.nextInt();

      System.out.println("Result: " + calc.mod(a, b));
    }

    else if (choice == 6)
    {
      System.out.print("Enter base: ");
      int base = sc.nextInt();

      System.out.print("Enter exponent: ");
      int exp = sc.nextInt();

      System.out.println("Result: " + calc.power(base, exp));
    }

    else
    {
      System.out.println("Invalid choice!");
    }

    sc.close();
  }
}