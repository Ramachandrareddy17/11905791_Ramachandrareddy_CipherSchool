public class Student {
    String name;
    int rolllno;
    int age;
    Address address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rolllno=" + rolllno +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public Student(String name, int rolllno, int age, Address address) {
        this.name = name;
        this.rolllno = rolllno;
        this.age = age;
        this.address = address;
    }
//    public static void main(String[] args) {
//    Student stu1 = new Student();
//    stu1.name = "Teja";
//    stu1.rolllno = 1;
//    stu1.age = 22;
//    System.out.println(stu1);
//    }
}
