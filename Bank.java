package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	private Scanner sb;
	private ArrayList<ATM> bank;
	
	public Bank(){
		bank = new ArrayList<ATM>();
		sb = new Scanner(System.in);
	}
	
	public void init(){
		Messages.printMessage(Messages.BANK_WELCOME_MESSAGE);
	}
	
	public boolean selectFunction(){
		Messages.printMessage(Messages.BANK_FUNCTION_MESSAGE);
		int num = getInput();
		switch (num){
			case 1: signIn();
					break;
			case 2: signUp();
					break;
			case 3: quit();
					return false;
			default: Messages.printMessage(Messages.ILLEGE_NUM_ERROR_MESSAGE);
		}
		return true;
	}
	
	private void quit() {
		Messages.printMessage(Messages.BANK_QUIT_MESSAGE);
	}

	private void signUp() {
		Messages.printStarMessage(Messages.SIGNUP_TITLE);
		boolean isValid = false;
		int account = 0;
		int PIN = 0;
		int PIN1;
		while(!isValid){
			Messages.printMessage(Messages.ACCOUNT_MESSAGE);
			account = getInput();
			if (isSameAccount(account)){
				Messages.printMessage(Messages.ACCOUNT_OCCUPIED_MESSAGE);
				continue;
			}	
			Messages.printMessage(Messages.PIN_MESSAGE);
			PIN = getInput();
			Messages.printMessage(Messages.PIN_VERIFY_MESSAGE);
			PIN1 = getInput();
			if(!isSamePIN(PIN, PIN1)){
				Messages.printMessage(Messages.PIN_VERIFY_ERROR_MESSAGE);
				continue;
			}
			isValid = true;
		}
		bank.add(new ATM(account, PIN));
	}

	private boolean signIn() {
		Messages.printStarMessage(Messages.SIGNIN_TITLE);
		Messages.printMessage(Messages.ACCOUNT_MESSAGE);
		boolean isMatched = false;
		int account = 0;
		while (!isMatched){
			account = getInput();
			if (isSameAccount(account)){
				isMatched = true;
			}
			Messages.printMessage(Messages.ACCOUNT_ERROR_MESSAGE);
		}
		return isMatched;
	}
	
	private boolean isSameAccount(int account) {
		for (ATM i : bank){
			if(i.getAccount() == account)
				return true;
		}
		return false;
	}
	
	private boolean isSamePIN(int PIN, int PIN1){
		return PIN == PIN1;
	}

	private int getInput(){
		int num = sb.nextInt();
		if (num >= 0)
			return num;
		else 
			Messages.printMessage(Messages.ERROR_MESSAGE);
		return 0;
	}
	
	public int getNumAccount(){
		return bank.size();
	}
}
