import java.util.Scanner;
import com.robot.calc.Calculator;

// INTERFACE (Abstraction)
interface SmartFeatures {
    void AIpower();
}

// ABSTRACT CLASS (Abstraction)
abstract class Robot {
    abstract void version();
}

// PARENT CLASS (Encapsulation)
class Assistant extends Robot {
    private String name; // Encapsulation (private variable)
    Scanner sc = new Scanner(System.in);

    // Constructor
    Assistant(String name) {
        this.name = name;
    }

    // Getter (Encapsulation)
    public String getName() {
        return name;
    }

    // Setter (Encapsulation)
    public void setName(String name) {
        this.name = name;
    }

    // Static method
    public static void company() {
        System.out.println("Company: OpenAI Robotics 🤖");
    }

    public void respond() {
        System.out.println("I am " + name + " (Basic Assistant)");
    }

    // Method Overloading (Polymorphism)
    public void task() {
        System.out.println("\n===== 🤖 Assistant MENU =====");
        System.out.println("1. Joke");
        System.out.println("2. Buy Pen");
        System.out.println("3. Exit");
    }

    public void task(String msg) {
        System.out.println("Message: " + msg);
    }

    public void Assistant_joke() {
        System.out.println("Basic joke 😄");
    }

    public void buyAPen() {
        System.out.print("Enter budget: ");
        int price = sc.nextInt();

        if (price < 10) {
            System.out.println("Average Pen 👍");
        } else {
            System.out.println("Premium Pen ✨");
        }
    }

    // Abstract method implementation
    @Override
    void version() {
        System.out.println("Version 1.0");
    }
}

// CHILD CLASS (Inheritance + Polymorphism)
class Chitti extends Assistant implements SmartFeatures {

    // Constructor using super
    Chitti(String name) {
        super(name);
    }

    @Override
    public void respond() {
        System.out.println("Hello sir, I am " + getName() + " (Chitti 2.0)");
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public void task() {
        System.out.println("\n===== 🤖 Chitti MENU =====");
        System.out.println("1. Greeting");
        System.out.println("2. Joke");
        System.out.println("3. Shopping");
        System.out.println("4. Exit");
    }

    public String greet() {
        return "Hello sir, how are you?";
    }

    public void joke() {
        System.out.println("Robot hu, comedian nahi 😅");
    }

    public void shopping(Scanner sc) {
        System.out.print("Enter budget: ");
        int budget = sc.nextInt();

        if (budget < 1000) {
            System.out.println("Local Market 🛒");
        } else {
            System.out.println("Luxury Shopping 👜");
        }
    }

    // Interface method
    public void AIpower() {
        System.out.println("AI Power Activated 🚀");
    }

    // Final method (cannot be overridden further)
    final void security() {
        System.out.println("Security Enabled 🔒");
    }
}

// MAIN CLASS
public class Blueprint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Static method call
        Assistant.company();

        // Upcasting (Polymorphism)
        Assistant robo;

        System.out.println("1. Assistant");
        System.out.println("2. Chitti");
        System.out.print("Choose Model:");

        int choice = sc.nextInt();

        if (choice == 1) {
            robo = new Assistant("Basic Bot");
        } else {
            robo = new Chitti("Chitti AI");
        }

        robo.respond();
        robo.version();

        int input;

        do {
            robo.task();
            input = sc.nextInt();

            if (robo instanceof Chitti) {
                Chitti c = (Chitti) robo;

                switch (input) {
                    case 1:
                        System.out.println(c.greet());
                        break;
                    case 2:
                        c.joke();
                        break;
                    case 3:
                        c.shopping(sc);
                        break;
                    case 4:
                        System.out.println("Exit 👋");
                        break;
                }

            } else {
                switch (input) {
                    case 1:
                        robo.Assistant_joke();
                        break;
                    case 2:
                        robo.buyAPen();
                        break;
                    case 3:
                        System.out.println("Exit 👋");
                        break;
                }
            }

        } while (input != 3 && input != 4);

        sc.close();
    }
}