package atm;

import java.util.Scanner;

public class ATM {
	
	private int balance;
	private Scanner input;
	
	public ATM(){
		input = new Scanner(System.in);
		balance = 0;
	}
	
	public void printMessage(String message){
		System.out.println(message);
	}
	
	public void printStarMessage(String message){
		String stars = "*****************************************";
		printMessage(stars + "\n" 
			+ StringUtil.center(message, stars.length()) + "\n"
			 	   + stars);
	}
	
	public void printStarMessage(String message, int num){
		String s = String.format(message, num);
		printStarMessage(s);
	}
	
	public void init(){
		printMessage(Messages.WELCOME_MESSAGE);
		balance = getInput();
	}
	
	public boolean selectFunction(){	
		printMessage(Messages.FUNCTION_MESSAGE);
		int num = getInput();
		switch (num){
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
		int num = getInput();
		if (balance >= num)
			balance -= num;
		else 
			printMessage(Messages.ERROR_MESSAGE);	
	}

	private int getInput() {
		int num = input.nextInt();
		if (num < 0){
			printMessage(Messages.ERROR_MESSAGE);
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
	
	public void run() throws InterruptedException{
		init();
		while (selectFunction()){
			Thread.sleep(3000);
		}
		input.close();
	}
}
