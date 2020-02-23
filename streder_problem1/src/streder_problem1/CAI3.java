package streder_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 {
	private int x;
	private int y;
	private int count = 0;
	
	public static void main(String[] args) {
		
		CAI3 quiz = new CAI3();
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
	
	public double isAnswerCorrect() {
		CAI3 answer = new CAI3();
		int result = answer.readResponse();
		
		double percentage = 0;
		
		if(result == x * y)
		{
			count = count + 1;
			double percent = count / 10.0;
			percentage = percent * 100;
			answer.displayCorrectResponse(percentage);
		}
		else
		{
			answer.displayIncorrectResponse(percentage);
		}
		
		return percentage;
	}
	
	void displayCorrectResponse(double percentage) {
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
	
	void displayIncorrectResponse(double percentage) {
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
	
	void displayCompletionMessage(double percentage)
	{
		if(percentage >= 75)
		{
			System.out.printf("Your score was: %6.2f%%\n", percentage);
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else
		{
			System.out.printf("Your score was: %6.2f%%\n", percentage);
			System.out.println("Please ask your teacher for extra help.");
		}
	}
	
	void quiz()
	{
		CAI3 question = new CAI3();
		double percentage = 0;
		
		for(int i = 0; i < 10; i++)
		{
			question.askQuestion();
			percentage = question.isAnswerCorrect();
		}
	}

}
