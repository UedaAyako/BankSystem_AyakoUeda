package bankAccount;

public class BankAccount {
	
	private String accountId;
	private String accountPW;
	private int balance;
	
	//コンストラクタ
	public BankAccount(String accountId, String accountPW) {
		this.accountId = accountId;
		this.accountPW = accountPW;
		this.balance = 0;
	}
	
	//IDとPWが等価か確認
	public boolean authenticate(String inputID, String inputPW) {
		if(this.accountId.equals(inputID) && this.accountPW.equals(inputPW)) {
			return true;
		} 
			throw new IllegalArgumentException("IDかパスワードが間違っています");
	}
	
	//残高を取得
	public int getBalance() {
		return this.balance;
	}
	
	//入金
	public void Deposit(int amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("1円以上の入金をしてください");
		}
		this.balance += amount;
		
	}
	
	//出金
	public void Withdraw(int amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("1円以上の入金額を入力してください");
		} if (amount > this.balance) {
			throw new IllegalArgumentException("残高が足りません");
		}
		this.balance -= amount;
	}
	
	

}	
