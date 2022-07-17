package string;

import java.io.InputStream;
import java.util.Scanner;
import java.util.SplittableRandom;

public class NumOfWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] wds = str.split(" ",str.length());
        System.out.println(wds.length);
        in.close();
    }
}
