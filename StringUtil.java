package atm;

public class StringUtil {

	public static String center(String message, int length) {
		return center(message, length, " ");
	}
	
	public static String center(String message, int length, String pad){
		if (pad == null)
			throw new NullPointerException("pad cannot be null.");
		if (pad.length() <= 0)
			throw new IllegalArgumentException("pad cannot be empty.");
		if (message == null || message.length() <= message.length())
			return message;
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i < (length - message.length() / 2); i++)
			sb.append(pad);
		
		sb.append(message);
		
		while(sb.length() < length)
			sb.append(pad);
		
		return sb.toString();
	}

}
