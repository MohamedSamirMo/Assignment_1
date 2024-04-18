import java.util.Scanner;

public class ResistorCalculator {
    public static void main(String[] args) {
        // Scanner .... Input
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter you number R1");
        double R1=scanner.nextDouble();
        System.out.println("Enter you number R2");
        double R2 = scanner.nextDouble();

        // Calculator Req
        double req=R1+R2;
        // parallel the equivalent resistance is given by the inverse of the sum of the inverses
        double ReqParallel=1/((1/R1)+(1/R2));

        // Display the results
        System.out.println("Equivalent Resistance in Series (Req): " + req);
        System.out.println("Equivalent Resistance in Parallel (Req): " + ReqParallel);


    }
}
