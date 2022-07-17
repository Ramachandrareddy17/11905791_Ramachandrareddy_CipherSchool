import java.util.Scanner;

public class MinMaxInArray {
    static int min(int[] arr,int  n){
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(arr[0]>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr,int  n){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[0]<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int minimum = min(array,n);
        System.out.println("Minimum is "+minimum);
        int maximum = max(array,n);
        System.out.println("Maximum is "+maximum);
        sc.close();
    }
}
