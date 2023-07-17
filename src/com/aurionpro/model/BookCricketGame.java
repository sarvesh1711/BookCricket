package com.aurionpro.model;

public class BookCricketGame {

	private String name;
	private static int runsOfPlayerOne = 0;
	private static int runsOfPlayerTwo = 0;
	private static int random;
	private static int turns = 0;
	private static int turnsFinal;

	public static String playerOneScore(String name) {
		int turnScore = Integer.MAX_VALUE;
		while (turnScore != 0) {
			random = (int) (Math.random() * 300) + 1;
			turnScore = random % 7;
			turns++;
			System.out.println("turn number for player 1 : " + turns);
			runsOfPlayerOne = runsOfPlayerOne + turnScore;
			System.out.println(
					"book page number : " + random + "\tpoint : " + turnScore + "\tScore : " + runsOfPlayerOne);
		}
		turnsFinal = turns;
		return name + " has scored " + runsOfPlayerOne + " runs in " + turns + " turns";
	}

	public static String playerTwoScore(String name) {
		while (runsOfPlayerOne > runsOfPlayerTwo) {
			while (turnsFinal > 0) {
				int turnScore = Integer.MAX_VALUE;
				System.out.println("turn number for player : " + turnsFinal);
				turnsFinal--;
				random = (int) (Math.random() * 300) + 1;
				turnScore = random % 7;
				runsOfPlayerTwo = runsOfPlayerTwo + turnScore;
				System.out.println(
						"book page number : " + random + "\tpoint : " + turnScore + "\tScore : " + runsOfPlayerTwo);
			}
			break;
		}
		if (runsOfPlayerOne < runsOfPlayerTwo) {
			System.out.println("player 2 won");
		} else if (runsOfPlayerOne == runsOfPlayerTwo) {
			if (turns < (turns - turnsFinal)) {
				System.out.println("player 1 won");
			} else {
				System.out.println("player 2 won");
			}
		} else {
			System.out.println("player 1 won");
		}
		return name + " has scored " + runsOfPlayerTwo + " runs in " + (turns - turnsFinal) + " turns";
	}
}