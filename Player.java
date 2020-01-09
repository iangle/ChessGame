
package myPackage;

import java.util.ArrayList;

public abstract class Player {

    private ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>();
    private PLAYERTYPE USER;
    private PIECE BISHOP;

    public Player(PLAYERTYPE USER){

        this.USER = USER;

    }


    private void fillPieces(){

        Bishop bishop1 = new Bishop(2,0,BISHOP);
        Bishop bishop2 = new Bishop(5,0,BISHOP);

        pieces.add(bishop1);

    }
}
