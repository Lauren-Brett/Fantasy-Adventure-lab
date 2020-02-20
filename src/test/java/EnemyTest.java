import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.attackers.Knight;
import players.attackers.Weapon;
import players.magic.Spell;
import players.magic.Wizard;
import players.magic.creatures.Creature;
import players.magic.creatures.Ogre;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Orc orc;
    private Knight knight;
    private Weapon weapon;
    private Wizard wizard;
    private Ogre ogre;
    private Spell spell;

    @Before
    public void before(){
        orc = new Orc("Ron", 6, 3);
        weapon = new Weapon("Sword", 3);
        knight = new Knight("Steve", weapon);
        ogre = new Ogre("Dolly", 20);
        spell = new Spell("Ice", "freeze");
        wizard = new Wizard("Fred", spell, ogre);
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(6, orc.getHealthPoints());
    }

    @Test
    public void canAttackPlayer(){
        orc.attack(knight);
        assertEquals(7, knight.getHealthPoints());
    }

    @Test
    public void attacksPlayerWithDefendingCreature(){
        orc.attack(wizard);
        wizard.castSpell(orc);
        wizard.defendWithCreature(orc);
        assertEquals(17, ogre.getDefendValue());
    }


}


