import java.util.Scanner;

public class ArrayReversing {
    static int[] reverse(int[] array){
        int N = array.length;
        int x = (N-1);
        for (int i=0; i<N/2; i++){
            array[i] = array[i]+array[x-i];
            array[x-i] = array[i]-array[x-i];
            array[i] = array[i]-array[x-i];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = reverse(arr);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
}
