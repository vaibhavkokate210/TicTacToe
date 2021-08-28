package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame 
{
	static char computer;
	static char user;
	public static char[] board()
	{
		char ch[]=new char[10];
	    for(char row : ch)
	    {
	            System.out.print(' ');
	    }
	    System.out.println();
	   return ch;
	 }
	public static void chooseSymbol()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter computer player X or O :");
		computer=sc.next().charAt(0);
		if(computer=='X')
			user='O';
		else
			user='X';
	}
	
   public static void showBoard(char [][] gameBoard)
   {
	    for(char[] r : gameBoard)
	    {
		        for( char c : r)
		        {
		            System.out.print(c);
		        }
		        System.out.println();
		  }
    } 
	public static void main(String[] args) 
	{
		char board[]=board();
		chooseSymbol();
		System.out.println("Computer = "+computer +" User = "+user);
		char [][] gameBoard = {{'_','|','_','|','_'},{'_', '|', '_','|','_'},{' ','|',' ','|',' '}};
	    showBoard(gameBoard);
	}

}
