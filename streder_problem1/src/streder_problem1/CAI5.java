package streder_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {
	private double x;
	private double y;
	private int count = 0;
	
	public static void main(String[] args) {
		String keepGoing = "yes";
		Scanner problem = new Scanner(System.in);
		
		CAI5 quiz = new CAI5();
		
		while(keepGoing.equals("yes"))
		{
			quiz.quiz();
			System.out.println("Enter yes to keep going or no the stop: ");
			keepGoing = problem.nextLine();
		}
	}
	
	public int readProblemType()
	{
		Scanner problem = new Scanner(System.in);
		System.out.println("Enter a problem type of 1,2,3,4 or 5");
		int problemType = problem.nextInt();
		return problemType;
	}
	
	public int askQuestion(int problemType) {
		SecureRandom number = new SecureRandom();
		int questionNum = number.nextInt(4) + 1;
		
		if(problemType == 1)
		{
			System.out.printf("How much is %f plus %f\n", x, y);
		}
		else if (problemType == 2)
		{
			System.out.printf("How much is %f times %f\n", x, y);
		}
		else if (problemType == 3)
		{
			System.out.printf("How much is %f minus %f\n", x, y);
		}
		else if (problemType == 4)
		{
			System.out.printf("How much is %f divided %f\n", x, y);
		}
		else
		{
			switch(questionNum)
			{
				case 1 :
					System.out.printf("How much is %f plus %f\n", x, y);
					break;
				case 2 :
					System.out.printf("How much is %f times %f\n", x, y);
					break;
				case 3:
					System.out.printf("How much is %f minus %f\n", x, y);
					break;
				case 4:
					System.out.printf("How much is %f divided %f\n", x, y);
					break;
			}
		}
		
		return questionNum;
	}
	
	public void generateQuestionArgument(int difLevel) {
		SecureRandom number = new SecureRandom();
		CAI5 level = new CAI5();
		
		if (difLevel == 1)
		{
			x = number.nextInt(10);
			y = number.nextInt(10);
		}
		else if (difLevel == 2)
		{
			x = number.nextInt(100);
			y = number.nextInt(100);
		}
		else if (difLevel == 3)
		{
			x = number.nextInt(1000);
			y = number.nextInt(1000);
		}
		else
		{
			x = number.nextInt(10000);
			y = number.nextInt(10000);
		}
	}
	
	public int readDifficulty() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a difficulty level of 1,2,3 or 4");
		int difLevel = input.nextInt();
		return difLevel;
		
	}
	
	public double readResponse() {
		Scanner input = new Scanner(System.in);
		double answer = input.nextDouble();
		return answer;
	}
	
	public double isAnswerCorrect(int problemType, int questionNum) {
		CAI5 answer = new CAI5();
		double percentage = 0;
		
		if (problemType == 1)
		{
			double result = answer.readResponse();
			if (result == x + y)
			{
				count = count + 1;
				double percent = count / 10.0;
				percentage = percent * 100;
				answer.displayCorrectResponse();
			}
			else
			{
				answer.displayIncorrectResponse();
			}
		}
		else if(problemType == 2)
		{
			double result = answer.readResponse();
			if(result == x * y)
			{
				count = count + 1;
				double percent = count / 10.0;
				percentage = percent * 100;
				answer.displayCorrectResponse();
			}
			else
			{
				answer.displayIncorrectResponse();
			}
		}
		else if (problemType == 3)
		{
			double result = answer.readResponse();
			if (result == x - y)
			{
				count = count + 1;
				double percent = count / 10.0;
				percentage = percent * 100;
				answer.displayCorrectResponse();
			}
			else
			{
				answer.displayIncorrectResponse();
			}
		}
		else if (problemType == 4)
		{
			double result = answer.readResponse();
			if (Math.abs(result - (x / y)) < .0001)
			{
				count = count + 1;
				double percent = count / 10.0;
				percentage = percent * 100;
				answer.displayCorrectResponse();
			}
			else
			{
				answer.displayIncorrectResponse();
			}
		}
		else
		{
			double result = answer.readResponse();
			switch(questionNum)
			{
				case 1 :
					if(result == x + y)
					{
						count = count + 1;
						double percent = count / 10.0;
						percentage = percent * 100;
						answer.displayCorrectResponse();
					}
					else
					{
						answer.displayIncorrectResponse();
					}
					break;
				case 2 :
					if(result == x * y)
					{
						count = count + 1;
						double percent = count / 10.0;
						percentage = percent * 100;
						answer.displayCorrectResponse();
					}
					else
					{
						answer.displayIncorrectResponse();
					}
					break;
				case 3:
					if(result == x - y)
					{
						count = count + 1;
						double percent = count / 10.0;
						percentage = percent * 100;
						answer.displayCorrectResponse();
					}
					else
					{
						answer.displayIncorrectResponse();
					}
					break;
				case 4:
					if(result == x / y)
					{
						count = count + 1;
						double percent = count / 10.0;
						percentage = percent * 100;
						answer.displayCorrectResponse();
					}
					else
					{
						answer.displayIncorrectResponse();
					}
					break;
			}
		}
		
		return percentage;
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
	
	void displayCompletionMessage(double percentage) {		
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
	
	void quiz() {
		double percentage = 0;
		int questionNum = 0;
		CAI5 question = new CAI5();
		
		int problemType = question.readProblemType();
		int difLevel = question.readDifficulty();
			
		for(int i = 0; i < 10; i++)
		{
			question.generateQuestionArgument(difLevel);
			questionNum = question.askQuestion(problemType);
			percentage = question.isAnswerCorrect(problemType, questionNum);
		}
		
			question.displayCompletionMessage(percentage);
		}
	}