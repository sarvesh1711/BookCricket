package com.aurionpro.model;

public class BookCricketGame {

	private String name;
	private static int playerOneRun = 0;
	private static int playerTwoRun = 0;
	private static int random;
	private static int turns = 0;
	private static int turnsFinal;

	public static String scoreOfPlayerOne(String name) {
		int turnScore = Integer.MAX_VALUE;
		while (turnScore != 0) {
			random = (int) (Math.random() * 300) + 1;
			turnScore = random % 7;
			turns++;
			System.out.println("turn number for player 1 : " + turns);
			playerOneRun = playerOneRun + turnScore;
			System.out.println(
					"book page number : " + random + "\tpoint : " + turnScore + "\tScore : " + playerOneRun);
		}
		turnsFinal = turns;
		return name + " has scored " + playerOneRun + " runs in " + turns + " turns";
	}

	public static String scoreOfPlayerTwo(String name) {
		while (playerOneRun > playerTwoRun) {
			while (turnsFinal > 0) {
				int turnScore = Integer.MAX_VALUE;
				System.out.println("turn number for player : " + turnsFinal);
				turnsFinal--;
				random = (int) (Math.random() * 300) + 1;
				turnScore = random % 7;
				playerTwoRun = playerTwoRun + turnScore;
				System.out.println(
						"book page number : " + random + "\tpoint : " + turnScore + "\tScore : " + playerTwoRun);
			}
			break;
		}
		if (playerOneRun < playerTwoRun) {
			System.out.println("player 2 won");
		} else if (playerOneRun == playerTwoRun) {
			if (turns < (turns - turnsFinal)) {
				System.out.println("player 1 won");
			} else {
				System.out.println("player 2 won");
			}
		} else {
			System.out.println("player 1 won");
		}
		return name + " has scored " + playerTwoRun + " runs in " + (turns - turnsFinal) + " turns";
	}
}
