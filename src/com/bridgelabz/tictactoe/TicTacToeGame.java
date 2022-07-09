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
		scanner.close();
		char computerSymbol = determineComputerSymbol(playerSymbol);
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