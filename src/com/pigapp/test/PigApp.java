package com.pigapp.test;
import java.util.*;
public class PigApp {
	public static void main(String[] args) {
		int turnCounter = 1,maxScore = 20,turnScore = 0,totalScore = 0;
		char ch;
		System.out.println("Let's Play PIG!\n");
		System.out.println("* See how many turns it takes you to get to 20.\r\n"
				+ "* Turn ends when you hold or roll a 1.\r\n"
				+ "* If you roll a 1, you lose all points for the turn.\r\n"
				+ "* If you hold, you save all points for the turn.\r\n"
				);
		Scanner sc = new Scanner(System.in);
		while(totalScore <= maxScore) {
			System.out.println("\nTURN "+turnCounter);
			while(turnCounter != 0){
				System.out.println("Roll or hold? (r/h):");
				ch = sc.next().charAt(0);
				int rand_no = (int)Math.floor(Math.random()*(6-1+1)+1);
				if(ch == 'r') {
					System.out.println("Die: "+rand_no);
					if(rand_no == 1) {
						System.out.println("Turn over. No score.");
						turnCounter += 1;
						turnScore = 0;
						break;
					}else {
						turnScore += rand_no;
						totalScore += rand_no;
					}
				}else {
					System.out.println("Score for turn: "+turnScore);
					System.out.println("Total Score: "+totalScore);
					turnCounter += 1;
					break;
				}
			}
		}
		sc.close();
	}
}
