package myPackage;

public class Pawn extends ChessPiece{

    private int x,y,counter = 0;
    private PIECE PAWN;
    private boolean alive = true;

    public Pawn(int x, int y, PIECE PAWN){
        super(x,y,PAWN);

        this.x = x;
        this.y = y;
        this.PAWN = PAWN;



    }

    /*This function allows a pawn to move around the board
    * takes in the new x and y coordinates that the player wants to move to
    * A pawn can only move forward in the y, otherwise it is an invalid move*/
    @Override
    public void move(int newX, int newY) {
        if(this.counter > 0) {
            if (newX == x && newY == (y + 1)) {

                this.x = newX;
                this.y = newY;

            } else {
                System.out.println("That is not a valid move! ");
            }

        } else if(this.counter == 0){

            if((newX == x && (newY > y && newY < y+3))){

                this.x = newX;
                this.y = newY;

                this.counter++;
            }

        }else{
            System.out.println("Invalid move! ");
        }

    }

    @Override
    public boolean isAlive() {
        return alive;
    }

    @Override
    public void setAlive(boolean alive){
        this.alive = alive;

    }
}
