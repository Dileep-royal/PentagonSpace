package Theory.may.class04_05_2024;

public class Encapsulation {

    // Private variables
    private int id;
    private String name;

    // Getter method
    public int getId(){
        return this.id;
    }

    // Setter method
    public void setId(int a){
        this.id=a;
    }

    // Getter method
    public String getName() {
        return this.name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

class Demo{
    public static void main(String[] args) {
        // creating an object of Encapsulation class
        Encapsulation e = new Encapsulation();
//        e.id; // throws a compile time error

        // calling setter methods
        e.setId(123);
        e.setName("Dileep");

        // calling getter methods
        System.out.println("Id: "+e.getId());
        System.out.println("Name: "+e.getName());
    }
}

/*
* Wrapping up the code and data members into a single unit as class is called Encapsulation.
* Binding the data members and methods into a single module as class.
* Providing Security and control over your data is the main intention/idea behind this Concept.
* It is also called as Data Hiding or Information Hiding.
* We achieve Security by using Access modifiers.
* We cannot directly access or modify the data members of a class, to do that we have Getter and Setter methods
* Getter methods, let you access or fetch value of a private data members.
* Setter methods, let you modify or assign the value of a Private data members.
* Hiding the data behind methods is the central concept of Encapsulation.
*  */