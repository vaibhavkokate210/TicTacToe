package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeRunner
{
	public static void main(String[] args) 
	{
		while(true)
		{
			int flag;
	    	TicTacToeGame game=new TicTacToeGame();
		    char board[]=game.board();
    		char user=game.chooseSymbol();
	    	char computer=(user=='X')?'O':'X';
		    System.out.println("User Symbol = "+user);
		    System.out.println("Computer Symbol = "+computer);
		    System.out.println("Its time to toss ");
		    int result=game.toss();
		    if(result==0)
		    {
			    System.out.println("User win toss");
		        flag=1;
		    }
		     else
		    {
			     System.out.println("Computer win toss");
		         flag=0;
		    }
		    while(true)
		    {	
		     	if(flag==1)
			    {
		             game.showBoard(board);
		             System.out.println();
		             int index=game.checkMove(board,user);
		             game.makeMove(index,board,user);
		             int cnt=game.winOrTie(board, user);
		             if(cnt==2)
		             {
		                  flag=0;
		                  continue;
		             }
		             else if(game.winOrTie(board, user)==1)
		             {
		           	      game.showBoard(board);
		    	          System.out.println("User wins");
		                  break;
		              }
		              else
		             {
		    	          game.showBoard(board);
		    	          System.out.println("Game tied");
		    	          break;
		             }
			     }
			     else
			     {
			     	game.showBoard(board);
				    System.out.println();
				    game.computerMove(board, computer,user);
				    int cnt=game.winOrTie(board, computer);
				    if(cnt==2)
		             {
		               flag=1;
		               continue;
		              }
		             else if(game.winOrTie(board, computer)==1)
		             {
		           	     game.showBoard(board);
		    	         System.out.println("Compuetr wins");
		                 break;
		             }
		             else
		            {
		    	         game.showBoard(board);
		    	         System.out.println("Board full So Game is tied");
		    	         break;
		            }
			      }
		}
		    System.out.println("Do you want another game : y/n");
		    Scanner sc=new Scanner(System.in);
		    String choice=sc.nextLine();
		    if(choice.equals("n"))
		    {
		    	break;
		    }
	  }
    }
}
