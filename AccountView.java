package AccountTest;

import account.AccountManger;

import java.sql.Connection;
import java.util.Scanner;

public class AccountView {
    private static Connection connection;
    public static void main(String[] args) {

        AccountManger manger = new AccountManger(connection);
        Scanner scanner = new Scanner(System.in);


        while (true){
            printMenu();
            System.out.print("선택:");
            int choice = scanner.nextInt();
            switch (choice){
                case  1:
                    manager.addMember();// 회원 등록
                    break;
                case  2:
                    manager.addAccount (); // 계좌 개설
                    break;
                case  3:
                    manager.deposit();// 입금 처리
                    break;

                case  4:
                    manager.withdraw();// 입금 처리
                    break;

                case  5:
                    manager.viewHistory();// 잔액및 거래내역 조회
                    break;

                case  6:
                    System.out.println("종료합니다"); // 프로그램 종료 메서드
                    manager.disConnect();
                    break;
            }
        }
    }

    public  static  void  printMenu() {
        System.out.println("==========Menu============");
        System.out.println("1. 회원등록");
        System.out.println("2. 계좌계설");
        System.out.println("3. 입금");
        System.out.println("4. 출금");
        System.out.println("5. 잔액 및 거래 내역 조회");
        System.out.println("6. 프로그램종료");
        System.out.println();
    }
    }

