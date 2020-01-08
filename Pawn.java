/*Isaac Angle
* This class allows for the creation of a pawn
* that extends the chess piece class. The pawn must have
* a location in x and y, a PIECE type, and a move and set/get health function implemented
*/

package myPackage;

public class Pawn extends ChessPiece{

    private int x,y,counter = 0;
    private PIECE PAWN;
    private boolean alive = true;

    //a constructor that makes a pawn with a location of x and y
    //and also a enum PIECE that tells what kind of chess piece it is
    public Pawn(int x, int y, PIECE PAWN){
        super(x,y,PAWN);

        //set the default starting position to the one on the board
        this.x = x;
        this.y = y;

        //set the type to pawn
        this.PAWN = PAWN;



    }

    /*This function allows a pawn to move around the board
    * takes in the new x and y coordinates that the player wants to move to
    * A pawn can only move forward in the y, otherwise it is an invalid move*/
    @Override
    public void move(int newX, int newY) {
        //if the pawn has moved before
        if(this.counter > 0) {
            //then the only valid move is straight in front of the pawn
            if (newX == x && newY == (y + 1)) {

                //move the pawn
                this.x = newX;
                this.y = newY;

            //otherwise invalid move for a pawn
            } else {
                System.out.println("That is not a valid move! ");
            }
        //if the pawn has not moved yet
        } else if(this.counter == 0){

            //if a valid move, including a double move
            if((newX == x && (newY > y && newY < y+3))){

                //then move to that spot
                this.x = newX;
                this.y = newY;

                //and increase the counter of the number of moves
                this.counter++;
            }
        //otherwise this is an invalid move
        }else{
            System.out.println("Invalid move! ");
        }

    }

    //this function returns the value of alive which
    //tells the program whether the chess piece is in play or not
    @Override
    public boolean isAlive() {
        return alive;
    }

    //this function allows the program to change the value of the alive boolean
    @Override
    public void setAlive(boolean alive){this.alive = alive;}
}
