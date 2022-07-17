package minijava;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu;
        int amt;
        System.out.println("Enter your password");
        String acnum = in.nextLine();
        String pwd = in.nextLine();
        boolean login = Login.verify(acnum,pwd);
        Menu.display();
        menu = in.nextInt();
        Banking bk = new Banking();
        if (login == true){
            if (menu == 1) {
                System.out.println(bk.getBalance());
            } else if (menu == 2) {
                amt = in.nextInt();
                bk.add(amt);
            } else if (menu == 3) {
                amt = in.nextInt();
                System.out.println(bk.withdraw(amt));
            }else {
                System.out.println("please enter the availabe options in the abouve list");
            }
        }else {
            System.out.println("Your password is wrong");
        }
        in.close();
    }
}
