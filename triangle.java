import java.util.Scanner;

public class triangle {
    static double area(double x,double y,double z){
        double s = (x+y+z)/2;
        double res = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextInt();
        double s2 = sc.nextInt();
        double s3 = sc.nextInt();
        System.out.println(area(s1,s2,s3));
        sc.close();
    }
}
//22.5*12.5*7.5*2.5
