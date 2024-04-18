import java.util.Scanner;

public class CountCoins {
    public static void main(String[] args) {
        // Scanner ....... input
        Scanner scanner=new Scanner(System.in);
        // Enter you value quarters
        System.out.println("Enter you quarters");
        int quarters=scanner.nextInt();
        // Enter you value dimes
        System.out.println("Enter you quarters");
        int dimes=scanner.nextInt();
        // Enter you value nickel
        System.out.println("Enter you quarters");
        int nickel=scanner.nextInt();
        // Enter you value cents
        System.out.println("Enter you quarters");
        int cents=scanner.nextInt();
        // Calculator Total Cent
        int TotalCountCent=(quarters*25)+(dimes*10)+(nickel*5)+cents;
        // Calculator Total Dollar
        double TotalDollar =TotalCountCent/100.0;
        // Display the results
        System.out.println("TotalCent ="+TotalCountCent);
        System.out.println("TotalDollar ="+TotalDollar+"$");



    }
}
