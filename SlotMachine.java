import java.awt.Color;
import java.awt.Font;


import sedgewick.StdDraw;

public class SlotMachine {

	public static void main(String[] args) {
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		int playerAccount = 100;
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.3, .1, .1);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.text(.3, .1, "SPIN HERE");
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(.7, .1, "Current Account Balance: $" + playerAccount);
		StdDraw.mouseX();
		StdDraw.mouseY();
		StdDraw.setPenColor(Color.BLACK);
		Font h = new Font("Chalkboard", Font.PLAIN, 25);
		StdDraw.setFont(h);
		StdDraw.text(.5, .95, "WELCOME TO CHARLIE'S BELLAGIO");
		int jackPot = 100;
		int jackPotHouse = 50;
		int updatedJackPot = jackPot;
		StdDraw.text(.5, .85, "CURRENT JACKPOT: $" + jackPot);
		StdDraw.text(.5, .7, "~~~SPIN TO WIN~~~");
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(.1, .5, .1);
		StdDraw.filledCircle(.3, .5, .1);
		StdDraw.filledCircle(.5, .5, .1);
		StdDraw.filledCircle(.7, .5, .1);
		StdDraw.filledCircle(.9, .5, .1);

		while (!StdDraw.mousePressed()) {	
			StdDraw.pause(100);
			while (StdDraw.mousePressed() && playerAccount != 0) {
				StdDraw.setPenColor(Color.WHITE);
				StdDraw.filledRectangle(.5, .3, .5, .1);
				playerAccount = playerAccount - 10;
				StdDraw.setPenColor(Color.WHITE);
				StdDraw.filledRectangle(.7, .1, .3, .1);
				StdDraw.setPenColor(Color.BLACK);
				Font q = new Font("Arial", Font.PLAIN, 20);
				StdDraw.setFont(q);
				StdDraw.text(.7, .1, "Current Account Balance: $" + playerAccount);
				int i = 0;
				while (i < 20) {
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.line(.05, .55, .75, .55);
					StdDraw.line(.05, .45, .75, .45);
					StdDraw.line(.05, .45, .05, .55);
					StdDraw.line(.75, .45, .75, .55);
					StdDraw.line(.05, .55, .75, .55);
					StdDraw.line(.05, .45, .75, .45);
					StdDraw.line(.05, .45, .05, .55);
					StdDraw.line(.75, .45, .75, .55);
					StdDraw.line(.05, .55, .55, .55);
					StdDraw.line(.05, .45, .55, .45);
					StdDraw.line(.05, .45, .05, .55);
					StdDraw.line(.55, .45, .55, .55);
					StdDraw.line(.25, .55, .95, .55);
					StdDraw.line(.25, .45, .95, .45);
					StdDraw.line(.25, .45, .25, .55);
					StdDraw.line(.95, .45, .95, .55);
					StdDraw.line(.25, .55, .75, .55);
					StdDraw.line(.25, .45, .75, .45);
					StdDraw.line(.25, .45, .25, .55);
					StdDraw.line(.75, .45, .75, .55);
					StdDraw.line(.55, .55, .95, .55);
					StdDraw.line(.55, .45, .95, .45);
					StdDraw.line(.55, .45, .55, .55);
					StdDraw.line(.95, .45, .95, .55);
					int red = (int)(Math.random() * 255);
					int green = (int)(Math.random() * 255);
					int blue = (int)(Math.random() * 255);
					StdDraw.setPenColor(new Color(red, green, blue));
					StdDraw.filledCircle(.1, .5, .1);
					StdDraw.filledCircle(.3, .5, .1);
					StdDraw.filledCircle(.5, .5, .1);
					StdDraw.filledCircle(.7, .5, .1);
					StdDraw.filledCircle(.9, .5, .1);
					StdDraw.pause(50);
					i = i + 1;
				}
				int j = 0;
				while (j < 15) {
					int red = (int)(Math.random() * 255);
					int green = (int)(Math.random() * 255);
					int blue = (int)(Math.random() * 255);
					StdDraw.setPenColor(new Color(red, green, blue));
					StdDraw.filledCircle(.1, .5, .1);
					StdDraw.filledCircle(.3, .5, .1);
					StdDraw.filledCircle(.5, .5, .1);
					StdDraw.filledCircle(.7, .5, .1);
					StdDraw.filledCircle(.9, .5, .1);
					StdDraw.pause(400);
					j = j + 1;
				}
				int k = 0;
				while (k < 5) {
					int red = (int)(Math.random() * 255);
					int green = (int)(Math.random() * 255);
					int blue = (int)(Math.random() * 255);
					StdDraw.setPenColor(new Color(red, green, blue));
					StdDraw.filledCircle(.1, .5, .1);
					StdDraw.filledCircle(.3, .5, .1);
					StdDraw.filledCircle(.5, .5, .1);
					StdDraw.filledCircle(.7, .5, .1);
					StdDraw.filledCircle(.9, .5, .1);
					StdDraw.pause(1000);
					k = k + 1;
				}
				int l = 0;
				while (l < 1) {
					int red = (int)(Math.random() * 255);
					int green = (int)(Math.random() * 255);
					int blue = (int)(Math.random() * 255);
					StdDraw.setPenColor(new Color(red, green, blue));
					StdDraw.filledCircle(.1, .5, .1);
					StdDraw.filledCircle(.3, .5, .1);
					StdDraw.filledCircle(.5, .5, .1);
					StdDraw.filledCircle(.7, .5, .1);
					StdDraw.filledCircle(.9, .5, .1);
					l = l + 1;
				}


				StdDraw.setPenColor(Color.WHITE);
				Font f = new Font("Chalkboard", Font.PLAIN, 50);
				StdDraw.setFont(f);
				int random = 0;
				int random1 = 0;
				int random2 = 0;
				int random3 = 0;
				int random4 = 0;
				int circles = 0;
				while (circles < 1) {
					random  = (int)(Math.random() * 5);
					random1 = (int)(Math.random() * 5);
					random2 = (int)(Math.random() * 5);
					random3 = (int)(Math.random() * 5);
					random4 = (int)(Math.random() * 5);
					if (random == 0) {
						StdDraw.text(.1, .5, "$");
					} else if (random == 0) {
						StdDraw.text(.1, .5, "@");
					} else if (random == 1) {
						StdDraw.text(.1, .5, "&");
					} else if (random == 2) {
						StdDraw.text(.1, .5, "#");
					} else if (random == 3) {
						StdDraw.text(.1, .5, "!");
					} else if (random == 4) {
						StdDraw.text(.1, .5, "%");
					}
					if (random1 == 0) {
						StdDraw.text(.3, .5, "$");
					} else if (random1 == 0) {
						StdDraw.text(.3, .5, "@");
					} else if (random1 == 1) {
						StdDraw.text(.3, .5, "&");
					} else if (random1 == 2) {
						StdDraw.text(.3, .5, "#");
					} else if (random1 == 3) {
						StdDraw.text(.3, .5, "!");
					} else if (random1 == 4) {
						StdDraw.text(.3, .5, "%");
					}
					if (random2 == 0) {
						StdDraw.text(.5, .5, "$");
					} else if (random2 == 0) {
						StdDraw.text(.5, .5, "@");
					} else if (random2 == 1) {
						StdDraw.text(.5, .5, "&");
					} else if (random2 == 2) {
						StdDraw.text(.5, .5, "#");
					} else if (random2 == 3) {
						StdDraw.text(.5, .5, "!");
					} else if (random2 == 4) {
						StdDraw.text(.5, .5, "%");
					}
					if (random3 == 0) {
						StdDraw.text(.7, .5, "$");
					} else if (random3 == 0) {
						StdDraw.text(.7, .5, "@");
					} else if (random3 == 1) {
						StdDraw.text(.7, .5, "&");
					} else if (random3 == 2) {
						StdDraw.text(.7, .5, "#");
					} else if (random3 == 3) {
						StdDraw.text(.7, .5, "!");
					} else if (random3 == 4) {
						StdDraw.text(.7, .5, "%");
					}
					if (random4 == 0) {
						StdDraw.text(.9, .5, "$");
					} else if (random4 == 0) {
						StdDraw.text(.9, .5, "@");
					} else if (random4 == 1) {
						StdDraw.text(.9, .5, "&");
					} else if (random4 == 2) {
						StdDraw.text(.9, .5, "#");
					} else if (random4 == 3) {
						StdDraw.text(.9, .5, "!");
					} else if (random4 == 4) {
						StdDraw.text(.9, .5, "%");
					}
					circles = circles + 1;
				}
				StdDraw.setPenColor(Color.BLACK);
				Font g = new Font("Chalkboard", Font.PLAIN, 25);
				StdDraw.setFont(g);
				if (random == random1 && random1 == random2 && random2 == random3 && random3 == random4) {
					StdDraw.setPenColor(Color.RED);
					StdDraw.line(.05, .55, .95, .55);
					StdDraw.line(.05, .45, .95, .45);
					StdDraw.line(.05, .45, .05, .55);
					StdDraw.line(.95, .45, .95, .55);
					StdDraw.text(.5, .25, "CONGRATULATIONS! JACKPOT!");
					playerAccount = playerAccount + updatedJackPot;
					StdDraw.filledRectangle(.5, .35, .3, .05);
					StdDraw.text(.5, .35, "JACKPOT RESET TO HOUSE ORIGINAL: $" + jackPotHouse);
					updatedJackPot = jackPotHouse;
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.7, .1, .3, .1);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(q);
					StdDraw.text(.7, .1, "Current Account Balance: $" + playerAccount);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.5, .83, .35, .05);
					StdDraw.text(.5, .85, "CURRENT JACKPOT: $" + jackPotHouse);
				} else if (random == random1 && random1 == random2 && random2 == random3) {
					StdDraw.setPenColor(Color.RED);
					StdDraw.line(.05, .55, .75, .55);
					StdDraw.line(.05, .45, .75, .45);
					StdDraw.line(.05, .45, .05, .55);
					StdDraw.line(.75, .45, .75, .55);
					StdDraw.text(.5, .25, "NO JACKPOT! 4 IN A ROW: $50 WON");
					playerAccount = playerAccount + 50;
					updatedJackPot += 20;
					StdDraw.text(.5, .35, "JACKPOT INCREASED TO: $" + updatedJackPot);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.7, .1, .3, .1);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(q);
					StdDraw.text(.7, .1, "Current Account Balance: $" + playerAccount);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.5, .83, .35, .05);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(h);
					StdDraw.text(.5, .85, "CURRENT JACKPOT: $" + updatedJackPot);
				} else if (random == random1 && random1 == random2) {
					StdDraw.setPenColor(Color.RED);
					StdDraw.line(.05, .55, .55, .55);
					StdDraw.line(.05, .45, .55, .45);
					StdDraw.line(.05, .45, .05, .55);
					StdDraw.line(.55, .45, .55, .55);
					StdDraw.text(.5, .25, "NO JACKPOT! 3 IN A ROW: $20 WON");
					playerAccount = playerAccount + 20;
					updatedJackPot += 20;
					StdDraw.text(.5, .35, "JACKPOT INCREASED TO: $" + updatedJackPot);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.7, .1, .3, .1);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(q);
					StdDraw.text(.7, .1, "Current Account Balance: $" + playerAccount);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.5, .83, .35, .05);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(h);
					StdDraw.text(.5, .85, "CURRENT JACKPOT: $" + updatedJackPot);
				} else if (random1 == random2 && random2 == random3 && random3 == random4) {
					StdDraw.setPenColor(Color.RED);
					StdDraw.line(.25, .55, .95, .55);
					StdDraw.line(.25, .45, .95, .45);
					StdDraw.line(.25, .45, .25, .55);
					StdDraw.line(.95, .45, .95, .55);
					StdDraw.text(.5, .25, "NO JACKPOT! 4 IN A ROW: $50 WON");
					playerAccount = playerAccount + 50;
					updatedJackPot += 20;
					StdDraw.text(.5, .35, "JACKPOT INCREASED TO: $" + updatedJackPot);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.7, .1, .3, .1);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(q);
					StdDraw.text(.7, .1, "Current Account Balance: $" + playerAccount);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.5, .83, .35, .05);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(h);
					StdDraw.text(.5, .85, "CURRENT JACKPOT: $" + updatedJackPot);
				} else if (random1 == random2 && random2 == random3) {
					StdDraw.setPenColor(Color.RED);
					StdDraw.line(.25, .55, .75, .55);
					StdDraw.line(.25, .45, .75, .45);
					StdDraw.line(.25, .45, .25, .55);
					StdDraw.line(.75, .45, .75, .55);
					StdDraw.text(.5, .25, "NO JACKPOT! 3 IN A ROW: $20 WON");
					playerAccount = playerAccount + 20;
					updatedJackPot += 20;
					StdDraw.text(.5, .35, "JACKPOT INCREASED TO: $" + updatedJackPot);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.7, .1, .3, .1);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(q);
					StdDraw.text(.7, .1, "Current Account Balance: $" + playerAccount);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.5, .83, .35, .05);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(h);
					StdDraw.text(.5, .85, "CURRENT JACKPOT: $" + updatedJackPot);
				} else if (random2 == random3 && random3 == random4) {
					StdDraw.setPenColor(Color.RED);
					StdDraw.line(.35, .55, .95, .55);
					StdDraw.line(.35, .45, .95, .45);
					StdDraw.line(.35, .45, .35, .55);
					StdDraw.line(.95, .45, .95, .55);
					StdDraw.text(.5, .25, "NO JACKPOT! 3 IN A ROW: $20 WON");
					playerAccount = playerAccount + 20;
					updatedJackPot += 20;
					StdDraw.text(.5, .35, "JACKPOT INCREASED TO: $" + updatedJackPot);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.7, .1, .3, .1);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(q);
					StdDraw.text(.7, .1, "Current Account Balance: $" + playerAccount);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.5, .83, .35, .05);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(h);
					StdDraw.text(.5, .85, "CURRENT JACKPOT: $" + updatedJackPot);
				} else if (random == random1 && random3 == random4) {
					StdDraw.setPenColor(Color.RED);
					StdDraw.line(.75, .55, .95, .55);
					StdDraw.line(.75, .45, .95, .45);
					StdDraw.line(.75, .45, .75, .55);
					StdDraw.line(.95, .45, .95, .55);
					StdDraw.line(.05, .55, .25, .55);
					StdDraw.line(.05, .45, .25, .45);
					StdDraw.line(.05, .45, .05, .55);
					StdDraw.line(.25, .45, .25, .55);
					StdDraw.text(.5, .25, "NO JACKPOT! SPLIT 4 IN A ROW: $60 WON");
					playerAccount = playerAccount + 60;
					updatedJackPot += 20;
					StdDraw.text(.5, .35, "JACKPOT INCREASED TO: $" + updatedJackPot);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.7, .1, .3, .1);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(q);
					StdDraw.text(.7, .1, "Current Account Balance: $" + playerAccount);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.5, .83, .35, .05);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(h);
					StdDraw.text(.5, .85, "CURRENT JACKPOT: $" + updatedJackPot);
				} else if (playerAccount < 10) {
					StdDraw.clear();
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.text(.5, .35, "OUT OF MONEY! THANKS FOR PLAYING");
				} else {
					updatedJackPot += 20;
					StdDraw.text(.5, .35, "JACKPOT INCREASED TO: $" + updatedJackPot);
					StdDraw.text(.5, .25, "LOSS! PLEASE DEPOSIT $10");
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledRectangle(.5, .83, .35, .05);
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.setFont(h);
					StdDraw.text(.5, .85, "CURRENT JACKPOT: $" + updatedJackPot);
				}
			} 
		}
	}
}
