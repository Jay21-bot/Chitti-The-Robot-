import java.util.Scanner;

class Robot   {

  public void joke()
  {
    System.out.println("Ek Tha Raja ek thi rani dono mar gaye khatam kahani");
  }

  public String BuyAPen(int price)
  {
        if (price <= 4)
          {
            System.out.println("abe thoda to budgret bada le ladle");
          }
        else 
          {
              System.out.println("ye lo ji aapka" + price + "rs ka pain ");
          }
        return "Aalsi Kahi ke";
  }
}



public class commander {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    Robot robo = new Robot();
    robo joke();


    

}

  
}
