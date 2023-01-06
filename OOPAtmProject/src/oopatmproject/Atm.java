package oopatmproject;

import java.util.Scanner;

public class Atm {

    public void work(Account account) {

        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("User login");

        int rightofentry = 3;
        while (true) {
            if (login.Login(account)) {
                System.out.println("Successful login");
                break;
            } else {
                System.out.println("login failed");
                rightofentry -= 1;
                System.out.println("your remaining entry=" + rightofentry);
            }
            if (rightofentry == 0) {
                System.out.println("You are not allowed to login. Try again later");
                return ;
            }
            
        }
        System.out.println("*******************");
        String transaction = "1.balance learning \n"
                + "2.Deposit Money \n"
                + "3.Withdraw Money \n"
                + "4.press q to exit ";
        System.out.println(transaction);
        System.out.println("********************");
        while (true) {
            System.out.println("Please select transaction");
            String process=scanner.nextLine();
            if (process.equals("q")) {
                System.out.println("exiting the program");
                break;
            }else if (process.equals("1")) {
                System.out.println("your balance="+ account.getBalance());
                
            }else if (process.equals("2")) {
                System.out.println("The amount you want to deposit?");
                int  amount=scanner.nextInt();
                scanner.nextLine();
                account.DepositMoney(amount);
            }
            else if (process.equals("3")) {
                System.out.println("The amount you want to withdraw?");
                int amount=scanner.nextInt();
                scanner.nextLine();
                account.WithdrawMoney(amount);
            }
            else{
                System.out.println("You entered an invalid transaction");
            }

        }

    }

}
