package encapsulation;

public class Source {
    private int num = 100;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
//if constructer is private then we cannot create object for that class.
