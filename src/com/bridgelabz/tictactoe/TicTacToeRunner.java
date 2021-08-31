package com.bridgelabz.tictactoe;

public class TicTacToeRunner
{
	public static void main(String[] args) 
	{
		TicTacToeGame game=new TicTacToeGame();
		char board[]=game.board();
		char user=game.chooseSymbol();
		char computer=(user=='X')?'O':'X';
		System.out.println("User Symbol = "+user);
		System.out.println("Computer Symbol = "+computer);
		System.out.println("Its time to toss ");
		int result=game.toss();
		if(result==0)
			System.out.println("User win toss");
		else
			System.out.println("Computer win toss");
		
		while(true)
		{
		    game.showBoard(board);
		    int index=game.checkMove(board,user);
		    System.out.println("free Index = "+index);
		    game.makeMove(index,board,user);
		    int cnt=game.winOrTie(board, user);
		    if(cnt==2)
		      continue;
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
	}

}
