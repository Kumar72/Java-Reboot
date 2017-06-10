package data;

import java.util.List;

public class Player {

	private String name;
	private char symbol;
	private int win, loss;
	private List<Player> friends;
	
	public Player() {	
	}
	
	public Player(String name, char symbol, int win, int loss, List<Player> friends) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.win = win;
		this.loss = loss;
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public List<Player> getFriends() {
		return friends;
	}

	public void setFriends(List<Player> friends) {
		this.friends = friends;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [name=");
		builder.append(name);
		builder.append(", symbol=");
		builder.append(symbol);
		builder.append(", win=");
		builder.append(win);
		builder.append(", loss=");
		builder.append(loss);
		builder.append(", friends=");
		builder.append(friends);
		builder.append("]");
		return builder.toString();
	}

	
}
