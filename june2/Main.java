package june2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] food={
                {0,1},{0,2},{1,2}
        };
        SnakeGame game= new SnakeGame(3,3,food);
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Enter Direction (U/D/L/R):");
            String direction=sc.next().toUpperCase();
            int result= game.move(direction);
            if(result==-1){
                System.out.println("Game Over!");
                break;
        }
            game.displayBoard();
            System.out.println("Current Score :"+result);
        }

        }
    }

