package atm;

import java.util.Scanner;

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
	
	public void init(){
		printMessage(Messages.WELCOME_MESSAGE);
		balance = getInput();
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
		
		balance += getInput();
	}

	private void withdraw() {
		printStarMessage(Messages.WITHDRAW_TITLE);
		printMessage(Messages.WITHDRAW_MESSGAE);
		
		balance -= getInput();
	}

	private int getInput() {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		return num;
	}

	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void run(){
		init();
		selectFunction();
	}
}
