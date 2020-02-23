package streder_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	public static int x;
	public static int y;

	public static void main(String[] args) {
		
		CAI2 quiz = new CAI2();
		quiz.quiz();
	}
	
	void askQuestion() {
		SecureRandom number = new SecureRandom();
		x = number.nextInt(10);
		y = number.nextInt(10);
		
		System.out.printf("How much is %d times %d\n", x, y);
	}
	
	public int readResponse() {
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		return answer;
	}
	
	void isAnswerCorrect(int x, int y) {
		CAI2 answer = new CAI2();
		int result = answer.readResponse();
		
		while(result != x * y)
		{
			answer.displayIncorrectResponse();
			result = answer.readResponse();
		}
		if (result == x * y)
		{
			answer.displayCorrectResponse();
		}
	}
	
	void displayCorrectResponse() {
		SecureRandom number = new SecureRandom();
		int display = number.nextInt(4) + 1;

		switch(display)
		{
			case 1 :
				System.out.println("Very good!");
				break;
			case 2 :
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
		}
	}
	
	void displayIncorrectResponse() {
		SecureRandom number = new SecureRandom();
		int display = number.nextInt(4) + 1;

		switch(display)
		{
			case 1 :
				System.out.println("No. Please try again.");
				break;
			case 2 :
				System.out.println("Wrong. Try once more.");
				break;
			case 3:
				System.out.println("Don't give up!");
				break;
			case 4:
				System.out.println("No. Keep trying.");
				break;
		}
	}
	
	void quiz()
	{
		CAI2 question = new CAI2();
		question.askQuestion();
		question.isAnswerCorrect(x, y);
	}

}

