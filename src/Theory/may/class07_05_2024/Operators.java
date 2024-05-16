package Theory.may.class07_05_2024;

public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators: +,-,/,%,*
        int a=10;
        int b=20;
        int c=10;
        System.out.println("a+b= "+a+b);
        System.out.println("a-b= "+(a-b));
        System.out.println("a*b= "+a*b);
        System.out.println("a/b= "+(a/b));
        System.out.println("a%b= "+(a%b));

        // Logical Operators
        System.out.println("a==c && b==c:"+(a==b && b==c));
        System.out.println("a==c && a==b:"+(a==c && a==b));
        System.out.println("a==c || a==b:"+(a==b || c==b));
        System.out.println("a==c || a==b:"+(a==c || a==b));

        // Unary Operators
        System.out.println("+a"+(+a));
        System.out.println("-a"+(-a));
        System.out.println("--a"+(--a));
        System.out.println("a--"+(a--));
        System.out.println("++a"+(++a));
        System.out.println("a++"+(a++));

        // Assignment Operators
        System.out.println("a=a+2"+(a+=2));
        System.out.println("a=a-2"+(a-=2));
        System.out.println("a=a*2"+(a*=2));
        System.out.println("a=a/2"+(a/=2));
        System.out.println("b=b%2"+(b%=2));

        // Ternary Operators
//        System.out.println(((a>b)?:));
        // shift Operators

        // Bitwise Operators
    }
}
