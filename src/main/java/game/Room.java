package game;

import enemies.Enemy;
import players.Player;

import java.util.ArrayList;


public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Treasure> treasures;
    private ArrayList<Player> players;

    public Room(ArrayList<Enemy> enemies, ArrayList<Treasure> treasures, ArrayList<Player> players){
        this.enemies = enemies;
        this.treasures = treasures;
        this.players = players;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasures;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }


//    public void addTreasureToRoom(Treasure treasure){
//        this.treasure.
//    }
//
    public void removeTreasure(Treasure treasure){
        if(getNumberOfPlayers() > 1);
        this.treasures.remove(treasure);
    }   





}
