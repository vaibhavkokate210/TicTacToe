package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame 
{
	static String computer;
	static String user;
	public static char[] board()
	{
		char ch[]=new char[10];
	    for(char row : ch)
	    {
	            System.out.print(' ');
	    }
	   return ch;
	 }
	public static void chooseSymbol()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter computer player X or O :");
		computer=sc.nextLine();
		System.out.println(computer);
		if(computer.equals("X"))
			user="O";
		else
			user="X";
	}
	public static void main(String[] args) 
	{
		char board[]=board();
		chooseSymbol();
		System.out.println("Computer = "+computer +" User = "+user);
	}

}
