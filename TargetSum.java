import java.util.Scanner;

public class TargetSum {
    static boolean target(int[] arr,int size, int x){
        for(int i=0;i<(size-1);i++){
            for (int j=(i+1);j<size;j++){
                if(arr[i] + arr[j] >= x){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int targetSum = sc.nextInt();
        boolean flag = target(array,n,targetSum);
        if(flag == true){
            System.out.println("Target found");
        }else{
            System.out.println("Target not found");
        }
        sc.close();
    }
}
