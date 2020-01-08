/*Isaac Angle
* This class allows for the creation of a bishop who can only
* move diagonally
*/

package myPackage;

public class Bishop extends ChessPiece{

    private int x,y;
    private PIECE BISHOP;
    private boolean alive;

    //This constructor inherits from the ChesPiece class and
    //has a location in x and y and a type of piece
    public Bishop(int x, int y, PIECE BISHOP){
        super(x,y,BISHOP);

        //updating x and y values
        this.x = x;
        this.y = y;


        //updating type
        this.BISHOP = BISHOP;
    }

    //this method allows the bishop to move diagonally only and checks
    //the given new x and y to make sure they are valid
    @Override
    public void move(int newX, int newY) {
        //checks for diagonal movement, idea from: https://stackoverflow.com/questions/17639625/how-to-move-pieces-in-chess
        if (Math.abs(this.x - newX) == Math.abs(this.y - newY)) {

            this.x = newX;
            this.y = newY;
        //otherwise not a valid bishop move
        }else{

            System.out.println("Invalid move! ");
        }
    }

    //returns the value of alive
    @Override
    public boolean isAlive() {return alive;}

    //changes the value of alive to the new value given
    @Override
    public void setAlive(boolean alive) { this.alive = alive;}
}
