/**
 * Class that represents a TickTackTo board.
 *
 * Created by kristoffer on 2016-09-30.
 */
public class Board {

    private char[][] grid;
    private int gridWidth;
    private int gridHeight;
    private final char emptySpace = '.';
    private final char crossSpace = 'X';
    private final char circleSpace = 'O';


    public Board(int width,int height){

        gridWidth = width;
        gridHeight = height;
        grid = new char[gridWidth][gridHeight];

        for(int x = 0;x < gridWidth;x++){
            for(int y = 0;y < gridHeight;y++){
                grid[x][y] = emptySpace;
            }
        }
    }

    public boolean isEmptySpace(Position p){
        return grid[p.getX()][p.getY()] == emptySpace;
    }
    public void setCrossSpace(Position p){
        grid[p.getX()][p.getY()] = crossSpace;
    }
    public void setCircleSpace(Position p){
        grid[p.getX()][p.getY()] = circleSpace;
    }
    public int getGridWidth(){
        return gridWidth;
    }
    public int getGridHeight() {
        return gridHeight;
    }
    public boolean checkValidPossition(Position p){
        return (p.getY() > gridHeight || p.getY() < 0 || p.getX() > gridWidth
                || p.getX() < 0);
    }

    /**
     * method that checks all possibilities of 3 in a row.
     * @return boolean.
     */
    public boolean isComplete(){

        //checks if circle has 3 in a row
        for(int y = 0;y < gridHeight;y++){
            if(isCrossSpace(new Position(0,y)) && isCrossSpace(new Position
                    (1,y)) && isCrossSpace(new Position(2,y))){
                return true;
            }
        }
        for(int x = 0;x < gridWidth;x++) {
            if (isCrossSpace(new Position(x, 0)) && isCrossSpace(new Position
                    (x, 1)) && isCrossSpace(new Position(x, 2))) {
                return true;
            }
        }
        if(isCrossSpace(new Position(0,0)) && isCrossSpace(new Position
                (1,1))
                && isCrossSpace(new Position(2,2))){
            return true;
        }
        else if(isCrossSpace(new Position(2,0)) && isCrossSpace(new Position
                (1,1))
                && isCrossSpace(new Position(0,2))){
            return true;
        }
        // checks if circle has 3 in a row
        for(int y = 0;y < gridHeight;y++){
            if(isCircleSpace(new Position(0,y)) && isCircleSpace(new
                    Position(1,y)) && isCircleSpace(new Position(2,y))){
                return true;
            }
        }
        for(int x = 0;x < gridWidth;x++) {
            if (isCircleSpace(new Position(x, 0)) && isCircleSpace(new Position
                    (x, 1)) && isCircleSpace(new Position(x, 2))) {
                return true;
            }
        }
        if(isCircleSpace(new Position(0,0)) && isCircleSpace(new Position
                (1,1))
                && isCircleSpace(new Position(2,2))){
            return true;
        }
        else if(isCircleSpace(new Position(2,0)) && isCircleSpace(new Position
                (1,1))
                && isCircleSpace(new Position(0,2))){
            return true;
        }
        else{
            return false;
        }


        /* STUPID SHIT!! should work thou...

        if cross has three in a row.
        // case 1
        if(isCrossSpace(new Position(0,0)) && isCrossSpace(new Position(1,0))
                && isCrossSpace(new Position(2,0))){
            return true;
        }
        // case 2
        else if(isCrossSpace(new Position(0,1)) && isCrossSpace(new Position
                (2,1))
                && isCrossSpace(new Position(2,1))){
            return true;
        }
        // case 3
        else if(isCrossSpace(new Position(0,2)) && isCrossSpace(new Position
                (1,2))
                && isCrossSpace(new Position(2,2))){
            return true;
        }
        // case 4
        else if(isCrossSpace(new Position(0,0)) && isCrossSpace(new Position
                (0,1))
                && isCrossSpace(new Position(0,2))){
            return true;
        }
        // case 5
        else if(isCrossSpace(new Position(1,0)) && isCrossSpace(new Position
                (1,1))
                && isCrossSpace(new Position(1,2))){
            return true;
        }
        // case 6
        else if(isCrossSpace(new Position(2,0)) && isCrossSpace(new Position
                (2,1))
                && isCrossSpace(new Position(2,2))){
            return true;
        }
        // case 7
        else if(isCrossSpace(new Position(0,0)) && isCrossSpace(new Position
                (1,1))
                && isCrossSpace(new Position(2,2))){
            return true;
        }
        // case 8
        else if(isCrossSpace(new Position(2,0)) && isCrossSpace(new Position
                (1,1))
                && isCrossSpace(new Position(0,2))){
            return true;
        }

        //if Circle has three in a row.
        // case 1
        else if(isCircleSpace(new Position(0,0)) && isCircleSpace(new Position
                (1,0))
                && isCircleSpace(new Position(2,0))){
            return true;
        }
        // case 2
        else if(isCircleSpace(new Position(0,1)) && isCircleSpace(new Position
                (2,1))
                && isCircleSpace(new Position(2,1))){
            return true;
        }
        // case 3
        else if(isCircleSpace(new Position(0,2)) && isCircleSpace(new Position
                (1,2))
                && isCircleSpace(new Position(2,2))){
            return true;
        }
        // case 4
        else if(isCircleSpace(new Position(0,0)) && isCircleSpace(new Position
                (0,1))
                && isCircleSpace(new Position(0,2))){
            return true;
        }
        // case 5
        else if(isCircleSpace(new Position(1,0)) && isCircleSpace(new Position
                (1,1))
                && isCircleSpace(new Position(1,2))){
            return true;
        }
        // case 6
        else if(isCircleSpace(new Position(2,0)) && isCircleSpace(new Position
                (2,1))
                && isCircleSpace(new Position(2,2))){
            return true;
        }
        // case 7
        else if(isCircleSpace(new Position(0,0)) && isCircleSpace(new Position
                (1,1))
                && isCircleSpace(new Position(2,2))){
            return true;
        }
        // case 8
        else if(isCircleSpace(new Position(2,0)) && isCircleSpace(new Position
                (1,1))
                && isCircleSpace(new Position(0,2))){
            return true;
        }
        else{
            return false;
        }*/
    }
    public boolean isCrossSpace(Position p){
        return grid[p.getX()][p.getY()] == crossSpace;
    }
    public boolean isCircleSpace(Position p){
        return grid[p.getX()][p.getY()] == circleSpace;
    }
    public String toString(){
        String boardString = "";
        for(int y = 0;y < gridHeight;y++){
            for (int x = 0;x < gridWidth;x++){
                boardString += grid[x][y];
            }
            boardString += '\n';
        }
        return boardString;
    }
}
