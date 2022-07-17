package polymorphism;

public class Contact {
    String name;
    int mobile;
    public void saveContact(String name,int mobile) {
        System.out.println("Name "+name);
        System.out.println("Phone "+ mobile);
    }
    public void saveContact(String name,int mobile1,int mobile2){
        System.out.println(name);
        System.out.println(mobile1);
        System.out.println(mobile2);
    }
}

