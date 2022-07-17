package inheritance;

import javax.xml.namespace.QName;

public class Dog extends Animal{
//    String name = "simba";
    public Dog() {
        super("Simba");
        System.out.println("Dog..");
    }

    void bark(){
        System.out.println(name+" Barking....");
    }
    void print(){
        System.out.println("Dog");
    }
}
