package june2;

public class foodManager {
    private int[][] foods;
    private int index;

    public foodManager(int[][] foods){
        this.foods=foods;
        this.index=0;
    }
    public Position getCurrentFood(){
        if (index >= foods.length)
            return null;
        return new Position(
                foods[index][0],
                foods[index][1]
        );

    }
    public void consumeFood(){
        index++;

    }
}
