package quest2;

public class Member {
    String name;
    int age;
    long phoneNumber;
    String address;
    float salary;
    public void printSalary(){
        System.out.println(salary);
    }

    public Member(String name, int age, long phoneNumber, String address, float salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

}
