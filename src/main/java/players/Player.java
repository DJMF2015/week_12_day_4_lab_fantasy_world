package players;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName(){
        return name;
    }

    public int getHealthPoints(){
        System.out.println(healthPoints);
        return healthPoints;
    }

    public void setHealthPoints(int points){
        this.healthPoints = points;
    }
}
