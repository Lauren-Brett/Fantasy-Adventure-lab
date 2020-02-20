package players;

import game.ICollectable;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<ICollectable> bag;

    public Player(String name){
        this.name = name;
        this.healthPoints = 10;
        this.bag = new ArrayList<ICollectable>();

    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public ArrayList<ICollectable> getBag() {
        return bag;
    }
}
