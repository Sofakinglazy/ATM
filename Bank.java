package atm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements ActionListener{
	private Scanner input;
	private ArrayList<ATM> bank;
	
	public Bank(){
		bank = new ArrayList<ATM>();
		input = new Scanner(System.in);
	}
	
	public void init(){
		Messages.printStarMessage(Messages.BANK_WELCOME_MESSAGE);
	}
	
	public boolean selectFunction() throws InterruptedException{
		Messages.printMessage(Messages.BANK_FUNCTION_MESSAGE);
		int option = getInput();
		switch (option){
			case 1: signUp();
					break;
			case 2: signIn();
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
			while (!isLegalPIN(PIN)){
				Messages.printMessage(Messages.ILLEGE_NUM_ERROR_MESSAGE);
				PIN = getInput();
			}
			Messages.printMessage(Messages.PIN_VERIFY_MESSAGE);
			PIN1 = getInput();
			if(!isSamePIN(PIN, PIN1)){
				Messages.printMessage(Messages.PIN_VERIFY_ERROR_MESSAGE);
				continue;
			}
			isValid = true;
		}
		bank.add(new ATM(account, PIN));
		Messages.printMessage(Messages.SIGNUP_SUCCESS_MESSAGE, account);
	}

	private void signIn() throws InterruptedException {
		Messages.printStarMessage(Messages.SIGNIN_TITLE);
		Messages.printMessage(Messages.ACCOUNT_MESSAGE);
		int account = 0;
		int PIN = 0;
		while (true){
			account = getInput();
			if (isSameAccount(account)){
				break;
			}
			Messages.printMessage(Messages.ACCOUNT_ERROR_MESSAGE);
		}
		ATM atm = getATMbyAccount(account);
		Messages.printMessage(Messages.PIN_MESSAGE);
		while(true){
			PIN = getInput();
			if (isSamePIN(PIN, atm.getPIN()))
				break;
			Messages.printMessage(Messages.PIN_ERROR_MESSAGE);
		}
		Messages.printMessage(Messages.SIGNIN_SUCCESS_MESSAGE);
		Messages.printStarMessage(Messages.SIGNIN_SUCCESS_TITLE, account);
		atm.run();
	}
	
	private boolean isSameAccount(int account) {
		for (ATM i : bank){
			if(i.getAccount() == account)
				return true;
		}
		return false;
	}
	
	private ATM getATMbyAccount(int account){
		for (ATM i : bank){
			if(i.getAccount() == account)
				return i;
		}
		return null;
	}
	
	private boolean isSamePIN(int PIN, int PIN1){
		return PIN == PIN1;
	}
	
	private boolean isLegalPIN(int PIN){
		return String.valueOf(PIN).length() == 4;
	}

	private int getInput(){
		int num = input.nextInt();
		if (num >= 0)
			return num;
		else 
			Messages.printMessage(Messages.ILLEGE_NUM_ERROR_MESSAGE);
		return 0;
	}
	
	public int getNumAccount(){
		return bank.size();
	}
	
	public void run() throws InterruptedException{
		init();
		while(selectFunction()){
			Thread.sleep(3000);
			init();
		}
		input.close();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
