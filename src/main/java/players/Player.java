package players;

import game.ICollectable;
import game.Treasure;

import java.util.ArrayList;

public abstract class Player implements ICollectable {

    private String name;
    private int healthPoints;
    private ArrayList<Treasure> bag;
    private Boolean alive;

    public Player(String name){
        this.name = name;
        this.healthPoints = 10;
        this.bag = new ArrayList<Treasure>();
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

    public ArrayList<Treasure> getBag() {
        return bag;
    }

    public Boolean getAlive() {
        return this.alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

//    public void playerDies(){
//        if(this.healthPoints <= 0){
//            this.alive = false;
//        }
//    }

    public void collect(Treasure treasure){
        this.bag.add(treasure);

    }

}
