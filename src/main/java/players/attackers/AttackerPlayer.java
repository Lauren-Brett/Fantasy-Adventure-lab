package players.attackers;

import enemies.Enemy;
import players.Player;

public abstract class AttackerPlayer extends Player implements IAttackable {

    private Weapon weapon;

    public AttackerPlayer(String name, Weapon weapon){
        super(name);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    public void attack(Enemy enemy){
        int startingHealth = enemy.getHealthPoints();
        int newHealth = startingHealth - this.weapon.getAttackValue();
        enemy.setHealthPoints(newHealth);
    }




}
