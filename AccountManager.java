package AccountTest;

import account.Account;
import account.AccountDAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {

    private ArrayList<Account> list;
    private Connection connection;
    private final Scanner stdIn;
    private final AccountDAO accountDAO;
    private final AccountDTO accountDTO;
    public  AccountManager(Connection connection) {

        accountDAO = new AccountDAO();
        stdIn = new Scanner(System.in);

    }
}
