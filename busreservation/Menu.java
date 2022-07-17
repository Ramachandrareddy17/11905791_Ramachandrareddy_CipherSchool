package busreservation;

public class Menu {
    LoginSignup loginSignup = new LoginSignup();
    public void loggingin(int x){
        System.out.println("1 Login"+"2 Signin");
        switch (x){
            case 1:
                System.out.println(loginSignup.signup("teja",528639417,"teja@gamil","siva","csp","ap","1234567890"));
                break;
            case 2:
                System.out.println(loginSignup.login("teja@gamil","1234567890"));
                break;
        }
    }
    public void display(){

    }

}
