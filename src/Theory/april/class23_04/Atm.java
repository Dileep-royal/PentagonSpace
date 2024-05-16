package Theory.april.class23_04;

import java.util.Scanner;

public class Atm {

    Money dispense(int amount){
        Money m = new Money(amount);
        return m;
    }

    boolean isValidate(int pin){
        return pin==4332;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm a = new Atm();
        if(a.isValidate(4332)){
            System.out.println("Enter the amount: ");
            int amount = sc.nextInt();
            a.dispense(amount);
        }
        else System.out.println(" Invalid pin");
    }
}

class Money{
    int amount;
    Money(int amount){
        this.amount = amount;
    }
}
