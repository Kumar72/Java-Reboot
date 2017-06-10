package data;

public class Screen {
	Player player = new Player();
	public void homeScreen(int i) {
		String[] line = {" "," "," "," "," "," "," "};
		
		switch(i) {
		case 0:
			line[0] = "Welcome to TicTacToe";
			line[4] = "1. Player vs AI";
			line[5] = "2. Player vs Player";
			break;
		case 1:
			line[1] = "Player Set up";
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
		System.out.println("|                                              |");
		System.out.println("------------------------------------------------");
		
	}
	
	public void gameScreen(Player p1, Player p2) {
		char[] c = new char[9];
		System.out.println("------------------------------------------------");
		System.out.println("|                                              |");
		System.out.println("|  "+p1.getName()+"["+p1.getSymbol()+"]                                     "+p2.getName()+"["+p2.getSymbol()+"]   |");
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
