package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame 
{
	public char[] board()
	{
		char board[]=new char[10];
	    for(int i=0;i<board.length;i++)
	    {
	            board[i]='_';
	    }
	   return board;
	 }
	public char chooseSymbol()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User player X or O :");
		char computer=sc.next().charAt(0);
		return computer;
	}
	
   public  void showBoard(char board[])
   {
	   System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
	   System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
	   System.out.println(board[7]+"|"+board[8]+"|"+board[9]);
    } 
   public  int makeMove(char[] board,char user)
   {
	
	   System.out.println("Select 1 to 9 to make move : ");
	   while(true)
	   {
		   Scanner sc=new Scanner(System.in);
	       int move=sc.nextInt();
	       if(checkBlock(move,board))
	        {
		      return move;
	        }
	       else
	       {
		       System.out.println("position is not empty please enter another position 1 - 9");
	       }
	   }
   }
   public boolean checkBlock(int move,char[] board)
   {
	   if(board[move]=='_')
		   return true;
	   else
	       return false;
   }
}
