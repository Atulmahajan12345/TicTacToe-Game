package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		
		char[] board = createBoard();
		System.out.println("Enter The Symbol which you want i.e. X or O");
		char playerSymbol = scanner.next().toUpperCase().charAt(0);
		char computerSymbol = determineComputerSymbol(playerSymbol);
		displayBoard(board);
		while(checkFreeSpace(board))
		{			
			playerMove(scanner, board, playerSymbol);
		}
		scanner.close();
	}

	private static boolean checkFreeSpace(char[] board) {
		boolean isFreeSpace = true;
		int numberOfFreeSpace = 0;
		for (int index = 1; index < board.length; index++)
		{
			if(board[index]== '-')
			{
				numberOfFreeSpace++;
			}
		}
		if(numberOfFreeSpace == 0)
		{
			isFreeSpace=false;
		}
		return isFreeSpace;
	}

	private static void playerMove(Scanner scanner, char[] board, char playerSymbol) 
	{
		boolean playerTurn = true;
		while(playerTurn) 
		{
			System.out.println("Enter the Symbol where you want to place your "+playerSymbol);
			int playerMove = scanner.nextInt();
			if(board[playerMove] == '-')
			{
				board[playerMove] = playerSymbol;
				playerTurn = false;
			}
			else
			{
				System.out.println("The mark location is not free");
			}
		}
		displayBoard(board);
	}

	private static void displayBoard(char[] board)
	{
		for (int index = 1; index < board.length; index++) 
		{
			System.out.print(board[index]);
			if(index%3 == 0)
			{
				System.out.println();
			}
			else 
			{
				System.out.print(" | ");
			}
		}
	}

	private static char determineComputerSymbol(char playerSymbol) {
		char computerSymbol = ' ' ;
		if (playerSymbol == 'X')
		{
			computerSymbol = 'O';
		}
		else if (playerSymbol == 'O')
		{
			computerSymbol = 'X';
		}
		else
		{
			System.err.println("You inserted a wrong Symbol");
			
		}
		return computerSymbol;
	}

	private static char[] createBoard()
	{
		char[] board = new char[10];
		for (int index = 1; index < board.length; index++) 
		{
			board[index] = '-';
		}
		return board;
	}


}