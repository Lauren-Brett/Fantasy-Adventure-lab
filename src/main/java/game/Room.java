package game;

import enemies.Enemy;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ICollectable treasure;

    public Room(ArrayList<Enemy> enemies, ICollectable treasure){
        this.enemies = enemies;
        this.treasure = treasure;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ICollectable getTreasure() {
        return treasure;
    }


}
