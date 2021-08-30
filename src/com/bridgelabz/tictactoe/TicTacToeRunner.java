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
		game.showBoard(board);
		int index=game.checkMove(board,user);
		System.out.println("free Index = "+index);
		game.makeMove(index,board,user);
		game.showBoard(board);
	}

}
