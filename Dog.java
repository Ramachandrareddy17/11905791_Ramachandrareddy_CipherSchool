public class Dog {
    String name;
    String breed;
    int age;

    public void bark() {
        System.out.println(name + " from bark");
    }

    public void eat(){
        System.out.println(name +"is eating.");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "hola";
        d1.breed ="husky";

    }

}
