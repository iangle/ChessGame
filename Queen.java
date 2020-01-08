/*Isaac Angle
* This class allows for the creation of a queen piece
* which moves around the board in horizontal, vertical or diagonal
*/

package myPackage;

public class Queen extends ChessPiece{

    private int x,y;
    private boolean alive;
    private PIECE QUEEN;

    //a constructor that inherits from the ChessPiece class
    //which has an x and y location as well as a type of QUEEN
    public Queen(int x, int y, PIECE QUEEN){
        super(x,y,QUEEN);

        //updating x and y values
        this.x = x;
        this.y = y;

        //updating type value
        this.QUEEN = QUEEN;

    }

    //this method allows for the queen to move around the board
    //if the given x and y does not correspond to a valid move then it prints out invalid move
    @Override
    public void move(int newX, int newY) {
        //checks for diagonal movement idea from: https://stackoverflow.com/questions/17639625/how-to-move-pieces-in-chess
        if (Math.abs(this.x - newX) == Math.abs(this.y - newY)) {

            this.x = newX;
            this.y = newY;

            //if move is within a column
            if (x == newX && y != newY) {

                x = newX;
                y = newY;
                // move is within a row
            } else if (x != newX && y == newY) {

                x = newX;
                y = newY;
                //otherwise invalid move for a Queen
            }else{
                System.out.println("invalid move ");
            }
        }
    }

    //this method returns the value of alive to check a pieces board state
    @Override
    public boolean isAlive() { return alive;}

    //this method allows for the program to change the state of the piece
    @Override
    public void setAlive(boolean alive) { this.alive = alive;}

}
