package com.qa.Blackjack;

/**
 * Hello world!
 *
 */
public class App {

	private static int winner;

	public static void main(String[] arg) {
	}

	public int blackjack(int player, int dealer) {
		if (player >= 22 && player <= 31 && dealer >= 22 && dealer <= 31) { // both players bust

			winner = 0;
		}

	else if(player>=22 && player<=31 && dealer>=4 && dealer<=21) { // only player bust
		winner = dealer;
	}
		
	else if(player>=4&&player<=21&&dealer>=22 && dealer<=31) { // only dealer bust
		winner = player;
	}
	else if (player>=4 && player<=21 && dealer>=4 && dealer<=21 && dealer>=player) { // both players valid
		winner = dealer;
	}
	else if (player>=4 && player<=21 && dealer>=4 && dealer<=21 && player>dealer) {
		winner = player;
	}
	else {
		winner = -1;
	}
		return winner;

	}}

/*
 * public static Object[] dealerBust(int i, int j) { if() {
 * 
 * } return winner; }
 * 
 * public static Object playerandDealernotBust(int i, int j) { if() {
 * 
 * } return winner; }
 * 
 * public static Object playerLosesTest(int i, int j) { if() {
 * 
 * } return winner; } }
 */