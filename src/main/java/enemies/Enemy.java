package enemies;

import players.Player;
import players.attackers.IAttackable;

public abstract class Enemy {

    private String name;
    private int healthPoints;
    private int enemyAttackValue;
    private String spellStatus;

    public Enemy(String name, int healthPoints, int enemyAttackValue){
        this.name = name;
        this.healthPoints = healthPoints;
        this.enemyAttackValue = enemyAttackValue;
        this.spellStatus = null;
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

    public String getSpellStatus() {
        return spellStatus;
    }

    public void setSpellStatus(String spellStatus) {
        this.spellStatus = spellStatus;
    }

    public void attack(Player player){
        int startingHealth = player.getHealthPoints();
        int newHealth = startingHealth - this.enemyAttackValue;
        player.setHealthPoints(newHealth);
    }
}
