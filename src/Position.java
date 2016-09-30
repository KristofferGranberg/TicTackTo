/**
 * class that represents a position with x and y coordinates.
 *
 * Created by kristoffer on 2016-09-30.
 */
public class Position {
    
    private int x;
    private int y;
    
    public Position(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    /**
     * Method that checks if to positions are the same.
     * @param o the object to compare with.
     * @return true if they are the same, false if they are not
     */
    public boolean equals(Object o) {
        if(!(o instanceof Position)) {
            return false;
        }
        return (((Position)o).getX() == this.getX()) && ((
                (Position)o).getY()
                == this.getY());
    }
    /**
     * Method that creates a hashcode to a position.
     * @return an int that is the hashcode.
     */
    public int hashCode(){
        int hash = 7;
        hash = 71 * hash + this.x;
        hash = 71 * hash + this.y;
        return hash;
    }
}
