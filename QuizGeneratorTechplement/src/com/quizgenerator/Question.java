package com.quizgenerator;

/**
 * This is a Java bean for storing questions
 */
public class Question {
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer;

	/**
	 * default constructor for creating the object of Question
	 */
	public Question() {
		super();
	}

	/**
	 * getter method for question
	 * 
	 * @return returns question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * setter method for question
	 * 
	 * @param question sets question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * getter method for option 1
	 * 
	 * @return returns 1st option
	 */
	public String getOption1() {
		return option1;
	}

	/**
	 * setter method for option 1
	 * 
	 * @param option1 sets 1st option
	 */
	public void setOption1(String option1) {
		this.option1 = option1;
	}

	/**
	 * getter method for option 2
	 * 
	 * @return returns 2nd option
	 */
	public String getOption2() {
		return option2;
	}

	/**
	 * setter method for option 2
	 * 
	 * @param option2 sets 2nd option
	 */
	public void setOption2(String option2) {
		this.option2 = option2;
	}

	/**
	 * getter method for option 3
	 * 
	 * @return returns 3rd option
	 */
	public String getOption3() {
		return option3;
	}

	/**
	 * setter method for option 3
	 * 
	 * @param option3 sets 3rd option
	 */
	public void setOption3(String option3) {
		this.option3 = option3;
	}

	/**
	 * getter method for option 4
	 * 
	 * @return returns 4th option
	 */
	public String getOption4() {
		return option4;
	}

	/**
	 * setter method for option 4
	 * 
	 * @param option4 sets 4th option
	 */
	public void setOption4(String option4) {
		this.option4 = option4;
	}

	/**
	 * getter method for answer
	 * 
	 * @return returns answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * setter method for answer
	 * 
	 * @param answer sets answer of the question
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "\nQues. ->  " + question + " \noption a. " + option1 + "\noption b. " + option2 + "\noption c. "
				+ option3 + "\noption d. " + option4;
	}

}
