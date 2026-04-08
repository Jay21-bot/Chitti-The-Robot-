import java.util.Scanner;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

// Parent class
class Assistant 
{
    Scanner sc = new Scanner(System.in);

    public void respond() 
    {
        System.out.println("I am a basic assistant \nI can do basic tasks");
    }

    public void task() 
    {
        System.out.println("\n===== 🤖 Assistant MENU =====");
        System.out.println("1. Hear a Assistant Joke");
        System.out.println("2. Buy a Pen");
        System.out.println("3. Ask AI (Gemini)");
        System.out.println("4. Exit\n");
        System.out.print("Enter your choice: ");
    }

    public void Assistant_joke() 
    {
        System.out.println("Ek tha raja, ek thi rani... dono mar gaye 😄");
    }

    public void buyAPen() 
    {
        System.out.print("Enter your budget for pen: ");
        int price = sc.nextInt();

        if (price < 5)
            System.out.println("Increase your budget 😆");
        else if (price < 10)
            System.out.println("Average pen 👍");
        else
            System.out.println("Premium pen worth " + price + " rs ✨");
    }


public void askGemini(String userInput)
{
    try
    {
        String apiKey = "enter API KEY";

        String endpoint = "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + apiKey;

        URL url = new URL(endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        // JSON Request Body
        String jsonInput = "{\n" +
                "  \"contents\": [\n" +
                "    {\n" +
                "      \"parts\": [\n" +
                "        {\"text\": \"" + userInput + "\"}\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        OutputStream os = conn.getOutputStream();
        os.write(jsonInput.getBytes());
        os.flush();
        os.close();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
        );

        String output;
        while ((output = br.readLine()) != null)
        {
            System.out.println(output); // raw response
        }

        conn.disconnect();
    }
    catch (Exception e)
    {
        System.out.println("Error: " + e.getMessage());
    }
    }
}

// Child class
class Chitti extends Assistant 
{
    @Override
    public void respond() 
    {
        System.out.println("Hello sir, I am Chitti 2.0 🤖");
    }

    public String greet()
    {
        return "Hello sir, how are you?";
    }

    @Override
    public void task() 
    {
        System.out.println("\n===== 🤖 Chitti MENU =====");
        System.out.println("1. Greeting");
        System.out.println("2. Hear a Joke");
        System.out.println("3. Go to Shopping");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public void Chitti_joke()
    {
        System.out.println("Robot hu, comedian nahi 😅");
    }

    public void going_to_shopping(Scanner sc)
    {
        System.out.print("Enter budget: ");
        int budget = sc.nextInt();

        if (budget <= 1000)
            System.out.println("Local Market 🛒");
        else if (budget <= 30000)
            System.out.println("H&M 👕");
        else if (budget <= 50000)
            System.out.println("Allen Solly 👔");
        else
            System.out.println("Luxury Store 👜");
    }
}

// ================= NEW CLASS =================
class chitti3 extends Chitti
{
    // ===== Calculator Methods (Method Overloading) =====
    public int add(int a, int b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }

    public int sub(int a, int b) { return a - b; }
    public int sub(int a, int b, int c) { return a - b - c; }

    public int mul(int a, int b) { return a * b; }
    public int mul(int a, int b, int c) { return a * b * c; }

    public double div(int a, int b)
    {
        if (b == 0)
        {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double)a / b;
    }

    public int mod(int a, int b)
    {
        return a % b;
    }

    public double power(int base, int exp)
    {
        return Math.pow(base, exp);
    }

    // ===== Override Menu =====
    @Override
    public void task()
    {
        System.out.println("\n===== 🤖 Chitti 3.0 MENU =====");
        System.out.println("1. Greeting");
        System.out.println("2. Joke");
        System.out.println("3. Shopping");
        System.out.println("4. Calculator 🧮");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // ===== FULL CALCULATOR FEATURE =====
    public void calculatorFeature(Scanner sc)
    {
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
                    System.out.println("Result: " + add(a, b));
                else if (choice == 2)
                    System.out.println("Result: " + sub(a, b));
                else
                    System.out.println("Result: " + mul(a, b));
            }
            else
            {
                System.out.print("Enter third number: ");
                int c = sc.nextInt();

                if (choice == 1)
                    System.out.println("Result: " + add(a, b, c));
                else if (choice == 2)
                    System.out.println("Result: " + sub(a, b, c));
                else
                    System.out.println("Result: " + mul(a, b, c));
            }
        }
        else if (choice == 4)
        {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Result: " + div(a, b));
        }
        else if (choice == 5)
        {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Result: " + mod(a, b));
        }
        else if (choice == 6)
        {
            System.out.print("Enter base: ");
            int base = sc.nextInt();

            System.out.print("Enter exponent: ");
            int exp = sc.nextInt();

            System.out.println("Result: " + power(base, exp));
        }
        else
        {
            System.out.println("Invalid choice!");
        }
    }
}

// ================= MAIN =================
public class commander 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Assistant:");
        System.out.println("1. Basic Assistant");
        System.out.println("2. Chitti 2.0");
        System.out.println("3. Chitti 3.0 (With Calculator)");

        int choice = sc.nextInt();

        // ================= BASIC ASSISTANT =================
        if (choice == 1)
        {
            Assistant robo1 = new Assistant();
            int press;

            do
            {
                robo1.task();
                press = sc.nextInt();

                switch (press)
                {
                    case 1:
                        robo1.Assistant_joke();
                        break;

                    case 2:
                        robo1.buyAPen();
                        break;

                    case 3:
                        System.out.print("Ask something: ");
                        sc.nextLine(); // clear buffer
                        String query = sc.nextLine();
                        robo1.askGemini(query);
                        break;

                    case 4:
                        System.out.println("Goodbye 👋");
                        break;

                    default:
                        System.out.println("Invalid choice ❌");
                }

            } while (press != 4);
        }

        // ================= CHITTI 2.0 =================
        else if (choice == 2)
        {
            Chitti robo2 = new Chitti();
            int press;

            do
            {
                robo2.task();
                press = sc.nextInt();

                switch (press)
                {
                    case 1:
                        System.out.println(robo2.greet());
                        break;

                    case 2:
                        robo2.Chitti_joke();
                        break;

                    case 3:
                        robo2.going_to_shopping(sc);
                        break;

                    case 4:
                        System.out.println("Goodbye 👋");
                        break;

                    default:
                        System.out.println("Invalid choice ❌");
                }

            } while (press != 4);
        }

        // ================= CHITTI 3.0 =================
        else if (choice == 3)
        {
            chitti3 robo3 = new chitti3();
            int press;

            do
            {
                robo3.task();
                press = sc.nextInt();

                switch (press)
                {
                    case 1:
                        System.out.println(robo3.greet());
                        break;

                    case 2:
                        robo3.Chitti_joke();
                        break;

                    case 3:
                        robo3.going_to_shopping(sc);
                        break;

                    case 4:
                        robo3.calculatorFeature(sc);
                        break;

                    case 5:
                        System.out.println("Goodbye 👋");
                        break;

                    default:
                        System.out.println("Invalid choice ❌");
                }

            } while (press != 5);
        }

        else
        {
            System.out.println("Invalid model choice ❌");
        }

        sc.close();
    }
}