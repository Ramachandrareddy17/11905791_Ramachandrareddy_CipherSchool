import java.util.ArrayList;

public class ArrayMerging {
    public static void main(String[] args) {
        int[] a = {2,5,8,9};
        int[] b = {1,3,6,10};
        int n = a.length+b.length;
        int[] c = new int[n];
        int x=0,y=0;


        for(int i=0; i<n;i++){
            if(x<a.length && y<b.length){
                if(a[x]>b[y]){
                    c[i]=b[y];
                    y++;
//                    System.out.println(y+"=y");
                }else{
                    c[i]=a[x];
                    x++;
//                    System.out.println(x+"=x");
                }
            }
            else if(y>x){
                c[i]=a[x];
                x++;
            }
            else{
                c[i]=b[y];
                y++;
            }
        }
        for (int ele:c) {
            System.out.print(ele);
        }

    }
}
