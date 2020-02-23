import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.magic.Spell;
import players.magic.Wizard;
import players.magic.creatures.Dragon;

import static org.junit.Assert.assertEquals;

public class MagicPlayerTest {

    private Wizard wizard;
    private Spell spell;
    private Dragon dragon;
    private Troll troll;

    @Before
    public void before(){
        spell = new Spell("Fire", 2);
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
        assertEquals(4, troll.getHealthPoints());
    }

    @Test
    public void canKillMagicPlayer(){
        troll.attackPlayer(wizard);
        wizard.defendWithCreature(troll);
        troll.attackPlayer(wizard);
        wizard.defendWithCreature(troll);
        troll.attackPlayer(wizard);
        assertEquals(false, wizard.getAlive());
    }


}
