package main;

import java.util.Scanner;

import bankAccount.BankAccount;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//あらかじめ用意したIDとパスワード
		BankAccount account = new BankAccount("1234567", "1234");
		
		//IDとパスワードの入力
		System.out.print("IDを入力してください：");
		String inputId = scanner.nextLine();
		
		System.out.print("パスワードを入力してください：");
		String inputPassword = scanner.nextLine();

	
	try {
		// 認証チェックを行う
		if (account.authenticate(inputId, inputPassword)) {
			
			//入出金の金額の入力を求める
			System.out.print("入金したい金額を入力してください：");
			String inuptDepositNumber = scanner.nextLine();
			int inputDeposit = Integer.parseInt(inuptDepositNumber);
			
			System.out.print("出金したい金額を入力してください：");
			String inputWithdrawNumber = scanner.nextLine();
			int inputWithdraw = Integer.parseInt(inputWithdrawNumber);
			
			// 入金・出金のメソッド呼び出し（引数に金額を渡す）
			account.Deposit(inputDeposit);
			account.Withdraw(inputWithdraw);

			// 最終的な残高を表示
			System.out.println("残高:" + account.getBalance() + "円");
		}
	} catch (IllegalArgumentException e) {
		System.out.println(e.getMessage()); // ← 誤った場合にメッセージ表示される
	} finally {
		scanner.close();
	}
	
	}
}
