import java.util.Scanner;

public class atenndence {
    static double percentage(int x, int n){
        return (x*n)/100;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double per = percentage(a,b);
        System.out.println(per);
        if(per>75){
            System.out.println("Allowed");
        }else{
            System.out.println("Not Allowed");
        }
        sc.close();
    }
}
