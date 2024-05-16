package Theory.april.class23_04;

public class Cow {

    Milk eats(Jaggery j){
        Milk m = new Milk(5.7f,8.5f,2.1f,35.8f);
        return m;
    }

    public static void main(String[] args) {
        System.out.println("Cow eats Jaggery, and gives us Milk");
        Jaggery j = new Jaggery(0.5f);
        Cow c =new Cow();
        Milk m1 = c.eats(j);
        System.out.println(m1);
    }
}

class Jaggery{
    float weight;
    Jaggery(float weight){
        this.weight=weight;
    }
}

class Milk{
    float fat;
    float snf;
    float quantity;
    float price;
    Milk(float fat, float snf, float quantity,float price){
        this.fat = fat;
        this.snf = snf;
        this.quantity = quantity;
        this.price = price;
    }

   float calculatePrice(float fat, float snf, float quantity){
       System.out.println("");
       return 38.6f;
   }

    @Override
    public String toString(){
        return "Quantity: "+quantity+"\nFat: "+fat+"\nSNF: "+snf+"\nPrice: "+price;
    }
}
