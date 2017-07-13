package edu.cpp.cs356;

public class Tweet {

	private String message;

	public Tweet(String str) {
		message = str;
		isPositive();
	}

	public String getMessage() {
		return message;
	}

	public boolean isPositive() {
		String[] positiveWords = { "nice", "great", "excellent", "awesome", "wonderful", "amazing", "positive" };

		for (String word : positiveWords)
			if (message.toLowerCase().contains(word))
				return true;

		return false;
	}

}
