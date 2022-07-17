package project;

import java.util.Scanner;

public class Login {
    String acnum;
    String pwd;
//    String acnum = "987654321";
//    String pwd = "cypher123";

    public static void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Acc number");
        String acnum = sc.nextLine();
        System.out.println("Enter Your Password");
        String pwd = sc.nextLine();

        sc.close();
    }
    public static boolean verify(String acnum,String pwd){
        try{
            if(acnum == "987654321" && pwd == "cypher123"){
                return true;
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
