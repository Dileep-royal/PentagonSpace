package Theory.may.class02_05_2024;

public class Phone {

    // Phone unlock using pin
    void unLock(int pin){
        System.out.println("Phone is Unlocked using pin");
    }

    // Phone unlock using Facial Recognition
    void unLock(Image m1){
        System.out.println("Phone is Unlocked using Facial recognition");
    }

    // Phone unlock using Pattern
    void unLock(Pattern p1){
        System.out.println("Phone is Unlocked using pattern");
    }

    // Phone unlock using Finger print
    void unLock(FingerPrint f1){
        System.out.println("Phone is Unlocked using Finger Print");
    }

    // Phone unlock using Password
    void unLock(String pass){
        System.out.println("Phone is Unlocked using password");
    }

    // phone unlock using Facial Recognition
    public static void main(String[] args) {
       Image m1 = new Image();
       FingerPrint f1 = new FingerPrint();
       Pattern p1 = new Pattern();
       Phone ph1 = new Phone();
       ph1.unLock(4562);
       ph1.unLock(m1);
       ph1.unLock(f1);
       ph1.unLock(p1);
       ph1.unLock("vghdfxhgjgfd");
    }
}
