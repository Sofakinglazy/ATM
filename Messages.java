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
	
	public static final String ERROR_MESSAGE = "The number you entered is illegal! Operation was abortion.";
	
	public static final String WITHDRAW_MESSGAE = "How much would you like to withdraw?\n"
			+ "Enter your number: ";
	
	public static final String DEPOSIT_MESSAGE = "How much would you like to deposit?\n"
			+ "Enter your number: ";
	
	public static final String WITHDRAW_TITLE = "Withdrawal";
	
	public static final String DEPOSIT_TITLE = "Deposit";
	
	public static final String QUIT_TITLE = "GoodBye!";
	
	public static final String INQUIRE_TITLE = "Your balance is %d";
	
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
