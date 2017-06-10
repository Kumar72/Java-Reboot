package data;

import controller.Start;

public class Screen {
	
	Start start = new Start();
	public void homeScreen(int i) {
		String[] line = {" "," "," "," "," "," "," "," "};
		
		switch(i) {
		case 0:
			line[0] = "Welcome to TicTacToe";
			line[4] = "[1] Player vs AI";
			line[5] = "[2] Player vs Player";
			break;
		case 1:
			line[0] = "Player VS AI";
			Player player = start.playerInfo(0);
			line[2] = "Player: \t"+player.getName();
			line[3] = "Symbol: \t"+player.getSymbol();
//			get player info here and display it
//			when player info is filled prompt user to play the game
			line[7] = "[0] Exit";
			break;
		case 2:
			line[0] = "Player VS Player";
			Player p1 = start.playerInfo(1);
			line[2] = "Player: \t"+p1.getName();
			line[3] = "Symbol: \t"+p1.getSymbol();
			Player p2 = start.playerInfo(2);
			line[4] = "Player: \t"+p2.getName();
			line[5] = "Symbol: \t"+p2.getSymbol();
//			get both players and display there info
//			
			line[7] = "[0] Exit";
			break;
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("|                                              |");
		System.out.println("             "+line[0]+"               ");		
		System.out.println("             "+line[1]+"               ");		
		System.out.println("             "+line[2]+"               ");		
		System.out.println("             "+line[3]+"               ");		
		System.out.println("             "+line[4]+"               ");		
		System.out.println("             "+line[5]+"               ");		
		System.out.println("             "+line[6]+"               ");		
		System.out.println("             "+line[7]+"               ");		
		System.out.println("|                                              |");
		System.out.println("------------------------------------------------");
		
	}
	
	public Player playerInfo() {
		Player p1 = new Player();
		return null;
	}
	
	public void gameScreen(Player p1, Player p2) {
		char[] c = new char[9];
		System.out.println("------------------------------------------------");
		System.out.println("|                                              |");
		System.out.println("|  "+p1.getName()+"["+p1.getSymbol()+"]                                     "+p2.getName()+"["+p2.getSymbol()+"]   |");
		System.out.println("|                                              |");
		System.out.println("|                                              |");
		System.out.println("|                  "+c[0]+" | "+c[1]+"  | "+c[2]+"                     |");
		System.out.println("|               --------------                 |");
		System.out.println("|                  "+c[3]+" | "+c[4]+"  | "+c[5]+"                     |");
		System.out.println("|               --------------                 |");
		System.out.println("|                  "+c[6]+" | "+c[7]+"  | "+c[8]+"                     |");
		System.out.println("|                                              |");
		System.out.println("------------------------------------------------");
		
	}
	
	public void endScreen() {
		
	}
	

}
