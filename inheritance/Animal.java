package inheritance;

public class Animal {
    String name = " Rosy";
    void eat(){
        System.out.println("eating");
    }
    void print(){
        System.out.println("Animal...");
    }

    public Animal(String name) {
        System.out.println("Animal...");
    }
}
//private members do not get inherited.