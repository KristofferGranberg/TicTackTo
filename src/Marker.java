/**
 * Abstract class that represents a marker on a board.
 *
 * Created by kristoffer on 2016-09-30.
 */
public abstract class Marker {


    private Position position;
    protected Board board;

    public Marker(){
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
