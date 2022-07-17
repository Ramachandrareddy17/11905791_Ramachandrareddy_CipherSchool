package encapsulation;

public class CalcUtil {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    private CalcUtil(){

    }


    public static void main(String[] args) {
        CalcUtil cu = new CalcUtil();

        System.out.println(cu.add(5,7));
        System.out.println(cu.sub(52,25));
        System.out.println(cu.mul(5,8));
        System.out.println(cu.div(8,4));

    }
}
