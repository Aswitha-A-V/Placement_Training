package june2;

public class Board {
    private int width;
    private int height;
    public Board(int width , int height){
        this.width=width;
        this.height=height;
    }
    public boolean isValidCell(Position p){
        return p.getRow()>=0 &&
                p.getRow()<height &&
                p.getCol()>=0 &&
                p.getCol()<width;
    }
}
