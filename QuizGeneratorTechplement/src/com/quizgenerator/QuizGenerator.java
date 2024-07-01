package com.quizgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * QuizGenerator class is the main class having main method for quiz generator
 */
public class QuizGenerator {
	/**
	 * Default Constructor
	 */
	public QuizGenerator() {
		super();
	}

	/**
	 * This is the main method
	 * 
	 * @param args Unused.
	 * @exception NumberFormatException on error during conversion of string to integer
	 * @see NumberFormatException
	 * @exception IOException On input error.
	 * @see IOException
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to The Quiz Generator");

		ArrayList<Question> questionlist = new ArrayList<Question>();

		int n = 1;
		while (n == 1) {

			System.out.println("\nChoose an option below : ");
			System.out.println("1. Create Quiz" + "\n2. Take Quiz" + "\n3. Exit");
			System.out.print("Enter : ");

			int select = Integer.parseInt(br.readLine());

			switch (select) {
			case 1:
				questionlist = CreateQuiz.quizCreation();
				break;
			case 2:
				if (questionlist.size() > 0) {
					TakeQuiz.quizQuestions(questionlist);
				} else {
					System.out.println("There is no quiz, please create quiz first\n");
				}
				break;
			case 3:
				n = 0;
				break;

			default:
				System.out.println("Invalid Entry");
				break;
			}
		}

	}

}
