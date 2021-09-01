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
   public void makeMove(int move,char[] board,char symbol)
   {
	   board[move]=symbol;
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
   public int winOrTie(char board[],char symbol)
   {
	   boolean result=board[1]==symbol&&board[2]==symbol&&board[3]==symbol||board[4]==symbol&&board[5]==symbol&&board[6]==symbol||board[7]==symbol&&board[8]==symbol&&board[9]==symbol||board[1]==symbol&&board[4]==symbol&&board[7]==symbol||board[2]==symbol&&board[5]==symbol&&board[8]==symbol||board[3]==symbol&&board[6]==symbol&&board[9]==symbol||board[1]==symbol&&board[5]==symbol&&board[9]==symbol||board[3]==symbol&&board[5]==symbol&&board[7]==symbol;
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
   public void computerMove(char []board,char compSymbol)
   {
	   int index=checkPosition(board,compSymbol);
	   while(true)
	   {
		   if(index==0)
		   {
			   int pos=(int) ((Math.random()*100)%9)+1;
			   if(board[pos]=='_')
			   {
				   makeMove(pos,board,compSymbol);
			       break;
			   }
			   else
				   continue;
		   }
		   else
		   {
			   makeMove(index,board,compSymbol);
			   break;
		   }
	   }
   }
   public int checkPosition(char []board,char compSymbol)
   {
	   if(board[1]==compSymbol&&board[2]==compSymbol&&checkBlock(3,board))
		   return 3;
	   if(board[1]==compSymbol&&board[3]==compSymbol&&checkBlock(2,board))
		   return 2;
	   if(board[2]==compSymbol&&board[3]==compSymbol&&checkBlock(1,board))
		   return 1;
	   if(board[4]==compSymbol&&board[5]==compSymbol&&checkBlock(6,board))
		   return 6;
	   if(board[4]==compSymbol&&board[6]==compSymbol&&checkBlock(5,board))
		   return 5;
	   if(board[5]==compSymbol&&board[6]==compSymbol&&checkBlock(4,board))
		   return 4;
	   if(board[7]==compSymbol&&board[8]==compSymbol&&checkBlock(9,board))
		   return 9;
	   if(board[7]==compSymbol&&board[9]==compSymbol&&checkBlock(8,board))
		   return 8;
	   if(board[8]==compSymbol&&board[9]==compSymbol&&checkBlock(7,board))
		   return 7;
	   if(board[1]==compSymbol&&board[4]==compSymbol&&checkBlock(7,board))
		   return 7;
	   if(board[1]==compSymbol&&board[7]==compSymbol&&checkBlock(4,board))
		   return 4;
	   if(board[4]==compSymbol&&board[7]==compSymbol&&checkBlock(1,board))
		   return 1;
	   if(board[2]==compSymbol&&board[5]==compSymbol&&checkBlock(8,board))
		   return 8;
	   if(board[2]==compSymbol&&board[8]==compSymbol&&checkBlock(5,board))
		   return 5;
	   if(board[5]==compSymbol&&board[8]==compSymbol&&checkBlock(2,board))
		   return 2;
	   if(board[3]==compSymbol&&board[6]==compSymbol&&checkBlock(9,board))
		   return 9;
	   if(board[3]==compSymbol&&board[9]==compSymbol&&checkBlock(6,board))
		   return 6;
	   if(board[6]==compSymbol&&board[9]==compSymbol&&checkBlock(3,board))
		   return 3;
	   if(board[1]==compSymbol&&board[5]==compSymbol&&checkBlock(9,board))
		   return 9;
	   if(board[1]==compSymbol&&board[9]==compSymbol&&checkBlock(5,board))
		   return 5;
	   if(board[5]==compSymbol&&board[9]==compSymbol&&checkBlock(1,board))
		   return 1;
	   if(board[3]==compSymbol&&board[5]==compSymbol&&checkBlock(7,board))
		   return 7;
	   if(board[3]==compSymbol&&board[7]==compSymbol&&checkBlock(5,board))
		   return 5;
	   if(board[5]==compSymbol&&board[7]==compSymbol&&checkBlock(3,board))
		   return 3;
	return 0;
   }
}
