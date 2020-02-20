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

    @Before
    public void before(){
        spell = new Spell("Fireball", "burn");
        dragon = new Dragon("Jeff", 7) ;
        wizard = new Wizard("Dave", spell, dragon);
    }

    @Test
    public void canGetCreatureofPlayer(){
        assertEquals("Jeff", wizard.getCreature().getName());
    }
}
