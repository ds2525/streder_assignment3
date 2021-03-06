package streder_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	public static int x;
	public static int y;

	public static void main(String[] args) {
		CAI1 quiz = new CAI1();
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
		CAI1 answer = new CAI1();
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
		System.out.println("Very good!");
	}
	
	void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
	}
	
	void quiz()
	{
		CAI1 question = new CAI1();
		question.askQuestion();
		question.isAnswerCorrect(x, y);
	}

}


