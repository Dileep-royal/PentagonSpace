package Theory.april.class23_04;
import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

       // Numeric type

        // Integer data type input taking methods
        byte verySmall=input.nextByte();
        short small=input.nextShort();
        int number=input.nextInt();
        long largeNumber=input.nextLong();

        // Floating-point data type input taking methods
        float decimal=input.nextFloat();
        double longDecimal=input.nextDouble();

        // Char data type input taking methods
        //  char character=input.next();
       String string= input.nextLine();
       //Boolean type
        boolean age18=input.nextBoolean();

// nextBigDecimal and nextBigInteger methods
    }
}
