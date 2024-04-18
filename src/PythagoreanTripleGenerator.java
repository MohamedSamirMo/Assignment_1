import java.util.Scanner;

public class PythagoreanTripleGenerator {
    public static void main(String[] args) {

        //Scanner ..... Input number
        Scanner scanner = new Scanner(System.in);
        // Enter You input number m
        System.out.println("Enter you number m");
        double m=scanner.nextDouble();
        // Enter You input number n
        System.out.println("Enter you number n");
        double n=scanner.nextDouble();
        // Value a
        double a=(double) (Math.pow(m,2) - Math.pow(n,2));
        //Value b
        double b=2*n*m;
        // Value c
        double c= (double) Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
        // Display the Pythagorean  values
        System.out.println("Generated Pythagorean:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }}
