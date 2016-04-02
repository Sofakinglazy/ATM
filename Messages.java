package atm;

public class Messages {
	public static final String WELCOME_MESSAGE = "Welcome to online ATM banking \n"
			+ "How much do you want in your account? \n"
			+ "Enter your number: ";
	
	public static final String FUNCTION_MESSAGE = "What do you want to do? \n"
			+ "1 : Withdraw \n"
			+ "2 : Deposit \n"
			+ "3 : Inquire \n"
			+ "4 : Quit \n"
			+ "Enter your number: ";
	
	public static final String ILLEGE_NUM_ERROR_MESSAGE = "The number you entered is illegal! "
			+ "Operation was abortion.";
	
	public static final String WITHDRAW_MESSGAE = "How much would you like to withdraw?\n"
			+ "Enter your number: ";
	
	public static final String DEPOSIT_MESSAGE = "How much would you like to deposit?\n"
			+ "Enter your number: ";
	
	public static final String WITHDRAW_TITLE = "Withdrawal";
	
	public static final String DEPOSIT_TITLE = "Deposit";
	
	public static final String QUIT_TITLE = "GoodBye!";
	
	public static final String INQUIRE_TITLE = "Your balance is %d";
	
	public static final String BANK_WELCOME_MESSAGE = "Welcome to Sainsburys bank.";
	
	public static final String BANK_FUNCTION_MESSAGE = "What do you want to do? \n"
			+ "1 : Sign up an account \n"
			+ "2 : Sign in an account \n"
			+ "3 : Quit \n"
			+ "Enter your number: ";
	
	public static final String SIGNUP_TITLE = "Sign Up";
	
	public static final String SIGNIN_TITLE = "Sign In";
	
	public static final String ACCOUNT_MESSAGE = "Please enter your account number: ";
	
	public static final String PIN_MESSAGE = "Please enter your 4-digits PIN: ";
	
	public static final String PIN_VERIFY_MESSAGE = "Please enter your 4-digits PIN again: "; 
	
	public static final String PIN_VERIFY_ERROR_MESSAGE = "The PIN you entered were not the same!";
	
	public static final String ACCOUNT_OCCUPIED_MESSAGE = "The Account you entered has been taken!"
			+ "Please enter it again.";
	
	public static final String ACCOUNT_ERROR_MESSAGE = "The Account you entered doesn't exsit."
			+ "Please enter it again.";
	
	public static final String PIN_ERROR_MESSAGE = "The PIN you entered was wrong"
			+ "Please enter it again.";
	
	public static final String BANK_QUIT_MESSAGE = "Thank you for using Sainsburys bank.";
	
	public static void printMessage(String message){
		System.out.println(message);
	}
	
	public static void printStarMessage(String message){
		String stars = "*****************************************";
		printMessage(stars + "\n" 
			+ center(message, stars.length()) + "\n"
			 	   + stars);
	}
	
	public static void printStarMessage(String message, int num){
		String s = String.format(message, num);
		printStarMessage(s);
	}
	
	public static String center(String message, int length) {
		return center(message, length, " ");
	}
	
	public static String center(String message, int length, String pad){
		if (pad == null)
			throw new NullPointerException("pad cannot be null.");
		if (pad.length() <= 0)
			throw new IllegalArgumentException("pad cannot be empty.");
		if (message == null || message.length() >= length)
			return message;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i < (length - message.length()) / 2; i++)
			sb.append(pad);
		
		sb.append(message);
		
		while(sb.length() < length)
			sb.append(pad);
		
		return sb.toString();
	}
}
