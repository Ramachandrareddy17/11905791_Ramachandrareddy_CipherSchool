import java.util.ArrayList;
import java.util.Scanner;


public class Test3 {
    public static int days(ArrayList<Integer> h){
        int count=0;
        int temp = h.get(0); //6 5 8 4 7 10 9
//        System.out.println(temp);
        for (int i =1;i<h.size();i++){
            if(temp<h.get(i)){
                temp=h.get(i);
                h.remove(i);
//                System.out.println("temp = "+temp);
            }else{
                temp=h.get(i);
//                System.out.println(temp+" temp");
                continue;
            }

            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int x;
        int day=0;


        ArrayList<Integer> h = new ArrayList<>(n);
        for (int idx = 0; idx<n; idx++){
            h.add(in.nextInt());
        }
        for (int m=0;m<h.size()-1;m++){
            if(h.get(m)>h.get(m+1)){
                continue;
            }else {
                x = days(h);
                day++;
            }
        }

//        System.out.println(x);
//        System.out.println(temp);
//        System.out.println(count);
        for (int idx=0;idx<h.size();idx++){
            int y = h.get(idx);
            System.out.println(y);
        }
        in.close();
    }
}

//5 8 4 = 3,4 7 10 =5,7 10 9 = 6
