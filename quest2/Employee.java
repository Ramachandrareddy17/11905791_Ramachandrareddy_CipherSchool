package quest2;

public class Employee extends Member{
    String specialization;
//    String department;

    public Employee(String name, int age, long phoneNumber, String address, float salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "specialization='" + specialization + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
