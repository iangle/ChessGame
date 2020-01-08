/*Isaac Angle
* This class inherits from the ChessPiece class and allows for the
* program to create a rook piece that can move horizontally or vertically
* but not diagonally
*/

package myPackage;

public class Rook extends ChessPiece{


    private int x,y;
    private PIECE ROOK;
    private boolean alive = true;

    //this constructor inherits from the ChessPiece class and
    //has an x and y location as well as the type of piece it is
    public Rook(int x, int y, PIECE ROOK){
        super(x,y,ROOK);

        //updating x and y values
        this.x = x;
        this.y = y;

        //updating type
        this.ROOK = ROOK;

    }




    //allows the rook to move within a column or a row
    //of where it started, takes in the new x and y and checks to make sure
    //it is a valid move
    @Override
    public void move(int newX, int newY) {
        //if move is within column
        if(x == newX && y != newY){

            x = newX;
            y = newY;
        // move is within a row
        }else if(x != newX && y == newY){

            x = newX;
            y = newY;
            //otherwise invalid move for a rook
        }else{
            System.out.println("Invalid move! ");
        }
    }

    //returns the value of alive that tells whether the chess piece
    //is in play or not
    @Override
    public boolean isAlive() { return alive;}

    //allows the program to change the value of alive to be in play or not
    @Override
    public void setAlive(boolean alive) {this.alive = alive;}
}
