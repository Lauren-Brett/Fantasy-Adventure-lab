package game;

import enemies.Enemy;
import enemies.IDieable;
import players.Player;

import java.util.ArrayList;


public class Room implements IDieable {

    private ArrayList<Enemy> enemies;
    private ArrayList<Treasure> treasures;
    private ArrayList<Player> players;

    public Room(ArrayList<Enemy> enemies, ArrayList<Treasure> treasures, ArrayList<Player> players){
        this.enemies = enemies;
        this.treasures = treasures;
        this.players = players;
    }

    public int getEnemies() {
        return this.enemies.size();
    }

//    public int getEnemyAtIndex(int index){
//        return this.enemies.get(index);
//    }

//    public int numberEnemies(){
//        int total = 0;
//////      for(Enemy enemy : this.enemies){
//////         total += enemy;
//////      }
//////      return total;
    ///////////////////////////////////////////////////
//        for (int i = 0; i < getEnemies(); i++){
//            total +=getEnemyAtIndex(i);
//        }
//    }


    public ArrayList<Treasure> getTreasure() {
        return treasures;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }


    public void removeTreasure(Treasure treasure){
        this.treasures.remove(treasure);
    }

    public void removeEnemy(Enemy enemy){

            this.enemies.remove(enemy);

    }
    // enemy has been defeated so player must have got all the treasue
//    public void checkForVictory(){
//        if(allEnemiesDead());
//        removeTreasure();
//        }
//    }


    public void runEnemyAttack(){
        for(Enemy enemy : this.enemies){
            for(Player player : this.players){
                enemy.attackPlayer(player);
            }
        }
    }
    //when all enemies are 0 room is complete
//    public boolean allEnemiesDead(){
//        int enemyStatus = getEnemies();
//        if(enemyStatus >= 0){
//            enemies.clear();
//        }
//        return enemyStatus <= 0;
//
//    }

    public void testallEnemiesDead(){
//        int enemyStatus = getEnemies();
        for(Enemy enemy : enemies){
            if(enemy.getHealthPoints() <= 0){
                removeEnemy(enemy);
            }
        }
    }


    public void enemyDies(Enemy enemy){
        if(enemy.getHealthPoints() <= 0){
            enemy.setHealthPoints(0);
            enemy.enemyAttackValue = 0;
        }
    }




}
