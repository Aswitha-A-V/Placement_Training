package june2;

import java.util.Deque;
import java.util.LinkedList;

public class snake {
    private Deque<Position> body;
    public snake(){
        body =new LinkedList<>();
        body.addFirst(new Position(0,0));
    }
    public Position getHead(){
        return body.peekFirst();
    }
    public void addHead(Position P){
        body.addFirst(P);
    }
    public Position removeTail(){
        return body.removeLast();
    }
    public Deque<Position> getBody(){
        return body;
    }

}
