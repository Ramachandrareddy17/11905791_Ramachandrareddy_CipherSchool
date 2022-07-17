package quest2;

public class Manager extends Member{
//    String specialization;
    String department;

    void print(){
        System.out.println();
    }

    public Manager(String name, int age, long phoneNumber, String address, float salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
