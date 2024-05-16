package Theory.may.class15_05_2024;

public class Player {
    private String name;
    private int age;
    private double height;
    private String country;

    // constructor
    Player(String name, int age, double height, String country){
        this.name=name;
        this.age=age;
        this.height=height;
        this.country=country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    void displayInfo(){
        System.out.println("------Player Information------");
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Age: "+this.age);
        System.out.println("Player Name: "+this.height);
        System.out.println("Player Name: "+this.country);
    }

}

class Cricket extends Player{
    int wickets;
    int runs;
    Cricket(String name, int age, double height, String country, int runs, int wickets){
        super(name, age, height, country);
        this.runs=runs;
        this.wickets=wickets;
    }
    void displayCricketStats(){
        super.displayInfo();
        System.out.println("Runs: "+this.runs);
        System.out.println("Wickets: "+this.wickets);
    }
}

class Football extends Player{
    int goals;
    String position;
    Football(String name, int age, double height, String country,int goals, String position){
        super(name, age, height, country);
        this.goals=goals;
        this.position=position;
    }

    void displayFootballStats(){
        super.displayInfo();
        System.out.println("Goals: "+this.goals);
        System.out.println("Position: "+this.position);
    }
}

class Test{
    public static void main(String[] args) {
        Cricket c1 =new Cricket("Virat Kohli",35,5.8,"India",87654,8 );
        c1.displayCricketStats();
        Football f1 =new Football("Virat Kohli",35,5.8,"India",876,"Middle" );
        f1.displayFootballStats();
    }
}