import java.util.Scanner;
import java.util.Random;


public class lemonade
{
    public static void main(String[] args)
    {
        double startingMoney = 20.00;
        String enter;
        String pitcher = "Pitcher";
        double ice = 0.50;
        double cup = 0.10;
        double lemons = 1.00;
        double sugar = 0.54;
        double glass = 0.25;
        boolean buy;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int rn = random.nextInt(100);
        buy = rn < 50;
        System.out.println("CJ's Lemonade Store");
        System.out.println("Ice: $0.50 per cup");
        System.out.println("Cups: $0.10 per cup");
        System.out.println("Lemons: $1.00 per cup");
        System.out.println("Sugar: $0.54 per cup");
        System.out.println("Price per glass: $0.25 ");
        System.out.println("Price per glass: $ " + glass);
        System.out.println(buy);

    }
}