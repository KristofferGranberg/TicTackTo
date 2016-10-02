/**
 * Abstract class that represents a marker on a board.
 *
 * Created by kristoffer on 2016-09-30.
 */
public abstract class Marker {

    private Position position;
    private char symbol;

    public Marker(Position p){
        position = p;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public char getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
