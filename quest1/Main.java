package quest1;

public class Main {
    public static void main(String[] args) {
//        private Parent par;
        Parent par = new Parent();
        Child child = new Child();
        par.metParent();
        child.metChild();
        child.metParent();
//        par.metChild();
    }
}
