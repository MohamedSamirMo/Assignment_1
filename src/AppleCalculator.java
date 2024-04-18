import java.util.Scanner;

public class AppleCalculator {
    public static void main(String[] args) {

        //Write a java program that for a given number of apples, tells the user how many dozens
        //of apples(s) he has and how many extra apples are left over.
        //For Example: if the number of apples = 40, the output should be: 3 dozens and 4 apples
        // Scanner .... Input any number or String
        Scanner scanner=new Scanner(System.in);
        // message Enter Number
        System.out.println("Enter You number Apple= ");
        int numberOfApple=scanner.nextInt();
        // Calculator How many Dozens Apple
        int dozens=numberOfApple/12;
        // Calculator Remain Apple
        int remainOfApple=numberOfApple%12;
        //result
        System.out.println("Number of dozens Apple=\n"+dozens+"\nRemain Of apple=\n"+remainOfApple);
    }
}