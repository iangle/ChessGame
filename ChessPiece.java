/*Isaac Angle
* This is an abstract class that all the chess pieces will inherit from.
* Every chess piece has a location on the board referenced by an x and a y.
* Each piece also has a enum type called PIECE that will default to PAWN
* but will allow for the distinction between pieces
*/

package myPackage;

public abstract class ChessPiece {

    public ChessPiece(int x, int y, PIECE PAWN){

    }

    public abstract void move(int newX, int newY);
    public abstract boolean isAlive();
    public abstract void setAlive(boolean alive);
}
