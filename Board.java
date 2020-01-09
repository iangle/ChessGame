package myPackage;

import java.util.ArrayList;


public class Board {

    private int size;
    private ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>();

    public Board(int size, ArrayList<ChessPiece> pieces){

        this.size = size;
        this.pieces = pieces;
    }




    //prints out the board
    public void printBoard(){
        for(int i = 0; i < size; i++) {
            System.out.print("#" + " ");
            for(int j = 0; j < size -1; j++) {
                System.out.print("#" + " ");
            }
            System.out.println("");
        }
    }
}
