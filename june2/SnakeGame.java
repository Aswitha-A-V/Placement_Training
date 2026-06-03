package june2;

import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class SnakeGame {
   // private int[][] food;
    private Board board;
    private snake snake;
    private foodManager foodManager;
    private int score;
    private Set<Position> occupied;
    private int width;
    private int height;
    public SnakeGame(
            int width,
            int height,
            int[][] food
    ){
        this.width=width;
        this.height=height;
        this.score=0;
       // this.food=food;
        board=new Board(width, height);
        snake=new snake();
        foodManager=new foodManager(food);
        score=0;
        occupied =new HashSet<>();
        occupied.add(new Position(0,0));
    }
    public int move(String direction){
        Position head=snake.getHead();
        int row=head.row;
        int col=head.col;
        switch (direction){
            case "U":
                row--;
                break;
            case "D":
                row++;
                break;
            case "L":
                col--;
                break;
            case "R":
                col++;
                break;
        }
        Position newHead=new Position(row,col);
        if(!board.isValidCell(newHead)){
            return -1;
        }
        Position currentFood= foodManager.getCurrentFood();
        boolean eatFood=false;
        if(currentFood !=null && currentFood.equals(newHead)){
            eatFood=true;
            score++;
            foodManager.consumeFood();
        }
        if(!eatFood){
            Position tail=snake.removeTail();
            occupied.remove(tail);
        }
        if(occupied.contains(newHead)){
            return -1;
        }
        snake.addHead(newHead);
        occupied.add(newHead);
        return score;
    }
    public void displayBoard(){

        char[][] boardView=new char[height][width];
        for (int i = 0; i <height ; i++) {
            for(int j=0;j<width;j++){
                boardView[i][j]='.';
            }

        }
        Position food= foodManager.getCurrentFood();
        if(food!=null){
            boardView[food.getRow()][food.getCol()]='F';
        }
        boolean first=true;
        for(Position p: snake.getBody()){
            if(first){
                boardView[p.getRow()][p.getCol()]='S';
            }else{
                boardView[p.getRow()][p.getCol()]='O';
            }
        }
        System.out.println();
        for (int i = 0; i < height; i++) {
            for(int j=0;j<width;j++){
                System.out.print(boardView[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
