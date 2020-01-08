/*Isaac Angle
* This class allows for the creation of a knight that can
* only move in the shape of an l
*/

package myPackage;

public class Knight extends ChessPiece{

    private int x,y;
    private boolean alive;
    private PIECE KNIGHT;

    //a constructor that inherits from the ChessPiece class and
    //has a location and a type
    public Knight(int x, int y, PIECE KNIGHT){
        super(x,y,KNIGHT);

        //updating x and y values
        this.x = x;
        this.y = y;

        //updating type
        this.KNIGHT = KNIGHT;
    }

    //this method checks the given x and y to see if it
    //is a valid move for a knight and then either updates the position or gives an error message
    @Override
    public void move(int newX, int newY) {

        //if the move is within the l shape
        if((Math.abs(x - newX) == 1) && (Math.abs(y - newY) == 2)){

            //valid move update x and y
            this.x = newX;
            this.y = newY;

        //otherwise not a valid move
        }else{
            System.out.println("Invalid move! ");
        }
    }

    //returns alive
    @Override
    public boolean isAlive() { return alive;}

    //changes the value of alive to the given value
    @Override
    public void setAlive(boolean alive) { this.alive = alive;}

}
