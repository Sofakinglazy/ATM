package atm;

public class ATM {
	
	private int balance;
	
	public ATM(){
		balance = 0;
	}
	
	public void printMessage(String message){
		System.out.println(message);
	}
	
	public void printStarMessage(String message){
		String stars = "*****************************************\n";
		printMessage(stars + StringUtil.center(message, stars.length()) + stars);
	}
	
	public void printStarMessage(String message, int num){
		String s = String.format(message, num);
		printStarMessage(s);
	}
	
	public boolean selectFunction(int num){		
		switch (num){
			case 1: withdraw();
					break;
			case 2: deposit();
					break;
			case 3: inquire();
					break;
			case 4: quit();
					break;
			default: printErrorMess();
					break;
		}
		return true;
	}
	
	private void quit() {
		printStarMessage(Messages.QUIT_TITLE);
	}

	private void printErrorMess() {
		printMessage(Messages.ERROR_MESSAGE);
	}

	private void inquire() {
		printStarMessage(Messages.INQUIRE_TITLE, getBalance());
	}

	private void deposit() {
		printStarMessage(Messages.DEPOSIT_TITLE);
		printMessage(Messages.DEPOSIT_MESSAGE);
	}

	private void withdraw() {
		printStarMessage(Messages.WITHDRAW_TITLE);
		printMessage(Messages.WITHDRAW_MESSGAE);
	}

	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public int getBalance(){
		return balance;
	}
	
	
}
