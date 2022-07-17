package minijava;
import java.util.Scanner;

public class Login {
    int acNum;
    String pwd;
    public void acceptInput(int acNum, String pwd){
        this.acNum=acNum;
        this.pwd=pwd;
    }
    public static boolean verify(String acnum,String pwd){
        if(acnum == "8688070038" && pwd == ("tejateja11")){
            return true;
        }
        return false;
    }
//    public static boolean verify(String str){
//        boolean result=false;
//        if(str.length()<8){
//            System.out.println("Invalid password please enter 8 or more characters.");
//        }else {
//            for (int m=0;m<str.length();m++){
//                char c = str.charAt(m);
//                if(('a'<=c &&'z'>=c)||('A'<=c && 'Z'>=c)||('0'<=c && '9'>=c)){//||('0'<=c && '9'>=c)
//                    result = true;
//                }else{
//                    System.out.println("Please enter only Chars and Integers");
//                    break;
//                }
//
//            }
//            if(result == true){
//                System.out.println("Password Accepted");
//            }
//        }
//        return result;
//    }
}
