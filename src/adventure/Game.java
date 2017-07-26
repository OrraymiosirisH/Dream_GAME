package adventure;

import java.util.Scanner;

public class Game {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contin;
		do {
			levelChoice();
			int level = input.nextInt();
			if (level == 1) {
				System.out.println("This Road is known for having pirates, Good luck with it");
				System.out.println(
						"While you are walking you see a dark cave and a big castle, which one would you like to take, (1)For Cave or (2)For Castle?");
				int choice = input.nextInt();
				if (choice == 1) {
					System.out.println(
							"ohhhhhh,you are brave...but your choice will take you to the unknown of this place");
					System.out.println("You see a candle but no way to ligh it, would you like to take it [Y]  for yes ");
					input.nextLine();
					String response = input.nextLine();
					if (response.equalsIgnoreCase("y")) {
						System.out.println("ok here it is but do not forget to find the exit");

					} else {
						System.out.println("ok,but it is too dark here and i do not see where I am going");
						System.out.println("I should probably sit and wait. but If I do I will starve to death");

					}
				} else if (choice == 2) {
					System.out.println("ohhhhhh,you are greedy...a castle, you perhaps want to discover it, alright");
					System.out.println("Open the door? press 1 for yes and 2 for no");
					int castle = input.nextInt();
					if (castle == 1) {
						System.out.println(
								"Wooooww, it is big and there is soo much light, I am sure someone lives here.let's see it");
						System.out.println("This room looks different, let's see what there inside");
						System.out.println(
								"ohhhh there is gold and silver everywhere, let's take some and leave, press 1 to take it or no to leave it!");
						int goldSilver = input.nextInt();
						if (goldSilver == 1) {
							System.out.println(
									"You greedy, that doesnt belong to you, you hear a voice from the wall.I will punish you for this.");
							System.out.println(
									"You get caught and receive a hard punishment because in life you should never take what is not yours.");
						} else if (goldSilver == 2) {
							System.out.println(
									" You are a good man, you hear from the wall, to reward you. I am allowing to take what you want.in life you should always ask");
						}

					} else if (castle == 2) {
						System.out.println("Alright, you decide to give up!");

					}

				}

			} else if (level == 2) {
				System.out.println(
						"This Road is known for having ghosts floating around,looking to hunt. Good luck with it");

				System.out.println(
						"While you are walking you hear voices, but you dont where it is coming from, where are those voices?,you ask yourself! Chose (1)To Follow the voice or (2)Ignore them?");
				int select = input.nextInt();
				if (select == 1) {
					System.out.println("ohhhhhh,you are not afraid...but you dont know who is there");
					System.out.println(
							"You see a nice looking stranger and an ugly man both waving at you, Do you want see the nice or Ugly: Press(1) For NICE (2) For UGLY?");
					input.nextLine();
					int answer = input.nextInt();
					if (answer == 1) {
						System.out.println(
								"The nice looking man covers your eyes and take you to this place where there are lost people like you.");
						System.out.println("This guy is murderer.there is more in life than looks!");

					} else if (answer == 2) {
						System.out.println("The Ugly man comforts you and ask you if you are ok, Hungry etc...");
						System.out.println(
								"So never trust in appearance!!! just because he is ugly does not mean he is bad.");

					}
				} else if (select == 2) {
					System.out.println("Keep walking and be careful");

				}
			}

			else if (level == 3) {
				System.out.println(
						"This Road is known for having monsters disguised as humans,looking to kill and feed. Good luck with it");
				System.out.println(
						"While you are walking you see,two roads but you do know where they may take you .Choose (1)for road 1 or (2) for road 2?");
				int roadSelect = input.nextInt();
				if (roadSelect == 1) {
					System.out
							.println("ohhhhhh,you take the right road and in few miles you will be out of the jungle");

				} else if (roadSelect == 2) {
					System.out.println(
							"After walking a short distance, you see something the shape of human but the look of a creature. you try to run"
									+ " away but you see another two paths. which one would you take?");
					System.out.println("press 1 for left or 2 for right");
					int choiceTwo = input.nextInt();
					if (choiceTwo == 1) {
						System.out.println("You are back to point Zero");

					} else if (choiceTwo == 2) {
						System.out.println("Another creature is still following , and there is where to go.");
						System.out.println(
								"The creature jumped on you, you start screaming and asking for help.Suddenly you wake up, IT IS ALL A DREAM");
					}

				}
			}
			System.out.println("Would you like to play again, press [yes] or [no]");
			contin = input.next();
		} while (contin.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks for playing and have a good day");
	}

	public static void levelChoice() {

		System.out.println(
				".......................................WELCOME TO JUNGLE Adventure Game..............................................");

		System.out.println(
				" You are in a creepy jungle all by youreslf, While you are walking you see a sign posting 3 destinations.");
		System.out.println("Where would you go?: " + "\n"+ " \t " + "to take the first unknown destination press 1.");
		System.out.println(" \t " + "to take the second unknown destination press 2.");
		System.out.println(" \t " + "to take the third unknown destination press 3.");
		System.out.println("Plz choose a level:");
	}

}
