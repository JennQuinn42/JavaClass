package com.jenn.codeforces;

import java.util.Scanner;

public class FakeChessApp {

	private Pawn player1 = new Pawn();
	private Pawn player2 = new Pawn();
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		FakeChessApp fa = new FakeChessApp();
		fa.runProgram();
	}//end main

	private void runProgram(){

		boolean gameOver = false;
		boolean player1Move = true;
		int p1Location = -1;
		int p2Location = -1;

		System.out.println("What is player one's x and y starting position?"
				+" (Please seperate with spaces.)");
		player1.setPositionX(scan.nextInt());
		player1.setPositionY(scan.nextInt());

		System.out.println("What is player two's x and y starting position?"
				+" (Please seperate with spaces.)");
		player2.setPositionX(scan.nextInt());
		player2.setPositionY(scan.nextInt());

		while(!gameOver){
			if(player1Move){
				if(player1.getPositionX() != 0){
					player1.setPositionX((player1.getPositionX() - 1));
					if(player1.overlapPosition(player2)){
						player1.setPositionX((player1.getPositionX() + 1));
						player1.setPositionY((player1.getPositionY() -1));
						if(player1.overlapPosition(player2)){
							player1.setPositionY((player1.getPositionY() + 1));
						}//choose to skip go
					}//if player 1 would overlap with player 2
				}
				else{
					player1.setPositionY((player1.getPositionY() - 1));
					if(player1.overlapPosition(player2)){
						player1.setPositionY((player1.getPositionY() + 1));
					}//choose to skip go
				}
				player1Move=false;
			}//end player one's go
			else{
				if(player2.getPositionX() >= 0){
					player2.setPositionX((player2.getPositionX() - 1));
					if(player2.overlapPosition(player1)){
						player2.setPositionX((player2.getPositionX() + 1));
						player2.setPositionY((player2.getPositionY() -1));
						if(player2.overlapPosition(player1)){
							player2.setPositionY((player2.getPositionY() + 1));
						}//choose to skip go
					}//if player 2 would overlap with player 1
				}
				else{
					player2.setPositionY((player2.getPositionY() - 1));
					if(player2.overlapPosition(player1)){
						player2.setPositionY((player2.getPositionY() + 1));
					}//choose to skip go
				}
				player1Move=true;
			}//else player two's go

			p1Location = player1.getPositionX() + player1.getPositionY();
			p2Location = player2.getPositionX() + player2.getPositionY();
			if(p1Location == 0){
				System.out.println("Player 1 won!");
				gameOver = true;
			}//end player 1 won
			else if(p2Location == 0){
				System.out.println("Player 2 won!");
				gameOver = true;
			}//end player 2 won
		}//end run game
	}//end run program
}//end run class
