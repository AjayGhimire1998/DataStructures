package dsaBookGameEntriesArray;

public class GameEntry {
	private String playerName;
	private int score;

	GameEntry(String name, int score) {
		this.playerName = name;
		this.score = score;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getScore() {
		return score;
	}

	public String toString() {
		return "(" + playerName + "," + score + ")";
	}

}
