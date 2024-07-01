package com.quizgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * This is the class having a method for creating quiz
 */
public class CreateQuiz {

	/**
	 * Default Constructor
	 */
	public CreateQuiz() {
		super();
	}

	/**
	 * This is the static method for creating quiz
	 * 
	 * @return ArrayList of quiz created
	 * @throws IOException on input error
	 */
	public static ArrayList<Question> quizCreation() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Question> questionlist = new ArrayList<Question>();

		while (true) {
			Question question = new Question();

			System.out.print("Enter question -> ");
			question.setQuestion(br.readLine());

			System.out.print("Enter option a. -> ");
			question.setOption1(br.readLine());

			System.out.print("Enter option b. -> ");
			question.setOption2(br.readLine());

			System.out.print("Enter option c. -> ");
			question.setOption3(br.readLine());

			System.out.print("Enter option d. -> ");
			question.setOption4(br.readLine());

			System.out.print("Enter Correct Answer -> ");
			question.setAnswer(br.readLine());

			if (question.getQuestion().equalsIgnoreCase("") || question.getOption1().equalsIgnoreCase("")
					|| question.getOption2().equalsIgnoreCase("") || question.getOption3().equalsIgnoreCase("")
					|| question.getOption4().equalsIgnoreCase("") || question.getAnswer().equalsIgnoreCase("")) {
				System.out.println("you entered null value, question not saved");
			} else {
				questionlist.add(question);
			}

			System.out.println("Do you want to add more question : (Y/N)");
			String option = br.readLine();

			if (option.equalsIgnoreCase("y")) {
				continue;
			} else {
				break;
			}
		}

		return questionlist;
	}

}
