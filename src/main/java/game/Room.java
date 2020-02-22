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

    public int getEnemies() {
        return enemies.size();
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

    public void addTreasureToRoom(Treasure treasure){
        this.treasures.add(treasure);
    }

    public void removeTreasure(Treasure treasure){
        this.treasures.remove(treasure);
    }
    // battle
    //
    // enemy has been defeated so player must have got all the treasue
    //



    public void runEnemyAttack(){
        for(Enemy enemy : this.enemies){
            for(Player player : this.players){
                enemy.attack(player);
            }
        }
    }
    //when all enemies are 0 room is complete
    public boolean checkAllEnemiesDead(){
        int enemyStatus = getEnemies();
        if(enemyStatus >= 0){
            enemies.clear();
        }
        return enemyStatus <= 0;

//        if(enemyStatus <= 0){
//            enemies.remove(en);
//        }

        //if enenmy healthPoints = 0
        //return enemyStatus
    }



}
