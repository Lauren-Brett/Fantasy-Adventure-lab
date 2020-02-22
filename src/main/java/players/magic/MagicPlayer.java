package players.magic;

import enemies.Enemy;
import players.Player;
import players.magic.creatures.Creature;

public abstract class MagicPlayer extends Player implements ISpellable{

    private Spell spell;
    private Creature creature;

    public MagicPlayer(String name, Spell spell, Creature creature){
        super(name);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return spell;
    }

    public Creature getCreature() {
        return creature;
    }

    public void castSpell(Enemy enemy){

        int startingHealth = enemy.getHealthPoints();
        int newHealth = startingHealth - spell.getSpellEffect();
           if(newHealth <= 0) {
               enemy.setHealthPoints(0);
           } else {
            enemy.setHealthPoints(newHealth);
           }


    }


    public void defendWithCreature(Enemy enemy){
        int startingValue = creature.getDefendValue();
        int endingValue = startingValue - enemy.getEnemyAttackValue();
        creature.setDefendValue(endingValue);
    }

    public void setHealthPoints(int healthPoints) {
        if(this.creature.getDefendValue() <= 0) {
            super.setHealthPoints(healthPoints);
            if(healthPoints <= 0){
                this.setAlive(false);
            }
        }
    }


}
