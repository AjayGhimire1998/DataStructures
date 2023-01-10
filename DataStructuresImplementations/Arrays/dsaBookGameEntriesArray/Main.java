package dsaBookGameEntriesArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		GameEntry gameEntry1 = new GameEntry("Ajay1", 90);
		GameEntry gameEntry2 = new GameEntry("Ajay2", 80);
		GameEntry gameEntry3 = new GameEntry("Ajay3", 95);
		GameEntry gameEntry4 = new GameEntry("Ajay4", 100);
		GameEntry gameEntry5 = new GameEntry("Ajay5", 75);

//		GameEntry[] gameEntries = { gameEntry1, gameEntry2, gameEntry3, gameEntry4, gameEntry5 };
//		System.out.println(gameEntry1.getScore());

		Scoreboard scoreboard = new Scoreboard(5);
		scoreboard.add(gameEntry1);
		scoreboard.add(gameEntry2);
		scoreboard.add(gameEntry3);
		scoreboard.add(gameEntry4);
		scoreboard.add(gameEntry5);

		System.out.println(Arrays.toString(scoreboard.board));

		scoreboard.remove(0);
		System.out.println(Arrays.toString(scoreboard.board));

	}
}
