package string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pal = in.nextLine();
        String revString = "";
//        System.out.println(pal);
        for (int m = pal.length()-1;m>=0;m--){
            revString = revString + pal.charAt(m);
        }
        System.out.println(pal.equalsIgnoreCase(revString));
        in.close();

    }
}
