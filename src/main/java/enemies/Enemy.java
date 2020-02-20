package enemies;

import players.Player;
import players.attackers.IAttackable;

public abstract class Enemy implements IAttackable{

    private String name;
    private int healthPoints;
    private int enemyAttackValue;

    public Enemy(String name, int healthPoints, int enemyAttackValue){
        this.name = name;
        this.healthPoints = healthPoints;
        this.enemyAttackValue = enemyAttackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getEnemyAttackValue() {
        return enemyAttackValue;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    // healthPoints from players

    public void attack(Player player){
        int startingHealth = player.getHealthPoints();
        int newHealth = startingHealth - this.enemyAttackValue;
        player.setHealthPoints(newHealth);
    }
}
