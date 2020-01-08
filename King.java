/*Isaac Angle
* This class allows for the creation of a king who can move anywhere
* in front or to the side or diagonal as long as its only one space*/
package myPackage;

public class King extends ChessPiece{

    private int x,y;
    private PIECE KING;
    private boolean alive;

    //a constructor that creates a king with an x and y coordinate and a type
    public King(int x, int y, PIECE KING){
        super(x,y,KING);

        //updating x and y values
        this.x = x;
        this.y = y;

        //updating type value
        this.KING = KING;
    }


    @Override
    public void move(int newX, int newY) {
        //if the king moves forward or back one space
        if(newX == (x+1) || newX == (x-1)){
            //valid move update x and y
            this.x = newX;
            this.y = newY;
        //if the king moves left or right on space
        } else if(newY == (y+1) || newY == (y-1)){
            //valid move update x and y
            this.x = newX;
            this.y = newY;

        //otherwise invalid move
        }else{

            System.out.println("Invalid move ");
        }
    }

    //returns the value of alive which tells whether or not the piece is in the game
    @Override
    public boolean isAlive() { return alive;}

    //allows the program to set the alive boolean to something else
    @Override
    public void setAlive(boolean alive) { this.alive = alive;}

}
