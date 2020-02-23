package enemies;

import players.Player;

public abstract class Enemy implements IDieable {

    private String name;
    private int healthPoints;
    public int enemyAttackValue;
    private String spellStatus;

    public Enemy(String name, int healthPoints, int enemyAttackValue){
        this.name = name;
        this.healthPoints = healthPoints;
        this.enemyAttackValue = enemyAttackValue;
        this.spellStatus = spellStatus;
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


    public void enemyDies(Enemy enemy){
        if(this.getHealthPoints() <= 0){
            setHealthPoints(0);
            this.enemyAttackValue = 0;
        }
    }

    public void setSpellStatus(String spellStatus) {
        this.spellStatus = spellStatus;
    }

    public void attackPlayer(Player player){
        int startingHealth = player.getHealthPoints();
        int newHealth = startingHealth - this.enemyAttackValue;
           if(newHealth <= 0 ){
            player.setHealthPoints(0);
          } else {
            player.setHealthPoints(newHealth);
        }
    }
}
