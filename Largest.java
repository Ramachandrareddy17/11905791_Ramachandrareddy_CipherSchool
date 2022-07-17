import java.util.Scanner;

public class Largest {
//    public void days(){
//
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int count=0;
        int days=0;
        for (int idx=0;idx<n-1;idx++){
            arr[idx] = in.nextInt();
        }
        int temp=0;
        for (int idx=0;idx<n-1;idx++){
            temp = arr[idx];
            if (arr[idx]<arr[idx+1]){
                temp = arr[idx+1];
                for (int m=idx+1;m<arr.length;m++){
                    arr[m]=arr[m+1];
                    count++;
                }
            }else{

            }
        }
        in.close();
    }
}
