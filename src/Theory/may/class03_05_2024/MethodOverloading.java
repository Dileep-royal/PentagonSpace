package Theory.may.class03_05_2024;

public class MethodOverloading {
    int money;
    String name;
    void get_pocket_money(String name, int money){
        System.out.println("Name: "+this.name);
        System.out.println("Pocket Money:"+this.money);
    }

    void get_pocket_money(int money,String name){
        System.out.println("Name: "+this.name);
        System.out.println("Pocket Money:"+this.money);
    }

    void get_pocket_money(String name, long money){
        System.out.println("Name: "+this.name);
        System.out.println("Pocket Money:"+this.money);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println("------ Family Information --------");
        mo.get_pocket_money("Aswini",5000);
        mo.get_pocket_money("Kushal",98765L);
        mo.get_pocket_money(9876,"Reddy Sree");
    }
}
