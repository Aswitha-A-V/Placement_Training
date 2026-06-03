package june2;

import java.util.Objects;

public class Position {
    int row;
    int col;
    public Position(int row,int col){
        this.row=row;
        this.col=col;
    }
    public int getRow()
    {
        return row;
    }
    public int getCol(){
        return col;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Position)){
            return false;
        }
        Position p=(Position) obj;
        return row==p.row && col==p.col;
    }
    @Override
    public int hashCode(){
        return Objects.hash(row,col);
    }
}
