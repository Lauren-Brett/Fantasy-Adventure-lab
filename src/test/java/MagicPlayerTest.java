import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.attackers.Weapon;
import players.magic.Spell;
import players.magic.Wizard;
import players.magic.creatures.Creature;
import players.magic.creatures.Dragon;

import static org.junit.Assert.assertEquals;

public class MagicPlayerTest {

    private Wizard wizard;
    private Spell spell;
    private Dragon dragon;
    private Troll troll;

    @Before
    public void before(){
        spell = new Spell("Fireball", "burn");
        dragon = new Dragon("Jeff", 7) ;
        wizard = new Wizard("Dave", spell, dragon);
        troll = new Troll("Brad", 6, 8);

    }

    @Test
    public void canGetCreatureofPlayer(){
        assertEquals("Jeff", wizard.getCreature().getName());
    }

    @Test
    public void canCastSpellOnEnemy(){
        wizard.castSpell(troll);
        assertEquals("burn", troll.getSpellStatus());
    }


}
