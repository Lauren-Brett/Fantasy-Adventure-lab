package players;

import enemies.Enemy;
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
        if (getHealthPoints() <= 0);
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


  // make all players attack the enemy
    // override attack method, magicP uses the spell, cleric looses points and
    //can heal himself if he looses 1 point to gain 2

    //ervey player needs to have a 'weapon'
    //  Attackable player has weapon
    //  Healers have heal power when attacked that give themselevs a point
    //  Magics have a spell that takes off enemyP

//    public void attackEnemy(Enemy enemy){
//
//
//        int startingEnemyHealth = enemy.getHealthPoints();
//        int newHealth = startingEnemyHealth - this.player.getAttackValue();
//        enemy.setHealthPoints(newHealth);
//    }

}
