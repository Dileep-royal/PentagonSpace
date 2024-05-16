package Theory.may.class03_05_2024;

public class ShivaTemple {
    private String idol="Shiva";
    private String offerings;
    private String prasadam="Laddu";

    public String getIdol() {
        return idol;
    }

    public void setIdol(String idol) {
        this.idol = idol;
    }

    public String getOfferings() {
        return offerings;
    }

    public void setOfferings(String offerings) {
        this.offerings = offerings;
    }

    public String getPrasada(){
        return this.prasadam;
    }
}

class Demo{
    public static void main(String[] args) {
        ShivaTemple manoj = new ShivaTemple();
        ShivaTemple hitesh = new ShivaTemple();
        manoj.setOfferings("Roses");
        System.out.println("----- Shiva Temple -----");
        System.out.println("Idol: "+manoj.getIdol());
        System.out.println("Offerings: "+manoj.getOfferings());
        System.out.println("---- After Pooja -----");
        System.out.println("Prasada Recieved: "+hitesh.getPrasada());
    }
}
