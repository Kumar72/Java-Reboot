package controller;

import java.util.Scanner;

import data.Player;
import data.Screen;

public class Start {
	Scanner kb = new Scanner(System.in);
	
	public void run() {
	Screen screen = new Screen();
	screen.homeScreen(0);
	screen.homeScreen(kb.nextInt());
	}
	
	public Player playerInfo(int i) {
		Player player = new Player();
		String x = "";
		if(i == 0) {
			x = "Player Name: ";
		}
		else if(i == 1) {
			x = "Player1 Name: ";
		}
		else if(i == 2) {
			x = "PLayer2 Name: ";
		}
		else{
//			Throw an error prompt here
		}
		System.out.print(x);
		player.setName(kb.next());
		System.out.print("Player Symbol: ");
		player.setSymbol(kb.next().charAt(0));
		return player;
	}
}
