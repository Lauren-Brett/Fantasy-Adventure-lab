package players;

import game.ICollectable;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<ICollectable> bag;
    private Boolean alive;

    public Player(String name){
        this.name = name;
        this.healthPoints = 10;
        this.bag = new ArrayList<ICollectable>();
        this.alive = true;

    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;

    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
        if(this.healthPoints <= 0){
            this.alive = false;
        }
    }

    public ArrayList<ICollectable> getBag() {
        return bag;
    }

    public Boolean getAlive() {
        return this.alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    //
//    public void playerDies(){
//        if(this.healthPoints <= 0){
//            this.alive = false;
//        }
//    }
}
