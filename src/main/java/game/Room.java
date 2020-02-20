package game;

import enemies.Enemy;
import players.Player;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private Treasure treasure;
    private ArrayList<Player> players;

    public Room(ArrayList<Enemy> enemies, Treasure treasure, ArrayList<Player> players){
        this.enemies = enemies;
        this.treasure = treasure;
        this.players = players;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }

    public void removeTreasure(Treasure treasure){
        this.treasure = null;
    }

   

}
