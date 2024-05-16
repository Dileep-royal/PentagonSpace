package Theory.projects.Flipkart;

public class Flipkart {
    String prodName;
    long prodPrice;
    long prodQty;
    static long totalAmount;
    static long noOfProducts;
    static long totalItems;

    Flipkart(String prodName, long prodPrice, long prodQty){
        this.prodName=prodName;
        this.prodPrice=prodPrice;
        this.prodQty=prodQty;
    }

    static void makePayment(){
        System.out.println("--------- Payment Details--------");
        System.out.println("Total Amount:"+totalAmount);
        System.out.println("Payment done successfully..!");
    }

    void addToCart(){
        totalAmount += this.prodPrice*this.prodQty;
        totalItems+=this.prodQty;
        noOfProducts++;
        System.out.println("-------- Product-"+Flipkart.noOfProducts+" -------");
    }
}

class Cloth extends Flipkart{
    String color;
    String clothType;
    String size;

    // constructor
    Cloth(String prodName, long prodPrice,long prodQty, String color, String clothType, String size){
        super(prodName,prodPrice,prodQty);
        this.clothType=clothType;
        this.color=color;
        this.size=size;
    }

    @Override
    public String toString(){
        return "Product Name:"+prodName+"\nProduct Price: "+prodPrice+"\nColor: "+color+"\nSize: "+size+"\nQuantity: "+prodQty;
    }

    @Override
    void addToCart() {
        super.addToCart();
        System.out.println(this);
    }
}

class Book extends Flipkart{
    String title;
    String author;
    Book(String prodName, long prodPrice, long prodQty, String title, String author){
        super(prodName,prodPrice,prodQty);
        this.title=title;
        this.author=author;
    }
    @Override
    public String toString(){
        return "Product Name:"+prodName+"\nProduct Price: "+prodPrice+"\nTitle: "+title+"\nAuthor: "+author+"\nQuantity: "+prodQty;
    }

    @Override
    void addToCart() {
        super.addToCart();
        System.out.println(this);
    }
}

class Product{
    public static void main(String[] args) {
        Cloth c1 = new Cloth("Formal Shirt",499,2,"Black","Cotton","M");
        Book b1 = new Book("Book",8765,4,"Tales Of Maharaja Dileep","Dileep");
        c1.addToCart();
        b1.addToCart();
        Flipkart.makePayment();
    }
}