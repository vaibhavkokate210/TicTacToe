package com.bridgelabz.tictactoe;

public class TicTacToeGame 
{
	public static char[] board()
	{
		char ch[]=new char[10];
	    for(char row : ch)
	    {
	            System.out.print(' ');
	    }
	   return ch;
	 }
	public static void main(String[] args) 
	{
		char board[]=board();
	}

}
