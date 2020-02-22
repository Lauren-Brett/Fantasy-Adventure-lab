package players.healers;

import enemies.Enemy;
import players.Player;

public abstract class HealerPlayer extends Player implements IHealable {

    private HealingItem healingItem;

    public HealerPlayer(String name, HealingItem healingItem){
        super(name);
        this.healingItem = healingItem;

    }

    public HealingItem getHealingItem() {
        return healingItem;
    }

    public void heal(Player player){
        int startingHealth = player.getHealthPoints();
        int newHealth = startingHealth + this.healingItem.getHealValue();
        player.setHealthPoints(newHealth);

    }

//    public void attackEnemy(Enemy enemy){
//
//    }
}
