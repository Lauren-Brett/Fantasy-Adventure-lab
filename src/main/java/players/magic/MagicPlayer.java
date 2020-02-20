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
        enemy.setSpellStatus(this.spell.getSpellEffect());
    }
}
