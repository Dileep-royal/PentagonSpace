package Theory.april;

public class Class23_04 {
    public static void main(String[] args) {
        Conductor c1 = new Conductor();
        Ticket t1 =c1.issueTicket();
        System.out.println("Onbaoarding: "+t1.source+" Destination: "+t1.destination+" Ticket Price: "+t1.amount+" Number of Passenegers"+t1.numberOfPassengers);
    }
}

class Conductor{
    Ticket issueTicket(){
       Ticket t1 = new Ticket("Banglore","Haryana",2000,1);
       return t1;
    }
}

class Ticket{
//  Declaration
    String source;
    String destination;
    int amount;
    int numberOfPassengers;

//    Constructor
    Ticket(String source, String destination,int amount,int numberOfPassengers){
        this.source=source;
        this.destination=destination;
        this.amount=amount*numberOfPassengers;
        this.numberOfPassengers=numberOfPassengers;
    }
}