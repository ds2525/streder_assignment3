import java.security.SecureRandom;

public class askQuestion {
	
	public static void main(String[] args) {
		
		SecureRandom number = new SecureRandom();
		int x = number.nextInt(9);
		int y = number.nextInt(9);
		
		int result = x * y;
		
		System.out.printf("How much is %d times %d", x, y);
	}

}
