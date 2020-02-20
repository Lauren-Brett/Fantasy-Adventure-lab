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




}
