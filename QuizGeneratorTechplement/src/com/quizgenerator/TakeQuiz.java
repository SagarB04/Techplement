package com.quizgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * This is the class having a method for showing quizzes and result
 */
public class TakeQuiz {

	/**
	 * Default Constructor
	 */
	public TakeQuiz() {
		super();
	}

	/**
	 * This is the static method for taking quiz and showing scores with feedback
	 * 
	 * @param questionlist arraylist of quizzes
	 * @throws IOException on input error
	 */
	public static void quizQuestions(ArrayList<Question> questionlist) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int score = 0;
		float percentage = 0;

		for (Question question : questionlist) {

			System.out.println(question.toString());
			System.out.print("Your Answer : ");

			String ans = br.readLine();

			if (ans.equalsIgnoreCase(question.getAnswer())) {
				score++;
			}

		}

		percentage = ((float) score / questionlist.size()) * 100;

		if (percentage >= 75) {
			System.out.println("\nYour score is : " + score);
			System.out.println("Feedback : You were Excellent! You got " + Math.round(percentage) + "% ");
		} else if (percentage >= 50) {
			System.out.println("\nYour score is : " + score);
			System.out.println("Feedback : You were Good! You got " + Math.round(percentage) + "% ");
		} else if (percentage >= 33) {
			System.out.println("\nYour score is : " + score);
			System.out.println("Feedback : You can do better! You got " + Math.round(percentage) + "% ");
		} else {
			System.out.println("\nYour score is : " + score);
			System.out.println("Feedback : Sorry, you didin't pass the test! You got " + Math.round(percentage) + "% ");
		}

	}
}
