package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame 
{
	public static int count=0;
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
   public  int checkMove(char[] board,char user)
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
   public void makeMove(int move,char[] board,char user)
   {
	   board[move]=user;
	   count++;
   }
   public boolean checkBlock(int move,char[] board)
   {
	   if(board[move]=='_')
		   return true;
	   else
	       return false;
   }
   public int toss()
   {
	   int result=(int) ((Math.random()*10)%2);
	   return result;
   }
   public int winOrTie(char board[],char user)
   {
	   boolean result=board[1]==user&&board[2]==user&&board[3]==user||board[4]==user&&board[5]==user&&board[6]==user||board[7]==user&&board[8]==user&&board[9]==user||board[1]==user&&board[4]==user&&board[7]==user||board[2]==user&&board[5]==user&&board[8]==user||board[3]==user&&board[6]==user&&board[9]==user||board[1]==user&&board[5]==user&&board[9]==user||board[3]==user&&board[5]==user&&board[7]==user;
	   if(count<9)
	   {
		   if(result)
			   return 1;
		   else
			   return 2;
	   }
	   else if(result)
		 return 1;
	   else if(count==9)
	   {
		   if(result)
			   return 1;
		   else
			   return 0;
	   }
	   return 0;
   }
}
