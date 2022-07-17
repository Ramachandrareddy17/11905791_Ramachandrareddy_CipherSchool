import java.util.Scanner;

public class sumod {
    static int func(int n){
        if(n<=0){
            return 0;
        }
        int num = n%10+func(n/10);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(func(x));
    }
}
