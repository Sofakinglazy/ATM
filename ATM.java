package atm;

import java.util.Scanner;

public class ATM {
	
	private int balance;
	private Scanner input;
	private int account;
	private int PIN;
	
	public ATM(int account, int PIN){
		input = new Scanner(System.in);
		balance = 0;
		this.account = account;
		this.PIN = PIN;
	}
	
	public void init(){
		Messages.printMessage(Messages.WELCOME_MESSAGE);
		balance = getInput();
	}
	
	public boolean selectFunction(){	
		Messages.printMessage(Messages.FUNCTION_MESSAGE);
		int option = getInput();
		switch (option){
			case 1: withdraw();
					break;
			case 2: deposit();
					break;
			case 3: inquire();
					break;
			case 4: quit();
					return false;
			default: printErrorMess();
					break;
		}
		return true;
	}
	
	private void quit() {
		Messages.printStarMessage(Messages.QUIT_TITLE, account);
	}

	private void printErrorMess() {
		Messages.printMessage(Messages.ILLEGE_NUM_ERROR_MESSAGE);
	}

	private void inquire() {
		Messages.printStarMessage(Messages.INQUIRE_TITLE, getBalance());
	}

	private void deposit() {
		Messages.printStarMessage(Messages.DEPOSIT_TITLE);
		Messages.printMessage(Messages.DEPOSIT_MESSAGE);
		
		balance += getInput();
	}

	private void withdraw() {
		Messages.printStarMessage(Messages.WITHDRAW_TITLE);
		Messages.printMessage(Messages.WITHDRAW_MESSGAE);
		int num = getInput();
		if (balance >= num)
			balance -= num;
		else 
			Messages.printMessage(Messages.ILLEGE_NUM_ERROR_MESSAGE);	
	}

	private int getInput() {
		int num = input.nextInt();
		if (num < 0){
			Messages.printMessage(Messages.ILLEGE_NUM_ERROR_MESSAGE);
			return 0;
		} else {
			return num;
		}
	}

	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setAccount(int account){
		this.account = account;
	}
	
	public int getAccount(){
		return account;
	}
	
	public void setPIN(int PIN){
		this.PIN = PIN;
	}
	
	public int getPIN(){
		return PIN;
	}
	
	public void run() throws InterruptedException{
//		init();
		while (selectFunction()){
			Thread.sleep(3000);
		}
	}
}
