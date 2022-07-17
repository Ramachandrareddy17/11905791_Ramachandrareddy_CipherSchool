package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Source {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        System.out.println(a+b);
//        try{
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
////            System.err.println(e);
//            e.printStackTrace();
//        }
//        System.out.println(a*b);
//        compile time exception
//        FileInputStream fileInputStream = new FileInputStream("abc.txt");
        try{
            FileInputStream fileInputStream = new FileInputStream("abc.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }
}
