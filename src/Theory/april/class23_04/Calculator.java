package Theory.april.class23_04;
// Write a Program for calculator class with two properties and methods


class Calculator{
    String brandName;
    int cost;

    @Override
    public String toString(){
        return "Calculator Name: "+brandName+"\nCost: "+cost;
    }

    Calculator(String brandName, int cost){
        this.brandName=brandName;
        this.cost = cost;
    }

    long add(long a, long b){
        return a+b;
    }

    long multiplication(long a, long b){
        return a*b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator("Casio",2000);
        System.out.println(c1);
        long additionResult = c1.add(1234432,2343);
        System.out.println("Addition :"+additionResult);
        System.out.println("Multiplication: "+c1.multiplication(additionResult,87654));
    }
}
