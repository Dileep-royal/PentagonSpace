package Programming.com.patterns;

public class Patterns {
    // prints * like N*N Matrix
    static void pattern01(){
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // prints row number
    static void pattern02(){
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    // print col number
    static void pattern03(){
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    // prints numbers from 11 to 35 and each contains only 5 numbers
    static void pattern04(){
        int k=11;
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=5 ; col++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    // prints the right angle triangle
    static void pattern05(){
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // prints the right angle triangle with column numbers
    static void pattern06(){
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    // prints the right angle triangle with row numbers
    static void pattern07(){
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    static void pattern08(){
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print((char)(64+col)+" ");
            }
            System.out.println();
        }
    }

    static void pattern09(){
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print((char)(64+(row))+" ");
            }
            System.out.println();
        }
    }
    // print
    static void pattern10(){
        for (int row = 1; row <=5 ; row++) {
//            int k=row;
            for (int col = 1; col <=row ; col++) {
//                System.out.print((k++)+" ");
                System.out.print((row+col)-1+" ");
            }
            System.out.println();
        }
    }

    static void pattern11(){
        for (int row = 1; row <=5 ; row++) {
            for (int col = 0; col <row ; col++) {
//                System.out.print((row+col)%2==0? 1+" ":0+" ");
                System.out.print((row+col)%2+" ");
            }
            System.out.println();
        }
    }
    static void pattern12(){
        int n=5;
        int k=0;
        for (int row = 1; row <=n ; row++) {
            k+=row;
            int reverse=k;
            for (int col = 1; col<=row ; col++) {
                System.out.print(reverse--+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern12();
    }
}
