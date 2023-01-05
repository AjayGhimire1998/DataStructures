package gameEntriesArray;

public class Scoreboard {
	private int numberOfEntries = 0;
	private GameEntry[] board;

	Scoreboard(int capacity) {
		board = new GameEntry[capacity];

	}

	// attempt to add a new score to the collection if it is high enough
	public void add(GameEntry e) {
		int newScore = e.getScore();

		// checking if the entry is high score
		if (numberOfEntries < board.length || newScore > board[numberOfEntries - 1].getScore()) {
			if (numberOfEntries < board.length) { // no score drops form the board
				numberOfEntries++; // increases number of entries or say adds up

				// shift any lower scores rightward to make room for the new entry
				int j = numberOfEntries - 1;
				while (j > 0 && board[j - 1].getScore() < newScore) {
					board[j] = board[j - 1]; // shifts entry from j-1 to j
					j--; // and decrement j
				}
				board[j] = e; // when done, add new entry
			}
		}
	}
}
