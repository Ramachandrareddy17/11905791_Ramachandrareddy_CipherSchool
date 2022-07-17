import java.util.Scanner;

public class Cp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] rob = new int[n];
        int m = in.nextInt();
        int sum=0;
        int max = 0;
        int[][] mon = new int[m][2];
        for (int i=0;i<n;i++){
            rob[i] = in.nextInt();
        }
        for (int s=0;s<n;s++){
            sum = sum+rob[s];
        }
        for (int j=0;j<m;j++){
            mon[j][0] = in.nextInt();
            mon[j][1] = in.nextInt();
        }
        for (int l=0;l<n;l++){
            if(max >rob[l]){
                max = rob[l];
            }
        }
        for(int mo = 0;mo<m;m++){
            if(mon[mo][0]<max){
                int x=mon[mo][0]+mon[mo][1]-sum;
                if(x>0){
                    System.out.println(x);
                }else{
                    System.out.println(0);
                }

            }
            else{
                int x=mon[mo][0]+mon[mo][1]-sum;

            }
        }
        in.close();
    }
}
