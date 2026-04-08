import java.util.Scanner;

class Chitti
{
    public String greet()
    {
        return "Hello sir, how are you?";
    }

    public String joke()
    {
        return "Robot hu, comedian nahi 😅";
    }

    public void going_to_shopping(Scanner sc)
    {
        System.out.print("How much is your budget for shopping? ");
        int budget = sc.nextInt();

        if (budget <= 1000)
        {
            System.out.println("Let's go to Local Market 🛒");
        }
        else if (budget <= 30000)
        {
            System.out.println("Let's go to H&M 👕");
        }
        else if (budget <= 50000)
        {
            System.out.println("Let's go to Allen Solly 👔");
        }
        else if (budget <= 100000)
        {
            System.out.println("Let's go to Louis Vuitton 👜");
        }
        else
        {
            System.out.println("Bhai tu Ambani nikla 😎");
        }
    }

    public void show_features()
    {
        System.out.println("\nPress 1 for Greeting");
        System.out.println("Press 2 for Joke");
        System.out.println("Press 3 for Shopping");
        System.out.println("Press 4 to Exit");
    }
}

public class jarvis
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Chitti robo = new Chitti();

        int press;

        do
        {
            robo.show_features();
            System.out.print("Enter choice: ");
            press = sc.nextInt();

            switch (press)
            {
                case 1:
                    System.out.println(robo.greet());
                    break;

                case 2:
                    System.out.println(robo.joke());
                    break;

                case 3:
                    robo.going_to_shopping(sc);
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye 👋");
                    break;

                default:
                    System.out.println("Invalid choice ❌ Try again");
            }

        } while (press != 4);

        sc.close();
    }
}