package Theory.projects.PlayerManagement;
import java.util.Scanner;

public class Player {
    private String name;
    private int age;
    private double height;
    private String country;

    // Constructor
    Player(String name, int age, double height, String country){
        this.name=name;
        this.age=age;
        this.height=height;
        this.country=country;
    }

    // Constructor
    Player(Scanner sc) {
        System.out.println("Enter the player's name: ");
        this.name=sc.next();
//        sc.nextLine();
        System.out.println("Enter the player's age: ");
        this.age = sc.nextInt();
        System.out.println("Enter the player's height: ");
        this.height=sc.nextDouble();
        System.out.println("Enter the player's country: ");
        this.country = sc.next();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getCountry() {
        return country;
    }


    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    // method
    void displayInfo(){
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Age: "+this.age);
        System.out.println("Player Name: "+this.height);
        System.out.println("Player Name: "+this.country);
    }
}

class Cricket extends Player{
    int wickets;
    int runs;

    // Constructor
    Cricket(String name, int age, double height, String country, int runs, int wickets){
        System.out.println("-----Enter Cricket Player Details-----");
        super(name, age, height, country);
        this.runs=runs;
        this.wickets=wickets;
    }

    // Constructor
    Cricket(Scanner sc){
        System.out.println("-----Enter Cricket Player Details-----");
        super(sc);
        System.out.println("Enter no. of runs scored: ");
        this.runs = sc.nextInt();
        System.out.println("Enter no. of Wickets taken: ");
        this.wickets = sc.nextInt();
    }


    void displayCricketStats(){
        System.out.println("------Cricket Player Information------");
        super.displayInfo();
        System.out.println("Total International Runs: "+this.runs);
        System.out.println("Total International Wickets: "+this.wickets);
    }
}

class Football extends Player{
    int goals;
    String position;

    // Constructor
    Football(String name, int age, double height, String country,int goals, String position){
        System.out.println("-----Enter Football Player Details-----");
        super(name,age,height,country);
        this.goals=goals;
        this.position=position;
    }

    // Constructor
    Football(Scanner sc){
        System.out.println("-----Enter Football Player Details-----");
        super(sc);
        System.out.println("Enter no. of goals scored: ");
        this.goals=sc.nextInt();
        System.out.println("Enter the player position: ");
        this.position=sc.next();
    }

    void displayFootballStats(){
        System.out.println("------Football Player Information------");
        super.displayInfo();
        System.out.println("No. of Goals Scored: "+this.goals);
        System.out.println("Position: "+this.position);
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        Cricket c1 =new Cricket("Virat Kohli",35,5.8,"India",87654,8 );
//        c1.displayCricketStats();
//
//
//        Football f1 =new Football("Virat Kohli",35,5.8,"India",876,"Middle" );
//        f1.displayFootballStats();
        while(true) {
            System.out.println("==== Football and Cricket players registration & stats Form ====");
            System.out.println("1. Cricket Player");
            System.out.println("2. Football Player");
            System.out.println("3. Exit");
            System.out.println("Enter your option:");
            int choice=sc.nextInt();
            switch(choice){
                case 1-> {
                    Cricket c1 = new Cricket(sc);
                    c1.displayCricketStats();
                }

                case 2->{
                    Football f1 = new Football(sc);
                    f1.displayFootballStats();
                }

                case 3->{
                    System.out.println("Exited Successfully");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Choice");
                }
             }
          }
        }
    }

//     link - https://www.reddit.com/r/javahelp/wiki/scanner/