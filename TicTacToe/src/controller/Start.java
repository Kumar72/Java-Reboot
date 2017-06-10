package controller;

import java.util.Scanner;

import data.Screen;

public class Start {
	Scanner kb = new Scanner(System.in);
	
	public void run() {
	Screen screen = new Screen();
	screen.homeScreen(0);
	screen.homeScreen(kb.nextInt());
	}
}
