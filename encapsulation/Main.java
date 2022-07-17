package encapsulation;

public class Main {
    public static void main(String[] args) {
        Source sr = new Source();
        System.out.println(sr.getNum());
        sr.setNum(150);
        System.out.println(sr.getNum());
    }
}
