package string;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean result = false;
        if(str.length()<8){
            System.out.println("Invalid password please enter 8 or more characters.");
        }else {
            for (int m=0;m<str.length();m++){
                char c = str.charAt(m);
                if(('a'<=c &&'z'>=c)||('A'<=c && 'Z'>=c)||('0'<=c && '9'>=c)){//||('0'<=c && '9'>=c)
                    result = true;
                }else{
                    System.out.println("Please enter only Chars and Integers");
                    break;
                }

            }
            if(result == true){
                System.out.println("Password Accepted");
            }
        }
        in.close();
    }
}
